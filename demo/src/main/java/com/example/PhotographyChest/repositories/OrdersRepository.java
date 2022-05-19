package com.example.PhotographyChest.repositories;

import com.example.PhotographyChest.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
