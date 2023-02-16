package com.codingdojo.daikichi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@GetMapping("/daikichi")
	public String index() {
		return "Welcome";
	}
	
	@RequestMapping("/daikichi/travel/{city}")
	public String tomorrow(@PathVariable("city") String city) {
	return "Congratulations! You will soon travel to " + city;
}
	
	@RequestMapping("/daikichi/lotto/{id}")
	public String today(@PathVariable("id") int id) {
		if(id % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers";
		} else {
			return "You have enjoyed the fruits of your labor but nmow is a great time to spend time with family and friends";
		}
	}
	
}
