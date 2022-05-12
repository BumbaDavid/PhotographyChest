package com.example.PhotographyChest.controllers;


import com.example.PhotographyChest.models.Portofolio;

import com.example.PhotographyChest.repositories.PortofolioRepository;

import com.example.PhotographyChest.services.PortofolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PortofolioController {
    @Autowired
    private PortofolioService portofolioService;

    @Autowired
    PortofolioRepository portofolioRepository;


    @PostMapping("/signup")
    public ResponseEntity postCredentials(@RequestBody Portofolio portofolio){

        portofolioService.savePhoto(portofolio);

        return new ResponseEntity<>("Added to portofolio", HttpStatus.CREATED);


    }
    @GetMapping("/portofolio")
    public Iterable<PhotosCategories> getAll(){
        return portofolioRepository.findAll();
    }
}
