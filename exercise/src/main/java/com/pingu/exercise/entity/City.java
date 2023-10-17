package com.pingu.exercise.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
@Table(name="city")
public class City {

	@Id
	private Long id;

	private String Name;
	private String CountryCode;
	private String District;
	private int Population;

}
