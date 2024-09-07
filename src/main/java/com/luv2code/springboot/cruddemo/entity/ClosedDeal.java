package com.luv2code.springboot.cruddemo.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "closed_deals")
public class ClosedDeal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "deal_id", referencedColumnName = "dealId")
    private Deal deal;

    @Column(name = "closed_time", nullable = false, updatable = false)
    private LocalDateTime closedTime;

    public ClosedDeal() {
    }

    public ClosedDeal(Deal deal) {
        this.deal = deal;
        this.closedTime = LocalDateTime.now();
    }

    // Getters and setters
}
