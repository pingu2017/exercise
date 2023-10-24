package com.pingu.exercise.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "city")
public class City {

	@Id
	private Long id;

	private String name;
	@Column(name = "CountryCode")
	private String countryCode;
	private String district;
	private Long population;

}
