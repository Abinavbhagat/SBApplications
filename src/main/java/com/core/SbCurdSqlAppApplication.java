package com.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbCurdSqlAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbCurdSqlAppApplication.class, args);
		System.out.println("SB curd with Sql connected App");
	}

}
