package com.pingu.exercise.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CityFilterDto {

	private String CountryCode;
	private int Population;
}
