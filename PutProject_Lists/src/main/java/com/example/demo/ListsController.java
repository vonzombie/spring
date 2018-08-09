package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListsController {

	private List<String> sandwhiches = new ArrayList<String>();
	
	public ListsController() {
		sandwhiches.add("blta");
		sandwhiches.add("italian bmt");
		sandwhiches.add("smores");
		sandwhiches.add("mcdonalds");
		sandwhiches.add("roastbeef");
		sandwhiches.add("tuna");
		sandwhiches.add("muffeleta");
	}
	
	@PutMapping("/sandwhich/{index}") // FINDING AN ITEM BY ITS INDEX AND UPDATING BY THE ITEM NAME
	public String updateSandwhich(@PathVariable int index, @RequestBody String sandwhich) {//localhost:8080/sandwhich/5 <= POSTMAN
	return sandwhiches.set(index, sandwhich); // TESTED WITH POSTMAN > SENDING IN A "PUT" CHANGE AT THE TOP UNDER BODY AND RAW, 
												//AND WILL SHOW WHAT WAS REPLACED AT THE BOTTOM WITH PRETTY
	}
	
}
