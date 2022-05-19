package com.example.PhotographyChest.services;


import com.example.PhotographyChest.models.Orders;
import com.example.PhotographyChest.models.Portofolio;
import com.example.PhotographyChest.repositories.OrdersRepository;
import com.example.PhotographyChest.repositories.PortofolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private PortofolioRepository portofolioRepository;

    public void saveOrder(long id){
        Optional<Portofolio> optPhoto = portofolioRepository.findById(id);
        Portofolio photo = optPhoto.get();

        Orders o = new Orders();
        o.setStatus("Pending");
        o.setPortofolioId(photo);
        o.setReason("-");

        ordersRepository.save(o);
    }
}
