package com.seleniumexpress.employee.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeeConfiguration {
	
	@Bean
	 ModelMapper getMapper() {
		return new ModelMapper();
	}

	@Bean
	 RestTemplate restTemplate() {
		
		return new RestTemplate();
	}
	
	

}
