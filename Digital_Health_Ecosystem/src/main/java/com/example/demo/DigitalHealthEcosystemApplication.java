package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication	//@configuration @ compoantscan @enableautocongigue
@ComponentScan(basePackages = "com.example.demo.*")
public class DigitalHealthEcosystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalHealthEcosystemApplication.class, args);
	}
}
