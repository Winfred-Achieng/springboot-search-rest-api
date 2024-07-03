package com.winfred.springbootsearchrestapi.repository;

import com.winfred.springbootsearchrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    //JPQL query
    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%', :query, '%') OR " +
            "p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(@Param("query") String query);


    //native query
//    @Query(value = "SELECT * FROM products p WHERE " +
//            "p.name LIKE CONCAT('%', :query, '%') OR " +
//            "p.description LIKE CONCAT('%', :query, '%')", nativeQuery = true)
//    List<Product> searchProductsSQL(@Param("query") String query);
}
