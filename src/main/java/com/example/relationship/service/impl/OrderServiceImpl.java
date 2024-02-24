package com.example.relationship.service.impl;

import com.example.relationship.entity.Order;
import com.example.relationship.repo.OrderRepo;
import com.example.relationship.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;
    @Override
    public void save(Order order) {

    }

    @Override
    @Transactional
    public void createOrder() {

    }
}
