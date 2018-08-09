package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController		// 1. TELLING SPRING TO ACCEPT REQUESTS
public class VariableController {

	//PRIVATE VARIABLES
	//STRING IS CAPITALIZED BECAUSE IT IS A CLASS
	//PRIVATE MEANS THAT ONLY VariableController has access
	// TYPICALLY THE BEANS BELOW ARE IN THE MODEL, BUT NOT USING FOR THIS PROJECT
	private String myName = "Jarris";
	private int myAge = 46;
	private boolean myColor = true;
	private double myDollars = 5.50;
	private float myNumber = 1000000f; // FLOATS ARE USED FOR VERY PRECISE MATHEMATICAL EQUATIONS FOR VERY HIGH NUMBERS OR VERY LOW NUMBERS
	
	@GetMapping("/name") //THIS LISTENS TO AN INCOMING GET REQUEST AT THE SPECIFIED PATH
	public String getName( ) {
		return this.myName; // this. IS LIKE SAYING ME AND  REFERS TO THE CLASS IT IS IN, AND REFERS TO VARIABLE CONTROLLER
	}
	
	@GetMapping("/age")
	public int getAge() {
		return this.myAge;
	}
	
		@GetMapping("/color")
	public boolean hasColor() {// BOOLEANS CAN BE REFERRED TO IN A QUESTION FORM hasColor?
		return this.myColor;
	}
		
	@GetMapping("/dollars")
	public double getDollars() {
		return this.myDollars;
	}
	
	@GetMapping("/number")
	public float getNumber() {
		return this.myNumber;
	}
	
	
}
