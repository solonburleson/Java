package com.solonburleson.dojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.solonburleson.dojos.models.Dojo;
import com.solonburleson.dojos.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepo;
	
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public void create(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public Dojo find(Long id) {
		Optional<Dojo> optional = dojoRepo.findById(id);
		if(optional.isPresent()) {
			Dojo dojo = optional.get();
			return dojo;
		} else {
			return null;
		}
	}
}
