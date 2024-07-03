package com.winfred.springbootsearchrestapi.service;

import com.winfred.springbootsearchrestapi.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);
}
