package com.pingu.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pingu.exercise.entity.City;

public interface CityRepo extends JpaRepository<City, Long> {
}
