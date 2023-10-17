package com.pingu.exercise.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public GroupedOpenApi api(){
		return GroupedOpenApi.builder()
			.group("exercise")
			.pathsToMatch("/exercise/**")
			.build();
	}
	@Bean
	public OpenAPI getOpenApi() {

		return new OpenAPI().components(new Components())
			.info(info());

	}

	private Info info(){
		return new Info()
			.title("exerciseEverything")
			.description("시작")
			.version("1.0.0");
	}

}
