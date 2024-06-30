package com.example.demo.services;

import com.example.demo.repository.Repository;
import com.example.demo.entity.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {

    @Autowired
    private Repository Repository;

    public List<Entity> findAll() {
        return Repository.findAll();
    }


}
