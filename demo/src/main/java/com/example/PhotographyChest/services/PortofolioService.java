package com.example.PhotographyChest.services;

import com.example.PhotographyChest.models.ActiveAccount;
import com.example.PhotographyChest.models.PhotosCategories;
import com.example.PhotographyChest.models.Portofolio;
import com.example.PhotographyChest.repositories.ActiveAccountRepository;
import com.example.PhotographyChest.repositories.PortofolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PortofolioService {
    @Autowired
    PortofolioRepository portofolioRepository;

    @Autowired
    ActiveAccountRepository activeAccountRepository;

    public void savePhoto(String photo, int price , PhotosCategories category){
        Portofolio p = new Portofolio();
        p.setPhoto(photo);
        p.setPrice(price);
        p.setCategory(category);

        List<ActiveAccount> activeAcc = activeAccountRepository.findAll();
        p.setCredentials(activeAcc.get(0).getActiveAccount());
        portofolioRepository.save(p);

    }

    public void deleteCartItem(long cartItemId) {
        Optional<Portofolio> optionalCart = portofolioRepository.findById(cartItemId);



        Portofolio cart = optionalCart.get();

        portofolioRepository.delete(cart);
    }
}
