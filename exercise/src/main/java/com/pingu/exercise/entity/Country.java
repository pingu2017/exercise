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
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Country")
public class Country {

	@Id
	private Long id;
	private String code;
	private String name;
	private String continent;
	private String region;
	@Column(name = "SurfaceArea")
	private double surfaceArea;
	@Column(name = "IndepYear")
	private int indepYear;
	private Long population;
}
