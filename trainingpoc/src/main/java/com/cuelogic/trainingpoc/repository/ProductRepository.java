package com.cuelogic.trainingpoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cuelogic.trainingpoc.entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}