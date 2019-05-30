package com.solonburleson.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.solonburleson.books.models.Book;
import com.solonburleson.books.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepository = bookRepo;
	}
	
	public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public Book updateBook(Long id, String title, String desc, String lang, Integer pages) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
    	if(optionalBook.isPresent()) {
    		Book book = bookRepository.findById(id).get();
    		book.setTitle(title);
    		book.setDescription(desc);
    		book.setLanguage(lang);
    		book.setNumberOfPages(pages);
    		bookRepository.save(book);
    		return book;
    	} else {
    		return null;
    	}
    }
    
    public Book updateBook(Book book) {
		bookRepository.save(book);
		return book;
    }
    
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}
