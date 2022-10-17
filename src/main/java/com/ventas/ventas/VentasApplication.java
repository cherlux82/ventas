package com.ventas.ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VentasApplication {

	
	public static void main(String[] args) {
		System.out.println("Iniciando APP");
		SpringApplication.run(VentasApplication.class, args);
	}

}
