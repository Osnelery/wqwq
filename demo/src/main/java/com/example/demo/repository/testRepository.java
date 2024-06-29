package com.example.demo.repository;

import com.example.demo.entity.testEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface testRepository extends JpaRepository<testEntity, Long> {

}
