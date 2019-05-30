package com.solonburleson.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solonburleson.books.models.Book;
import com.solonburleson.books.services.BookService;

@RestController
public class BooksApi {
	private final BookService bookService;
	
	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping("/api/books")
	public List<Book> index(){
		return bookService.allBooks();
	}
	
	@RequestMapping(value="/api/books", method=RequestMethod.POST)
	public Book create(@RequestParam(value="title") String title, @RequestParam(value="desc") String desc, @RequestParam(value="lang") String lang, @RequestParam(value="pages") Integer pages) {
		Book book = new Book(title, desc, lang, pages);
		return bookService.createBook(book);
	}
	
	@RequestMapping("api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		return bookService.findBook(id);
	}
	
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
	public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="desc") String desc, @RequestParam(value="lang") String lang, @RequestParam(value="pages") Integer pages) {
		Book book = bookService.updateBook(id, title, desc, lang, pages);
		return book;		
	}
	
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		bookService.deleteBook(id); 
	}
}
