package com.swagger.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Config {


	@Bean
	public Docket swaggerConfig() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.build()
				.apiInfo(new ApiInfo("movies api", "movie management api description", 
						"1.0", "http://springswagger.com/termsofuse", 
						new Contact("name", "http://localhost:9001/api/movies", "info@movies.com"), 
						"opensource", "http://springswagger.com/license", 
						Collections.emptyList()));

	}
}
