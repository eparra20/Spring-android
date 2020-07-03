package com.edu.claseextraandroid.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
 */
@Configuration
@EnableSwagger2
public class CustomSwagger {


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                //.apis( RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.edu.claseextraandroid.controller"))
                //.paths(PathSelectors.regex("/person"))
                .paths(PathSelectors.any())
                .build();
    }

    public static ApiInfo apiInfo(){
        Contact contact = new Contact("Edu", "", "eparra@digitalhouse.com");
        return new ApiInfoBuilder().description("Proyecto extra de demostracion para mobile android 2020")
                .contact(contact)
                .build();
    }




}
