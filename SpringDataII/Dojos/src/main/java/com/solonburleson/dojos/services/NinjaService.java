package com.solonburleson.dojos.services;

import org.springframework.stereotype.Service;

import com.solonburleson.dojos.models.Ninja;
import com.solonburleson.dojos.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;
	
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public void create(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
}
