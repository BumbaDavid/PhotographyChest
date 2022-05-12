package com.example.PhotographyChest.services;

import com.example.PhotographyChest.models.Portofolio;
import com.example.PhotographyChest.repositories.PortofolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortofolioService {
    @Autowired
    PortofolioRepository portofolioRepository;

    public void savePhoto(Portofolio portofolio){
        Portofolio p = new Portofolio();
        p.setPhoto(portofolio.getPhoto());
        p.setPrice(portofolio.getPrice());
        p.setCategory(portofolio.getCategory());

        portofolioRepository.save(p);

    }
}