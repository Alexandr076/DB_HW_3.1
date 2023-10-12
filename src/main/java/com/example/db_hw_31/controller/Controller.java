package com.example.db_hw_31.controller;

import com.example.db_hw_31.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Service service;

    @GetMapping("/products/fetch-product")
    @ResponseBody
    public ResponseEntity<String> getProduct(@RequestParam String name) {
        return new ResponseEntity<>(service.getProductName(name), HttpStatus.ACCEPTED);
    }
}
