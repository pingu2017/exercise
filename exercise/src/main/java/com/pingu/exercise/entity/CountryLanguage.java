package com.pingu.exercise.entity;

import javax.security.auth.callback.LanguageCallback;

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
@Table(name = "countrylanguage")
public class CountryLanguage {

	@Id
	private Long id;
	@Column(name = "CountryCode")
	private String CountryCode;
	private String language;
	@Column(name = "IsOfficial")
	private boolean isOfficial;
	private double percentage;
}
