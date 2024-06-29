package com.example.demo.services;

import com.example.demo.repository.testRepository;
import com.example.demo.entity.testEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {

    @Autowired
    private testRepository testRepository;

    public List<testEntity> findAll() {
        return testRepository.findAll();
    }


}
