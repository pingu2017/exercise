package com.pingu.exercise.repository;

import static com.pingu.exercise.entity.QCity.*;
import static com.pingu.exercise.entity.QCountry.*;
import static com.pingu.exercise.entity.QCountryLanguage.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import com.pingu.exercise.api.CityFilterDto;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CityCustomRepo {

	private final JPAQueryFactory queryFactory;

	@PersistenceContext
	private final EntityManager em;

	public CityCustomRepo(EntityManager em) {
		this.queryFactory = new JPAQueryFactory(em);
		this.em = em;
	}

	public Page<CityFilterDto> filter(String code, Long pop, Pageable pageable) {
		JPAQuery<CityFilterDto> content = queryFactory
			.selectDistinct(Projections.constructor(
				CityFilterDto.class,
				city.name,
				country.name,
				countryLanguage.language,
				country.region,
				country.indepYear
			))
			.from(city)
			.leftJoin(country).on(city.countryCode.eq(country.code))
			.leftJoin(countryLanguage).on(countryLanguage.CountryCode.eq(country.code))
			.where(city.name.isNotNull().and(findCountryCode(code)).and(countryLanguage.isOfficial.eq(true)));

		int totalCount = content.fetch().size();
		return PageableExecutionUtils.getPage(
			content.offset(pageable.getOffset()).limit(pageable.getPageSize())
				.fetch(), pageable, () -> totalCount);
	}
	public BooleanExpression mostLanguage(){
		return null;
	}

	public BooleanExpression findCountryCode(String code) {
		if (code == null) {
			return null;
		} else {
			return country.code.eq(code);
		}
	}

	public BooleanExpression findPopulation(Long pop) {
		if (pop == null) {
			return null;
		} else {
			return country.population.goe(pop);
		}
	}
}
