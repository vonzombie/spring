package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController // MAKING SURE SPRING KNOWS THIS PAGE EXISTS
public class ListController {

	private List<String> myArrayList = new ArrayList<String>();// AN ARRAY LIST IS A TYPE LIST: NO GOOD TO START WITH
																// ARRAYLIST ITEMS

	public ListController() {// BUILD A CONSTRUCTOR TO GO WITH THE ARRAYLIST
		myArrayList.add("giraffe");
		myArrayList.add("elephant");
		myArrayList.add("dog");
		myArrayList.add("sphinx");
		myArrayList.add("wolf");
		myArrayList.add("cougar");
	}

	@GetMapping("/list") // GETTING THE ENTIRE ARRAYLIST
	public List<String> getList() {
		return this.myArrayList;
	}

	@GetMapping("/list/{index}") // GET AN ITEM OUT OF THE ARRALIST BY ITS INDEX
	public String getList(@PathVariable int index) {
		return myArrayList.get(index);
	}

	private String[] myArray = { "apple", "mine", "sloth", "pizza", "sandwhich", "pineapple" };

	@GetMapping("/array") // GETTING THE WHOLE ARRAY
	public String[] getArray() {
		return this.myArray;
	}

	@GetMapping("/array/{index}") // INDEX IS NO DIFFERENT THAN USING ID
	public String getArrayItem(@PathVariable int index) { // CREATING INDEX AS AN INTEGER BECAUSE IT IS A NUMBER
		return myArray[index];
	}
}
