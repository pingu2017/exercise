package com.pingu.exercise.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pingu.exercise.entity.City;
import com.pingu.exercise.service.CityService;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("exercise")
public class Controller {

	private final CityService cityService;
	@GetMapping("/{word}")
	public String test (@PathVariable String word){
		return word;
	}

	@GetMapping()
	public Page<City> filter(@RequestParam String code, @RequestParam int pop, Pageable pageable){
		return cityService.filter(code, pop, pageable);
	}



}
