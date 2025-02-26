package com.example.payment.service;

import com.example.payment.model.Spent;
import com.example.payment.repository.SpentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpentService {

    @Autowired
    private SpentRepository spentRepository;

    public List<Spent> getAllSpent() {
        return spentRepository.findAll();
    }

    public Optional<Spent> getSpentById(Long id) {
        return spentRepository.findById(id);
    }

    public Spent saveSpent(Spent spent) {
        return spentRepository.save(spent);
    }

    public void deleteSpent(Long id) {
        spentRepository.deleteById(id);
    }
}

