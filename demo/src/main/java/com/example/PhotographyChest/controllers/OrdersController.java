package com.example.PhotographyChest.controllers;

import com.example.PhotographyChest.models.ActiveAccount;
import com.example.PhotographyChest.models.Orders;
import com.example.PhotographyChest.repositories.ActiveAccountRepository;
import com.example.PhotographyChest.repositories.OrdersRepository;
import com.example.PhotographyChest.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class OrdersController {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private ActiveAccountRepository activeAccountRepository;

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/orders/customer")
    public Iterable<Orders> getOrders(){
        List<Orders> tempOrders = ordersRepository.findAll();
        List<ActiveAccount> account = activeAccountRepository.findAll();
        List<Orders> orders = new ArrayList<>();
        for(Orders o : tempOrders){
            if(o.getBuyer().getId() == account.get(0).getActiveAccount().getId()){
                orders.add(o);
            }
        }

        return orders;
    }

    @PostMapping("/orders/save")
    public void saveOrder(@RequestBody long orderId){

        ordersService.saveOrder(orderId);
    }
}
