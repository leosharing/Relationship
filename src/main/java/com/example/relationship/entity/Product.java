package com.example.relationship.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String productName;
    private String description;
    private int price;

    @OneToMany(mappedBy = "product")
    private List<Order> orders = new ArrayList<>();

    public Product(String productName, String description, int price) {
        this.productName = productName;
        this.description = description;
        this.price = price;
    }
}
