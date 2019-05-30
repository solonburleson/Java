package com.solonburleson.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.solonburleson.lookify.models.Song;
import com.solonburleson.lookify.services.SongService;

@Controller
public class SongController {
	private final SongService songService;
	
	public SongController(SongService songService) {
		this.songService = songService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songs);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "new.jsp";
	}
	
	@RequestMapping(value="/songs/new", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		} else {
			songService.createSong(song);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping("/songs/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Song song = songService.getSong(id);
		model.addAttribute("song", song);
		return "show.jsp";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(@RequestParam("search") String artists) {
		return "redirect:/search/" + artists;
	}
	
	@RequestMapping("/search/{artists}")
	public String searchArtists(@PathVariable("artists") String artists, Model model) {
		List<Song> songByArtists = songService.getByArtists(artists);
		model.addAttribute("artists", artists);
		model.addAttribute("songs", songByArtists);
		return "search.jsp";
	}
	
	@RequestMapping(value="/songs/{id}", method=RequestMethod.DELETE)
	public String deleteSong(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/songs/topTen")
	public String topTen(Model model) {
		List<Song> topTen = songService.topTen();
		model.addAttribute("topTen", topTen);
		return "topTen.jsp";
	}
}
