package com.example.PhotographyChest.controllers;


import com.example.PhotographyChest.models.ActiveAccount;
import com.example.PhotographyChest.models.Credentials;
import com.example.PhotographyChest.repositories.ActiveAccountRepository;
import com.example.PhotographyChest.repositories.CredentialsRepository;
import com.example.PhotographyChest.services.CredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class CredentialsController {

    @Autowired
    CredentialsService credentialsService;

    @Autowired
    CredentialsRepository credentialsRepository;

    @Autowired
    ActiveAccountRepository activeAccountRepository;

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
    public void account(@RequestBody long id){

        Optional<Credentials> optCredentials = credentialsRepository.findById(id);
        Credentials credentials = optCredentials.get();

        credentialsService.addActiveAccount(credentials);
    }

    @GetMapping("/activeaccount")
    public Iterable<ActiveAccount> activeAccount(@RequestParam(required= false) Long acc){
        List<ActiveAccount> account = new ArrayList<>();
        account  = activeAccountRepository.findAll();
        return account;
    }

}