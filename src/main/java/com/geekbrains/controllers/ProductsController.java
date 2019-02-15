package com.geekbrains.controllers;

import com.geekbrains.entities.Product;
import com.geekbrains.entities.Student;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

public class ProductsController {

    @RequestMapping("/productForm")
    public String processForm(@ModelAttribute("product") Product product) {
        System.out.println(product.getId() + " " + product.getTitle()+ " " + product.getCost());
        return "product-form-result";
    }

}
