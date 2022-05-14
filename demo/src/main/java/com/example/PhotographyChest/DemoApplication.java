package com.example.PhotographyChest;

import com.example.PhotographyChest.controllers.CategoriesController;
import com.example.PhotographyChest.models.Credentials;
import com.example.PhotographyChest.models.PhotosCategories;
import com.example.PhotographyChest.models.Portofolio;
import com.example.PhotographyChest.repositories.CategoriesRepository;
import com.example.PhotographyChest.repositories.CredentialsRepository;
import com.example.PhotographyChest.repositories.PortofolioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(CredentialsRepository credentialsRepository, CategoriesRepository categoriesRepository,PortofolioRepository portofolioRepository) {
		return args -> {
			categoriesRepository.save(new PhotosCategories("nature", "https://i.imgur.com/n0KMkWL.jpg"));
			categoriesRepository.save(new PhotosCategories("animals", "https://i.imgur.com/Y63QpYx.jpg"));
			categoriesRepository.save(new PhotosCategories("fish", "https://i.imgur.com/7zkDLyV.jpg"));
			categoriesRepository.save(new PhotosCategories("mountain","https://i.imgur.com/XUEKfo1.jpg"));
			categoriesRepository.save(new PhotosCategories("urban","https://i.imgur.com/P3tEJtU.jpg"));
			List<PhotosCategories> values = categoriesRepository.findAll();
			credentialsRepository.save(new Credentials("admin", "admin", 1));
			credentialsRepository.save(new Credentials("olvian", "olvian", 1));
			credentialsRepository.save(new Credentials("david", "david", 0));
			credentialsRepository.save(new Credentials("user123", "user123", 0));
			credentialsRepository.save(new Credentials("thunder", "parola123", 0));
			credentialsRepository.save(new Credentials("hound", "hound", 1));
			List<Credentials> credentials = credentialsRepository.findAll();
			//nature
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/f9/80/7b/f9807b78858cb292f58b929bac29c354.jpg",values.get(2) , 77,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/60/62/7a/60627a5b82440e51502d8f403e30dc16.jpg",values.get(2) , 88,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/27/ba/8a/27ba8a4a09f498839921a6ecca391471.jpg",values.get(2) , 99,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/32/9a/1a/329a1a0d153c7a0820e97ca6582a8972.jpg",values.get(2) , 111,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/1a/00/b5/1a00b535ae62bfaddeafd78432eaa6e7.jpg",values.get(2) , 222,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/ac/e7/04/ace704aee3ddd830081b2c640733bb57.jpg",values.get(2) , 333,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/01/f4/31/01f43160b09aff21dd37674363db182f.jpg",values.get(2) , 444,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/57/9f/ee/579fee603f1c5581c33f2dc4ef95e5a8.jpg",values.get(2) , 555,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/c9/2d/eb/c92deb5db703935c9acfbf11eef94c23.jpg",values.get(2) , 666,credentials.get(0)));
			//animals
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/d5/1c/39/d51c398c36e3300ced867ff0f28e63a1.jpg",values.get(2) , 777,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/da/d9/03/dad9039e67fa8c2522a6983aed8a09e5.jpg",values.get(2) , 888,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/736x/9d/c2/0f/9dc20f86de09aaa449bedd5136d6aebc.jpg",values.get(2) , 999,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/93/f9/f8/93f9f8cfb74c60df2aa2196272196580.jpg",values.get(2) , 1111,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/bd/cf/ff/bdcfffd858b27a1939c71de66280cdc8.jpg",values.get(2) , 2222,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/24/8e/2d/248e2d9f4148639cb094c00102355c65.jpg",values.get(2) , 3333,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/ad/19/05/ad19052c955b4e1fd579c021863dd7ad.jpg",values.get(2) , 4444,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/6c/90/ef/6c90efa2122af77a9147226902aac195.jpg",values.get(2) , 5555,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/67/80/02/678002c6904e5f316426e2c22cfcea09.jpg",values.get(2) , 6666,credentials.get(0)));
			//urban
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/a7/dc/4f/a7dc4fcd552573ae2ca9b598b99d844e.jpg",values.get(2) , 856,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/f2/fe/2a/f2fe2a7c6fe2142e3381b83a5d423474.jpg",values.get(2) , 34,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/d4/53/78/d453789505ea4b44d3ecafa97c90b62f.jpg",values.get(2) , 986,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/89/e7/c4/89e7c4110aaf328770135cf15128d935.jpg",values.get(2) , 87,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/60/10/3e/60103e9a85131910e9934af7ab9ead27.jpg",values.get(2) , 113,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/07/95/66/079566c38e1a80f2c74cabe2b01d093f.jpg",values.get(2) , 187,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/83/80/38/838038f68852c2f410433dabd91cd2dd.jpg",values.get(2) , 533,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/d3/91/59/d391599a9b6818bae205e03713c66f0f.jpg",values.get(2) , 99,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/cb/e4/25/cbe4254fe1d7bf9a14a8a19bcdcd364e.jpg",values.get(2) , 66,credentials.get(0)));
			//mountain
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/7e/67/32/7e6732acd078c4b6d0f390acb9e871dd.jpg",values.get(2) , 201,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/d2/d6/1b/d2d61b3513b87c0880d3ecfb2098b45a.jpg",values.get(2) , 312,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/c3/d3/51/c3d3514b829b910aa21a0644819f3b9f.jpg",values.get(2) , 99,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/cc/0b/9f/cc0b9f17a7ad972df3c043b00e57ec49.jpg",values.get(2) , 70,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/5e/8e/61/5e8e611185f89d45445740c6b3d82e2f.jpg",values.get(2) , 32,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/736x/69/77/9f/69779ff8ee755df91b1e9bafa2e87e93.jpg",values.get(2) , 76,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/b4/8b/e3/b48be3b202a7f4dfa90cacfb445609e4.jpg",values.get(2) , 65,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/bc/13/87/bc13871177b83e9d1062580fc998e314.jpg",values.get(2) , 13,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/736x/01/cb/52/01cb52bff675c32828413d6a263daede.jpg",values.get(2) , 543,credentials.get(0)));
			//fish
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/b8/5d/a9/b85da94d303e27e7f27991d06b53f204.jpg",values.get(2) , 76,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/69/3f/d0/693fd004140924831401457bcc8a97e8.jpg",values.get(2) , 10,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/b7/00/27/b70027e30ce4cfd98d48e637b3efacf4.jpg",values.get(2) , 121,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/93/02/d6/9302d63b7b6461f0bc6a5a59e90a0125.jpg",values.get(2) , 122,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/c0/6a/d3/c06ad357307298b32a44c31639a33138.jpg",values.get(2) , 223,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/a6/8d/60/a68d6079e40e89aca99cedbe707608ec.jpg",values.get(2) , 143,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/2b/db/11/2bdb112417668a9c9c58593f7fe36c97.jpg",values.get(2) , 12,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/8f/0a/49/8f0a493e5ab38c28066e291e35344893.jpg",values.get(2) , 23,credentials.get(0)));
			portofolioRepository.save(new Portofolio("https://i.pinimg.com/564x/23/83/dd/2383ddd7813b08eb1211616d766d1930.jpg",values.get(2) , 13,credentials.get(0)));
			List<Portofolio> portofolios = portofolioRepository.findAll();
			credentials.get(0).setPortofolio(portofolios);



		};
	}

}
