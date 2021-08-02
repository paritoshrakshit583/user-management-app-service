package com.microservices.usermanagementappservice.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket swagConfig() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.microservices.usermanagementappservice"))
				.build().apiInfo(getApiInfo());
	}
	
	public ApiInfo getApiInfo(){
		return new ApiInfo("User Management REST API", 
							"Documentation for using User Management application for 3rd party", 
							"1.0", 
							"Terms of service for using User Management application", 
							new Contact("User Management application", "https://www.google.com/", "paritoshrakshit583@gmail.com"), 
							"MIT License", 
							"https://opensource.org/licences/MIT",
							 new ArrayList<>()
							 );
	}
	
}
