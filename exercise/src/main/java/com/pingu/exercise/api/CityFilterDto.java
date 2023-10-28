package com.pingu.exercise.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CityFilterDto {
	private String cityName;
	private String countryName;
	private String region;
}
