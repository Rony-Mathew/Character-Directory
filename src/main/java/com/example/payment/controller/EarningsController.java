package com.example.payment.controller;

import com.example.payment.model.Earnings;
import com.example.payment.service.EarningsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/earnings")
public class EarningsController {

    @Autowired
    private EarningsService earningsService;

    @GetMapping
    public List<Earnings> getAllEarnings() {
        return earningsService.getAllEarnings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Earnings> getEarningsById(@PathVariable Long id) {
        return earningsService.getEarningsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Earnings createEarnings(@RequestBody Earnings earnings) {
        return earningsService.saveEarnings(earnings);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEarnings(@PathVariable Long id) {
        earningsService.deleteEarnings(id);
        return ResponseEntity.noContent().build();
    }
}
