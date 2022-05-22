package com.example.PhotographyChest.controllers;



import com.example.PhotographyChest.models.Credentials;

import com.example.PhotographyChest.models.PhotoModel;
import com.example.PhotographyChest.models.PhotosCategories;
import com.example.PhotographyChest.models.Portofolio;

import com.example.PhotographyChest.repositories.CategoriesRepository;
import com.example.PhotographyChest.repositories.CredentialsRepository;
import com.example.PhotographyChest.repositories.PortofolioRepository;

import com.example.PhotographyChest.services.PortofolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Port;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class PortofolioController {
    @Autowired
    private PortofolioService portofolioService;

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Autowired
    private PortofolioRepository portofolioRepository;

    @Autowired
    private CredentialsRepository credentialsRepository;


    @PostMapping("/portofolio/savephoto")
    public ResponseEntity postPhotos(@RequestBody PhotoModel photo){
        Optional<PhotosCategories> cat = categoriesRepository.findById(photo.getCategory());
        PhotosCategories category = cat.get();

        portofolioService.savePhoto(photo.getPhoto(), photo.getPrice(), category);

        return new ResponseEntity<>("Added to portofolio", HttpStatus.CREATED);



    }
    @GetMapping("/portofolio")
    public Iterable<Portofolio> getAll(){
        List<Portofolio>  portofolio = new ArrayList<>();
        portofolio = portofolioRepository.findAll();
        return portofolio;
    }

    @GetMapping("/portofolios/{id}")
    public ResponseEntity<Map<String,Object>> getProductById(@PathVariable("id") Long id) {
        Optional<Credentials> credentials = credentialsRepository.findById(id);
        Map<String,Object> response = new HashMap<>();
        response.put("credentials", credentials);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }



    @DeleteMapping("/portofolio/delete/{id}")
    public void deleteCartItem(@PathVariable("id")long itemId){
        portofolioService.deleteCartItem(itemId);
    }

    @GetMapping("/portofolios/photo/{id}")
    public ResponseEntity<Map<String,Object>> getPhotoById(@PathVariable("id") Long id) {
        Optional<Portofolio> photo = portofolioRepository.findById(id);
        Map<String,Object> response = new HashMap<>();
        response.put("photo", photo);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/edit/portofolio/{id}")
    public void editPortofolio(@RequestBody PhotoModel editedPhoto, @PathVariable long id){
        portofolioService.editPhoto(editedPhoto,id);
    }
}
