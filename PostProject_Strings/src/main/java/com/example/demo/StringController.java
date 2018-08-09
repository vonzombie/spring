package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

	private String sentence = "";
	
	@PostMapping("/sentence/{word}") // THIS ONE APPENDS AND 
	public String addWord(@PathVariable String word) { //localhost:8080/sentence/hello there   <= TESTED WITH POSTMAN DIRECT URL POSTING
		this.sentence += word + " ";
		return sentence;
	}
	
	@PostMapping("/sentence/overwrite/{word}")
	public String overwriteWord(@PathVariable String word) {//USED TO POST WITH THE URL/ NOT A GOOD WAY TO DO BUT GOOD FOR TESTING
		this.sentence = word;
		return sentence;
	}
	
	@PostMapping("/sentence")
	public String addWordFromBody(@RequestBody String word) {// THIS USING THE POST BODY RAW TEXT IN POSTMAN, NOT JSON BECAUSE IT IS NOT MAPPING TO A CLASS
		this.sentence += word + " ";
		return sentence;
	}
	@PostMapping("/sentence/overwrite")
	public String overWriteFromBody(@RequestBody String word) {// localhost:8080/sentence/overwrite <= TESTED IN THE POSTMAN TOP BODY / RAW TEXT/ WHERE INFORMATION CAN BE DIRECTLY INPUT AND OUTPUT AT THE BOTTOM 
		this.sentence = word;
		return sentence;
	}
	}


