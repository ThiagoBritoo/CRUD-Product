package com.thiagobrito.authapi.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagobrito.authapi.domain.product.Product;
import com.thiagobrito.authapi.domain.product.ProductDTO;
import com.thiagobrito.authapi.services.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("product")
public class ProductController {

    public ProductService service;

    public ProductController(ProductService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable(name = "id") String id){
        return ResponseEntity.ok().body(service.getProduct(id));
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductDTO data){
        return ResponseEntity.ok().body(service.saveProduct(data));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable(name = "id") String id, @RequestBody ProductDTO data){
        return ResponseEntity.ok().body(service.updateProduct(id, data));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable(name = "id") String id){
        service.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }    
}