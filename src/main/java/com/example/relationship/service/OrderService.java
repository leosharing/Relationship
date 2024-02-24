package com.example.relationship.service;

import com.example.relationship.entity.Order;

public interface OrderService {
    void save(Order order);

    void createOrder();
}
