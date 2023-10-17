package com.pingu.exercise.entity;


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
@Table(name="city")
public class City {

	@Id
	private Long id;

	private String Name;
	private String Countrycode;
	private String District;
	private int Population;

}
