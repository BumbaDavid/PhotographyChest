package com.example.PhotographyChest.services;


import com.example.PhotographyChest.models.ActiveAccount;
import com.example.PhotographyChest.models.DeclinedModel;
import com.example.PhotographyChest.models.Orders;
import com.example.PhotographyChest.models.Portofolio;
import com.example.PhotographyChest.repositories.ActiveAccountRepository;
import com.example.PhotographyChest.repositories.OrdersRepository;
import com.example.PhotographyChest.repositories.PortofolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private PortofolioRepository portofolioRepository;
    @Autowired
    private ActiveAccountRepository activeAccountRepository;

    public void saveOrder(long id){
        List<ActiveAccount> account = activeAccountRepository.findAll();
        Optional<Portofolio> optPhoto = portofolioRepository.findById(id);

        Portofolio photo = optPhoto.get();
        Orders o = new Orders();
        o.setStatus("Pending");
        o.setPortofolioId(photo);
        o.setReason("-");
        o.setBuyer(account.get(0).getActiveAccount());
        o.setOwner(photo.getCredentials());

        ordersRepository.save(o);
    }

    public void acceptOrder(long id){
        Optional<Orders> optOrders = ordersRepository.findById(id);
        Orders order = optOrders.get();
        order.setStatus("Accepted(Est time : 24hrs)");

        ordersRepository.save(order);
    }

    public void declineOrder(DeclinedModel declined) {
        Optional<Orders> optOrders = ordersRepository.findById(declined.getOrderId());
        Orders order = optOrders.get();
        order.setStatus("Declined");
        order.setReason(declined.getReason());

        ordersRepository.save(order);
    }
}