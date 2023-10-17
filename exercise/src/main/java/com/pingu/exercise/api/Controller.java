package com.pingu.exercise.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("exercise")
public class Controller {

	@GetMapping("/{word}")
	public String test (@PathVariable String word){
		return word;
	}




}
