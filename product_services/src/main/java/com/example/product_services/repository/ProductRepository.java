package com.example.product_services.repository;

import com.example.product_services.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, String> {

    @Query(value = "SELECT * FROM product where IdPrd = ?", nativeQuery = true)
    public Product findByIntId(int id);

}