package com.example.payment.repository;

import com.example.payment.model.Spent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpentRepository extends JpaRepository<Spent, Long> {
    // Additional query methods specific to Spent can be defined here
}
