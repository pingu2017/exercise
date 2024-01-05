package com.pingu.exercise.api;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CityFilterDtoTest {

	@Test
	void getCityName() {
		final CityFilterDto cityFilterDto=new CityFilterDto("서울","대한민국", "한국어");
		final String cityName=cityFilterDto.getCityName();
		assertEquals("한국", cityName);
	}

	@Test
	void getCountryName() {
	}

	@Test
	void getRegion() {
	}

	@Test
	void setCityName() {
	}

	@Test
	void setCountryName() {
	}

	@Test
	void setRegion() {
	}

	@Test
	void testEquals() {
	}

	@Test
	void canEqual() {
	}

	@Test
	void testHashCode() {
	}

	@Test
	void testToString() {
	}

	@Test
	void builder() {
	}
}