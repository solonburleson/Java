package com.solonburleson.relationships.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.solonburleson.relationships.models.Person;
import com.solonburleson.relationships.services.LicenseService;
import com.solonburleson.relationships.services.PersonService;

@Controller
public class PersonController {
	private final PersonService personService;
	private final LicenseService licenseService;
	
	public PersonController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	
	@RequestMapping("/person/new")
	public String newLicense(@ModelAttribute("person") Person person) {
		return "newperson.jsp";
	}
	
	@RequestMapping(value="/person", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "newperson.jsp";
		} else {
			personService.create(person);
			return "redirect:/";
		}
	}
}
