package com.example.demo.controller;

import com.example.demo.entity.Entity;
import com.example.demo.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Services testServices;

    @GetMapping("/TEST")
    public List<Entity> test() {
        return testServices.findAll();
    }
}
