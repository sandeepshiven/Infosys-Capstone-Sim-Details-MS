package com.infytel;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
public class SimDetailsMs implements CommandLineRunner{
	
	@Autowired
	ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(SimDetailsMs.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	

	@Override
	public void run(String... args) throws Exception {
	
	}

}
