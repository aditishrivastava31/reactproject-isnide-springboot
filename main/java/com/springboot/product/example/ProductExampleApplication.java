package com.springboot.product.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ProductExampleApplication  {
//	public class ProductExampleApplication  extends SpringBootServletInitializer implements WebMvcConfigurer


	public static void main(String[] args) {
		SpringApplication.run(ProductExampleApplication.class, args);
	}

//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/**")
//				.addResourceLocations("classpath:/static/")
//				.resourceChain(true);
	}

//}

