package com.thiagobrito.authapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thiagobrito.authapi.domain.product.Product;
import com.thiagobrito.authapi.domain.product.ProductDTO;
import com.thiagobrito.authapi.repositories.ProductRepository;

@Service
public class ProductService {

    public ProductRepository repository;

    public ProductService(ProductRepository repository){
        this.repository = repository;
    }

    public List<Product> getAll(){
        return repository.findAll();
    }

    public Product getProduct(String id){
        return repository.findById(id).get();
    }

    public Product saveProduct(ProductDTO data){
        var newProd = new Product(data);
        return repository.save(newProd);
    }

    public Product updateProduct(String id, ProductDTO data){
        var updProd = repository.findById(id).get();
        updProd.setName(data.name());
        updProd.setPrice(data.price());
        updProd.setQuantity(data.quantity());

        return repository.save(updProd);
    }

    public void deleteProduct(String id){
        var product = repository.findById(id).get();
        repository.delete(product);
    }    
}