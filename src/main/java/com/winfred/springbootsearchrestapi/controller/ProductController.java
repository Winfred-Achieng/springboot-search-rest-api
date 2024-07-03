package com.winfred.springbootsearchrestapi.controller;


import com.winfred.springbootsearchrestapi.entity.Product;
import com.winfred.springbootsearchrestapi.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }


    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query) {

        return new ResponseEntity<>(productService.searchProducts(query), HttpStatus.OK);

    }

}
