package com.pingu.exercise.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.pingu.exercise.api.CityFilterDto;
import com.pingu.exercise.repository.CityCustomRepo;
import com.pingu.exercise.repository.CityRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Validated
public class CityService {

	private final CityRepo cityRepo;
	private final CityCustomRepo cityCustomRepo;

	public Page<CityFilterDto> filter(String code, Long pop, Pageable pageable){
		return cityCustomRepo.filter(code, pop, pageable);
	}

}
