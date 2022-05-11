package com.example.PhotographyChest;

import com.example.PhotographyChest.models.Credentials;
import com.example.PhotographyChest.models.Portofolio;
import com.example.PhotographyChest.repositories.CredentialsRepository;
import com.example.PhotographyChest.repositories.PortofolioRepository;
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
	CommandLineRunner runner(CredentialsRepository credentialsRepository, PortofolioRepository portofolioRepository){
		return args -> {
			credentialsRepository.save(new Credentials("admin", "admin", 1));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/52/ac/e2/52ace226f596840df6c2ea6fedc06e1f.jpg", , 20);
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/c4/57/58/c457583f2e285a7722826b3be8ee1885.jpg", , 32));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/7e/06/00/7e060036b8733dcb70c49e2500ffbc11.jpg", , 21));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/2d/31/8e/2d318e6bda0a9442f4ebc559b3ec806b.jpg", , 57));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/a2/c8/9f/a2c89fbadf19088a5fa8bfbb4dc524e8.jpg", , 99));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/a0/58/36/a05836173fb0694bc4dbb04b37530735.jpg", , 123));
		};
	}

}
