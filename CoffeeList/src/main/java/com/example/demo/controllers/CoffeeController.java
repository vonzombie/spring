package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Coffee;
import com.example.demo.models.CoffeeRepository;

@RestController
@RequestMapping("/coffee")
@CrossOrigin(origins="http://localhost:4200") // ALLOWS FOR COMMUNICATION BETWEEN ANGULAR AND ECLIPSE
public class CoffeeController {

	@Autowired  //REFERENCE TO THE REPOSITORY
	CoffeeRepository coffeeRepository;
	

	// GETTING ALL COFFEE OBJECTS 
	@GetMapping()
	public ResponseEntity<List<Coffee>> getCoffee(){
		return ResponseEntity.ok(coffeeRepository.findAll());
	}
	
	//ADD A COFFEE OBJECT
	@PostMapping()
	public ResponseEntity<Coffee> addCoffee(@RequestBody Coffee coffee) {
		coffeeRepository.save(coffee);
//		return ResponseEntity.ok().build(); < this  was changed because before an item was added through postmanthe database was empty
		return ResponseEntity.ok(coffee);
		
	}
	//AFTER THE ABOVE IS CREATED GO TO POSTMAN TO TEST GET AND POST > ENTER BELOW IN POST TO CHECK THE ID
	//{
	//"source" : "Brown Herb",
	//"tastesgood" : true
	//}
	
	@DeleteMapping("/{id}")
	public void deleteCoffee(@PathVariable int id) {
		coffeeRepository.deleteById(id);
	}
	
	
}
