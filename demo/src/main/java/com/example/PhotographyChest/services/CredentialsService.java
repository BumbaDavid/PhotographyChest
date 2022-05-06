package com.example.PhotographyChest.services;


import com.example.PhotographyChest.models.Credentials;
import com.example.PhotographyChest.repositories.CredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredentialsService {

    @Autowired
    CredentialsRepository credentialsRepository;

    public void addCredentials(Credentials credentials){
        Credentials c = new Credentials();
        c.setUsername(credentials.getUsername());
        c.setPassword(credentials.getPassword());
        c.setRole(credentials.getRole());

        credentialsRepository.save(c);

    }


}
