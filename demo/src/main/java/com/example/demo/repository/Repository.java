package com.example.demo.repository;

import com.example.demo.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository extends JpaRepository<Entity, Long> {

}
