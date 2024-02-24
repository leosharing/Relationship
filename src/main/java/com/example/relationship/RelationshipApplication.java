package com.example.relationship;

import com.example.relationship.entity.User;
import com.example.relationship.service.AddressService;
import com.example.relationship.service.OrderService;
import com.example.relationship.service.ProductService;
import com.example.relationship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RelationshipApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RelationshipApplication.class, args);
    }

    @Autowired
    private AddressService addressService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        addressService.createAddress();
        orderService.createOrder();
        productService.createProduct();
        userService.createUser();
    }
}
