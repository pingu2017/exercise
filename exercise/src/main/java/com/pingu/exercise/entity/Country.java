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
	private String Code;
	private String Name;
	private String Continent;
	private String Region;
	private double SurfaceArea;
	private int IndepYear;
	private int Population;
}
