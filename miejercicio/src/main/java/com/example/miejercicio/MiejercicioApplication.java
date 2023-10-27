package com.example.miejercicio;

import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@SpringBootApplication
@EntityScan(basePackages = "com.example.miejercicio.entities")
public class MiejercicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiejercicioApplication.class, args);
	}
	}


