package com.example.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
		System.out.println("se crea el cambio para un feature");
		System.out.println("actualiza info en feature uno. desde Mac");
	}

}
