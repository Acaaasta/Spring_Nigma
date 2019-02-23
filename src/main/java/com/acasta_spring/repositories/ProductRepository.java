package com.acasta_spring.repositories;

import com.acasta_spring.entities.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> products;

    @PostConstruct
    public void init(){
        products = new ArrayList<>();
        products.add(new Product(1L, "TV", 25000));
        products.add(new Product(2L, "Lamp", 500));
        products.add(new Product(3L, "Sofa", 15000));
    }

    public Product findOneById(Long id) {

        for (Product pr:products) {
            if (pr.getId()==id) return pr;
        }
        return null;
    }

    public List<Product> findAll(){
        products = new ArrayList<>();
        products.add(new Product(1L, "TV", 25000));
        products.add(new Product(2L, "Lamp", 500));
        products.add(new Product(3L, "Sofa", 15000));
        return products;
    }

    public Product save(Product product){
        products.add(product);
        return product;
    }

}
