package com.example.PhotographyChest;

import com.example.PhotographyChest.models.Credentials;
import com.example.PhotographyChest.models.Role;
import com.example.PhotographyChest.repositories.CredentialsRepository;
import com.example.PhotographyChest.services.CredentialsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(CredentialsRepository credentialsRepository){
		return args -> {
			credentialsRepository.save(new Credentials("admin", "admin", 1));
		};
	}

}
