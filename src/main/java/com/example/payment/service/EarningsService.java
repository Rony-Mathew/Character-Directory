package com.example.payment.service;

import com.example.payment.model.Earnings;
import com.example.payment.repository.EarningsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EarningsService {

    @Autowired
    private EarningsRepository earningsRepository;

    public List<Earnings> getAllEarnings() {
        return earningsRepository.findAll();
    }

    public Optional<Earnings> getEarningsById(Long id) {
        return earningsRepository.findById(id);
    }

    public Earnings saveEarnings(Earnings earnings) {
        return earningsRepository.save(earnings);
    }

    public void deleteEarnings(Long id) {
        earningsRepository.deleteById(id);
    }
}
