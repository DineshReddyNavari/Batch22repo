package com.zensar.olxmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.zensar.olxmaster.controllers.MasterController;

@SpringBootApplication

public class OlxMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxMasterApplication.class, args);
	}

}
