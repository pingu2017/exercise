package com.pingu.exercise.api;

import com.fasterxml.jackson.annotation.JsonGetter;

import io.swagger.v3.oas.annotations.media.Schema;

public interface CityProjectionDto {
	@JsonGetter("도시이름")
	@Schema(description = "도시의 이름입니다")
	String getName();
	@JsonGetter("국가 코드")
	String getCode();
	String getRegion();
}
