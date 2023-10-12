package com.example.db_hw_31.service;

import com.example.db_hw_31.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repo repo;

    public String getProductName(String name) {
        return repo.getProductName(name);
    }
}
