package com.example.payment.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Spent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Enumerated(EnumType.STRING)
    private SpentCategory category;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    // Getters and Setters

    public enum SpentCategory {
        FOOD, UTILITIES, RENT, TRAVEL, SHOPPING, INVESTMENT, OTHER
    }

    public enum PaymentType {
        SELF, FAMILY, OTHERS
    }
}
