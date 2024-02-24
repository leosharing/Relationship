package com.example.relationship.service.impl;

import com.example.relationship.entity.Product;
import com.example.relationship.repo.ProductRepo;
import com.example.relationship.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;
    @Override
    public void save(Product product) {

    }

    @Override
    @Transactional
    public void createProduct() {

    }
}
