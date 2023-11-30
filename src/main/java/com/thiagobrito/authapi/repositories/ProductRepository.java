package com.thiagobrito.authapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagobrito.authapi.domain.product.Product;

public interface ProductRepository extends JpaRepository<Product, String>{
}
