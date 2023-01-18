package com.durgesh.DurgeshBlogApplication;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DurgeshBlogApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(DurgeshBlogApplication1Application.class, args);
	}
	
	
	@Bean
	public ModelMapper modleMapper() {
		 return new ModelMapper();
	}


	

}
