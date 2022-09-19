package com.Ulearn.PackageService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class UlearnDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UlearnDemoApplication.class, args);
	
	}

}