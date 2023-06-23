package com.KlasemenLiga.KlasemenLiga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.KlasemenLiga.KlasemenLiga.Entity"})
public class KlasemenLigaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KlasemenLigaApplication.class, args);
	}

}
