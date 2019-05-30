package com.solonburleson.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.solonburleson.lookify.models.Song;
import com.solonburleson.lookify.repositories.SongRepo;

@Service
public class SongService {
	private final SongRepo songRepo;
	
	public SongService(SongRepo songRepo) {
		this.songRepo = songRepo;
	}

	public List<Song> allSongs(){
		return songRepo.findAll();
	}
	
	public Song createSong(Song song) {
		songRepo.save(song);
		return song;
	}
	
	public Song getSong(Long id) {
		Optional<Song> optionalSong = songRepo.findById(id);
		if(optionalSong.isPresent()) {
			Song song = optionalSong.get();
			return song;
		} else {
			return null;
		}
	}
	
	public List<Song> getByArtists(String artists){
		List<Song> artistsSongs = songRepo.findByArtistsContaining(artists);
		return artistsSongs;
	}
	
	public void deleteSong(Long id) {
		songRepo.deleteById(id);
	}
	
	public List<Song> topTen(){
		return songRepo.findTop10ByOrderByRatingDesc();
	}
}
