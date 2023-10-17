package com.pingu.exercise.repository;

import static com.pingu.exercise.entity.QCity.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import com.pingu.exercise.entity.City;
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

	public Page<City> filter(String code, int pop, Pageable pageable) {
		JPAQuery<City> content = queryFactory
			.selectDistinct(city)
			.from(city)
			.where(city.Name.isNotNull().and(findCountryCode(code)).and(findPopulation(pop)));
		int totalCount = content.fetch().size();
		return PageableExecutionUtils.getPage(
			content.offset(pageable.getOffset()).limit(pageable.getPageSize())
				.fetch(), pageable, () -> totalCount);
	}

	public BooleanExpression findCountryCode(String code) {
		if (code.equals("null")) {
			return null;
		}
		return city.Countrycode.eq(code);
	}
	public  BooleanExpression findPopulation(int pop){
		if(pop==0){
			return null;
		}
		return city.Population.goe(pop);
	}
}
