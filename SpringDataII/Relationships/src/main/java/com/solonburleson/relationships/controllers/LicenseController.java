package com.solonburleson.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.solonburleson.relationships.models.License;
import com.solonburleson.relationships.models.Person;
import com.solonburleson.relationships.services.LicenseService;
import com.solonburleson.relationships.services.PersonService;

@Controller
public class LicenseController {
	private final PersonService personService;
	private final LicenseService licenseService;
	
	public LicenseController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	
	@RequestMapping("/license/new")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("personList", persons);
		return "newlicense.jsp";
	}
	
	@RequestMapping(value="/license", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "newlicense.jsp";
		} else {
			String number = "";
			Integer num = licenseService.licenseCount() + 1;
			String numStr = num.toString();
			for(int i = 0; i < (6-numStr.length()); i++) {
				number += "0";
			}
			number += numStr;
			license.setNumber(number);
			licenseService.newLicense(license);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/license")
	public String index(Model model) {
		List<License> all = licenseService.allLicense();
		model.addAttribute("licenses", all);
		return "index.jsp";
	}
}
