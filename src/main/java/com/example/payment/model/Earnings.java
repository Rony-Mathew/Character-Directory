package com.example.payment.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Earnings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Enumerated(EnumType.STRING)
    private EarningsCategory category;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    // Getters and Setters

    public enum EarningsCategory {
        SALARY, REFUNDS, RETURNS, OTHER
    }

    public enum PaymentType {
        SELF, FAMILY, OTHERS
    }
}
