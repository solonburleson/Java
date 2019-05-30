package com.solonburleson.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.solonburleson.relationships.models.Person;
import com.solonburleson.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepo;
	
	public PersonService(PersonRepository personRepo) {
		this.personRepo = personRepo;
	}
	
	public List<Person> allPersons(){
		return personRepo.findAll();
	}
	
	public void create(Person person) {
		personRepo.save(person);
	}
}
