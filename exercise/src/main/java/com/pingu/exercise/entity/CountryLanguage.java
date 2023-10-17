package com.pingu.exercise.entity;

import javax.security.auth.callback.LanguageCallback;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "CountryLanguage")
public class CountryLanguage {

	private String CountryCode;
	private String Language;
	private String IsOfficial;
	private double Percentage;
}
