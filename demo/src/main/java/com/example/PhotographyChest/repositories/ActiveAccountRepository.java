package com.example.PhotographyChest.repositories;

import com.example.PhotographyChest.models.ActiveAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiveAccountRepository extends JpaRepository<ActiveAccount,Long> {
}
