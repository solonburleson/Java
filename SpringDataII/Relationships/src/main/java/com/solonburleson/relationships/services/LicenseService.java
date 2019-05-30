package com.solonburleson.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.solonburleson.relationships.models.License;
import com.solonburleson.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepo;
	
	public LicenseService(LicenseRepository licenseRepo) {
		this.licenseRepo = licenseRepo;
	}
	
	public List<License> allLicense(){
		return licenseRepo.findAll();
	}
}
