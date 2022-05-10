package com.example.PhotographyChest.controllers;


import com.example.PhotographyChest.models.Credentials;
import com.example.PhotographyChest.repositories.CredentialsRepository;
import com.example.PhotographyChest.services.CredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class CredentialsController {

    @Autowired
    private CredentialsService credentialsService;

    @Autowired
    CredentialsRepository credentialsRepository;


    @PostMapping("/signup")
    public ResponseEntity postCredentials(@RequestBody Credentials credentials){

        credentialsService.addCredentials(credentials);

        return new ResponseEntity<>("Added to database", HttpStatus.CREATED);


    }

    @GetMapping("/credentials")
    public Iterable<Credentials>  getCredentials(){
        List<Credentials> cred = new ArrayList<>();

        cred = credentialsRepository.findAll();

        return cred;
    }


    @PostMapping("/account")
    public void account(@RequestBody Credentials credentials){
            Long id = credentials.getId();

            activeAccount(id);
    }

    @GetMapping("/activeaccount")
    public Iterable<Long> activeAccount(@RequestParam(required= false) Long acc){
        Long param;
        param = acc;
        List<Long> accId = new ArrayList<>();
        accId.add(param);
       return accId;
    }

}
