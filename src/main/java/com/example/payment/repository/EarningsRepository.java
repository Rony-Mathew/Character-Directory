package com.example.payment.repository;

import com.example.payment.model.Earnings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EarningsRepository extends JpaRepository<Earnings, Long> {
    // Additional query methods specific to Earnings can be defined here
}
