package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

	private List<String> colors = new ArrayList<String>(); // IMPORT ARRAYLIST

	public StringController() { // ADDING A CONSTRUCTOR WITH BEANS
		colors.add("Blue");
		colors.add("Grue");
		colors.add("Purple");
		colors.add("Gold");
		colors.add("Green");
		colors.add("Silver");
	}

	@DeleteMapping("/color/{index}") // REMOVING A COLOR  localhost:8080/color/1 <= TEST WITH POSTMAN WILL GET TRUE OR FALSE AT BOTTOM OF POSTMAN
	public boolean removeColor(@PathVariable int index) {
		try {
			this.colors.remove(index); 
			return true;
		} catch (IndexOutOfBoundsException ex) {
			return false; // IF REMOVING SOMETHING THAT WASNT THERE THEN I WILL GET FALSE
		}
	}

}
