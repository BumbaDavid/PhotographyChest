package com.example.PhotographyChest.controllers;


import com.example.PhotographyChest.models.Credentials;
import com.example.PhotographyChest.repositories.CredentialsRepository;
import com.example.PhotographyChest.services.CredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class CredentialsController {

    @Autowired
    private CredentialsService credentialsService;

    @Autowired
    CredentialsRepository credentialsRepository;


    @PostMapping("/signup")
    public ResponseEntity getCredentials(@RequestBody Credentials credentials){

        credentialsService.addCredentials(credentials);

        return new ResponseEntity<>("Added to cart", HttpStatus.CREATED);


    }

}
