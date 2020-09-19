package com.assignment.customermanagement;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CustomerManagementApplication {

	/**
	 *  Main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementApplication.class, args);
	}
	
	/**
	 * Swagger configuration.
	 *
	 * @return Docket
	 */
	@Bean
	public Docket swaggerConfig() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).paths(PathSelectors.any())
				.build().apiInfo(customerManagementMetaData());
	}

	/**
	 * Sets Meta-data for Swagger Configuration.
	 *
	 * @return the type ApiInfo
	 */
	private ApiInfo customerManagementMetaData() {
		ApiInfo apiInfo = new ApiInfo("Customer Management Rest APIs built with Spring Boot",
				"This is a Swagger Specification for the Rest APIs exposed for Customer Management Application.", "1.0.0", "",
				new Contact("Banga Inc.", "www.banga.com", "banga@gmail.com"), "", "", new ArrayList<>());
		return apiInfo;
	}
}
