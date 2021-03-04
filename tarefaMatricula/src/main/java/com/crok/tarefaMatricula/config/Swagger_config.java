package com.crok.tarefaMatricula.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@ConfigurationProperties(prefix ="app")
public class Swagger_config {
	
	private String swaggerPath;
	
	private String nome;
	
	@Bean
	public Docket allApi() {
		//Adding Header
//		ParameterBuilder aParameterBuilder = new ParameterBuilder();
//		aParameterBuilder.name("Authorization").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
//		List<Parameter> aParameters = new ArrayList<Parameter>();
//		aParameters.add(aParameterBuilder.build());    	
		Set<String> protocols = new HashSet<>();
		protocols.add("http");
		protocols.add("https");
		return new Docket(DocumentationType.SWAGGER_2).host(swaggerPath)
				.groupName("All")
				.apiInfo(apiInfo())
				.select()
				.paths(PathSelectors.any())
				.build()
				.protocols(protocols)
				.ignoredParameterTypes(ApiIgnore.class);
//				.enableUrlTemplating(true).globalOperationParameters(aParameters);
	}
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title(nome)
				.description("Tarefa Matricula")
				.termsOfServiceUrl("http://localhost:8080")
				.license("")
				.licenseUrl("http//localhost:8080")
				.version("2.0")
				.build();
	}	

}
