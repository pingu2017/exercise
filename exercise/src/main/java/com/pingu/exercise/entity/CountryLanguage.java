package com.pingu.exercise.entity;

import javax.security.auth.callback.LanguageCallback;

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
@Table(name = "CountryLanguage")
public class CountryLanguage {

	@Id
	private Long id;
	private String CountryCode;
	private String Language;
	private String IsOfficial;
	private double Percentage;
}
