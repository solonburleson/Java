package com.solonburleson.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.solonburleson.languages.models.Language;
import com.solonburleson.languages.services.LanguageService;

@Controller
public class LangController {
	private final LanguageService langService;
	
	public LangController(LanguageService langService) {
		this.langService = langService;
	}
	
	@RequestMapping("/languages")
	public String index(@ModelAttribute("lang") Language lang, Model model) {
		List<Language> languages = langService.allLang();
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	
	@RequestMapping(value="/languages/new", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("lang") Language lang, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Language> languages = langService.allLang();
			model.addAttribute("languages", languages);
			return "index.jsp";
		} else {
			langService.createLang(lang);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Language lang = langService.findLanguage(id);
		model.addAttribute("lang", lang);
		return "show.jsp";
	}
	
	@RequestMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language lang = langService.findLanguage(id);
		model.addAttribute("lang", lang);
		return "edit.jsp";
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("lang") Language lang, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		} else {
			langService.updateLanguage(lang);
			return "redirect:/languages/" + id;
		}
	}
	
	@RequestMapping(value="languages/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		langService.deleteLanguage(id);
		return "redirect:/languages";
	}
}
