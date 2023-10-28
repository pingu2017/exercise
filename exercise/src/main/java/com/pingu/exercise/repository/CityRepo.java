package com.pingu.exercise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pingu.exercise.api.CityProjectionDto;
import com.pingu.exercise.entity.City;

public interface CityRepo extends JpaRepository<City, Long> {

	@Query(value = "select city.name , country.code , country.region  "
		+ "from city left join country on city.countrycode = country.code "
		+ "where country.code=:code"
		, nativeQuery = true)
	List<CityProjectionDto> getCityOne(@Param("code") String code);
}
