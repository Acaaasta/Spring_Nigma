package com.acasta_spring.services;

import com.acasta_spring.entities.Product;
import com.acasta_spring.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        if (product==null) return null;
        return productRepository.save(product);
    }

    public Product findProductById(Long id){
        return productRepository.findOneById(id);
    }

}
