package com.winfred.springbootsearchrestapi.repository;

import com.winfred.springbootsearchrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
