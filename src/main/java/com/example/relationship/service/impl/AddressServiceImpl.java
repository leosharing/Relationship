package com.example.relationship.service.impl;

import com.example.relationship.entity.Address;
import com.example.relationship.repo.AddressRepo;
import com.example.relationship.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Override
    public void save(Address address) {

    }

    @Override
    @Transactional
    public void createAddress() {

    }
}
