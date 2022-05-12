package com.example.PhotographyChest;

import com.example.PhotographyChest.models.Credentials;
import com.example.PhotographyChest.models.PhotosCategories;
import com.example.PhotographyChest.repositories.CategoriesRepository;
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
	CommandLineRunner runner(CredentialsRepository credentialsRepository, CategoriesRepository categoriesRepository) {
		return args -> {
			credentialsRepository.save(new Credentials("admin", "admin", 1));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/52/ac/e2/52ace226f596840df6c2ea6fedc06e1f.jpg", , 20);
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/c4/57/58/c457583f2e285a7722826b3be8ee1885.jpg", , 32));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/7e/06/00/7e060036b8733dcb70c49e2500ffbc11.jpg", , 21));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/2d/31/8e/2d318e6bda0a9442f4ebc559b3ec806b.jpg", , 57));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/a2/c8/9f/a2c89fbadf19088a5fa8bfbb4dc524e8.jpg", , 99));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/a0/58/36/a05836173fb0694bc4dbb04b37530735.jpg", , 123));

			categoriesRepository.save(new PhotosCategories("nature", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkgXWUMr_Vcw6KhaHLTy0SNSljgWrMIi5rFQ&usqp=CAU"));
			categoriesRepository.save(new PhotosCategories("animals", "https://i.natgeofe.com/k/75ac774d-e6c7-44fa-b787-d0e20742f797/giant-panda-eating_16x9.jpg"));
			categoriesRepository.save(new PhotosCategories("fish", "https://th-thumbnailer.cdn-si-edu.com/NaGo-Ynjy5Op3n9PYq7iySRQAO8=/1000x750/filters:no_upscale()/https://tf-cmsv2-smithsonianmag-media.s3.amazonaws.com/filer/d6/93/d6939718-4e41-44a8-a8f3-d13648d2bcd0/c3npbx.jpg"));
			categoriesRepository.save(new PhotosCategories("mountain","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-DJB112_ASG2aIR8DD6ndQiXIMxPisY8nbQ&usqp=CAU"));
			categoriesRepository.save(new PhotosCategories("urban","https://images.unsplash.com/photo-1507090960745-b32f65d3113a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dXJiYW58ZW58MHx8MHx8&w=1000&q=80"));
		};
	}

}
