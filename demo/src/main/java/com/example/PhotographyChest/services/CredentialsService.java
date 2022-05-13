package com.example.PhotographyChest.services;


import com.example.PhotographyChest.models.ActiveAccount;
import com.example.PhotographyChest.models.Credentials;
import com.example.PhotographyChest.repositories.ActiveAccountRepository;
import com.example.PhotographyChest.repositories.CredentialsRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CredentialsService {

    @Autowired
    CredentialsRepository credentialsRepository;

    @Autowired
    ActiveAccountRepository activeAccountRepository;

    public void addCredentials(Credentials credentials){
        Credentials c = new Credentials();
        c.setUsername(credentials.getUsername());
        c.setPassword(credentials.getPassword());
        c.setRole(credentials.getRole());

        credentialsRepository.save(c);

    }

    public void addActiveAccount(Credentials credentials){

        activeAccountRepository.deleteAll();

        ActiveAccount account = new ActiveAccount();
        account.setActiveAcccount(credentials);

        activeAccountRepository.save(account);
    }

}
