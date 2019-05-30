package com.solonburleson.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.solonburleson.languages.models.Language;

@Repository
public interface LangRepo extends CrudRepository<Language, Long> {
	List<Language> findAll();

}
