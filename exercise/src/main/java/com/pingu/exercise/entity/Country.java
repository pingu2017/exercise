package com.pingu.exercise.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "Country")
public class Country {

	private String Code;
	private String Name;
	private String Continent;
	private String Region;
	private double SurfaceArea;
	private int IndepYear;
	private int Population;
}
