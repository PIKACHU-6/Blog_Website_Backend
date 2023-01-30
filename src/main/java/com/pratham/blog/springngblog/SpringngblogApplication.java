package com.pratham.blog.springngblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringngblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringngblogApplication.class, args);
	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry corsRegistry) {
//				corsRegistry.addMapping("/**")
//						.allowedOrigins("*")
//						.allowedMethods("*")
//						.maxAge(3600L)
//						.allowedHeaders("*")
//						.exposedHeaders("Authorization")
//						.allowCredentials(true);
//			}
//		};
//	}

}
