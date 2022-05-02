package com.prueba;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.jdbc.core.JdbcTemplate;
 
@ComponentScan({"com.prueba"})
@SpringBootApplication
public class PruebaCiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaCiasApplication.class, args);
	}


}
