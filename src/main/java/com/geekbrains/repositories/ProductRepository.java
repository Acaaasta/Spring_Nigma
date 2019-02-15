package com.geekbrains.repositories;

import com.geekbrains.entities.Product;

import java.util.ArrayList;

public class ProductRepository {

    ArrayList<Product> products = new ArrayList<Product>();

    public Product findOneById(Long id) {

        Product product = new Product();
        product.setId(id);
        product.setTitle("milk");
        product.setCost(85);
        products.add(product);
        return product;
    }

}
