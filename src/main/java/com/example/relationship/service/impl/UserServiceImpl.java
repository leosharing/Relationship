package com.example.relationship.service.impl;

import com.example.relationship.entity.User;
import com.example.relationship.repo.UserRepo;
import com.example.relationship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public void save(User user) {

    }

    @Override
    @Transactional
    public void createUser() {

    }
}
