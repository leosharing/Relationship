package com.example.relationship.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime orderDate;
    private int grandTotalPrice;

    private LocalDateTime createAt = LocalDateTime.now();
    private LocalDateTime updateAt = LocalDateTime.now();
    private boolean isDeleted;

    @ManyToOne
//    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
//    @JoinColumn(name = "product_id")
    private Product product;

//    public Order(LocalDateTime orderDate, int grandTotalPrice, User user, Product product) {
//        this.orderDate = orderDate;
//        this.grandTotalPrice = grandTotalPrice;
//        this.user = user;
//        this.product = product;
//    }

//    public Order(LocalDateTime orderDate, int grandTotalPrice) {
//        this.orderDate = orderDate;
//        this.grandTotalPrice = grandTotalPrice;
//    }
}
