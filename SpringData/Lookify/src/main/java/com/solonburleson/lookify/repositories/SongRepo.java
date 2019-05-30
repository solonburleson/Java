package com.solonburleson.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.solonburleson.lookify.models.Song;

@Repository
public interface SongRepo extends CrudRepository<Song, Long> {
	List<Song> findAll();
	List<Song> findByArtistsContaining(String search);
	List<Song> findTop10ByOrderByRatingDesc();
}
