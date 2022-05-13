package com.zensar.olxadvertise.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@ComponentScan
public class SwaggConfig {
@Bean
	public Docket getCustomizedDocket() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.zensar.olxadvertise.controllers"))
				.apis(RequestHandlerSelectors.basePackage("com.zensar.olxadvertise.actuator"))
				.build()
				.apiInfo(getapiInfo());
	}

private ApiInfo getapiInfo() {
	
	return new ApiInfo("Olx Advertisemet", "This is Spring boot App", "1.0.0", "termsOfServiceUrl","9999999", "license", "licenseUrl");
}

}
