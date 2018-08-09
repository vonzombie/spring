package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController { //localhost:8080/artists <= RAN IN THE POSTMAN VIA GET

	@Autowired
	ArtistRepository artistRepository; 
	
	@GetMapping("/artists")
	public List<Artist> getArtists(){
		return artistRepository.findAll();
	}
}
