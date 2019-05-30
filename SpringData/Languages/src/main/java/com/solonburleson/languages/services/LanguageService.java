package com.solonburleson.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.solonburleson.languages.models.Language;
import com.solonburleson.languages.repositories.LangRepo;

@Service
public class LanguageService {
	private final LangRepo langRepo;
	
	public LanguageService(LangRepo langRepo) {
		this.langRepo = langRepo;
	}
	
	public List<Language> allLang(){
		return langRepo.findAll();
	}
	
	public Language createLang(Language l) {
		return langRepo.save(l);
	}
	
	public Language findLanguage(Long id) {
		Optional<Language> optionalLang = langRepo.findById(id);
		if(optionalLang.isPresent()) {
			return optionalLang.get();
		} else {
			return null;
		}
	}
	
	public Language updateLanguage(Language lang) {
		langRepo.save(lang);
		return lang;
	}
	
	public void deleteLanguage(Long id) {
		langRepo.deleteById(id);
	}
}
