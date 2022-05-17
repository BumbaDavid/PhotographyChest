package com.example.PhotographyChest.controllers;


import com.example.PhotographyChest.models.Portofolio;

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
    private PortofolioRepository portofolioRepository;

    @Autowired
    private CredentialsRepository credentialsRepository;


    @PostMapping("/savephoto")
    public ResponseEntity postPhotos(@RequestBody Portofolio portofolio){

        portofolioService.savePhoto(portofolio);

        return new ResponseEntity<>("Added to portofolio", HttpStatus.CREATED);


    }
    @GetMapping("/portofolio")
    public Iterable<Portofolio> getAll(){
        return portofolioRepository.findAll();
    }

    @DeleteMapping("/portofolios/delete/{id}")
    public void deletePhoto(@PathVariable("id") long itemId){
        portofolioService.deletePhoto(itemId);
    }
}
