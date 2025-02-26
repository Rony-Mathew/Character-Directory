package com.example.payment.controller;

import com.example.payment.model.Spent;
import com.example.payment.service.SpentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/spent")
public class SpentController {

    @Autowired
    private SpentService spentService;

    @GetMapping
    public List<Spent> getAllSpent() {
        return spentService.getAllSpent();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Spent> getSpentById(@PathVariable Long id) {
        return spentService.getSpentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Spent createSpent(@RequestBody Spent spent) {
        return spentService.saveSpent(spent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSpent(@PathVariable Long id) {
        spentService.deleteSpent(id);
        return ResponseEntity.noContent().build();
    }
}
