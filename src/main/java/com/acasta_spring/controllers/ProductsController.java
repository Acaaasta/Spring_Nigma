package com.acasta_spring.controllers;

import com.acasta_spring.entities.Product;
import com.acasta_spring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductsController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/productForm")
    public String processForm(@ModelAttribute("product") Product product) {
        System.out.println(product.getId() + " " + product.getTitle()+ " " + product.getCost());
        return "product-form-result";
    }

    @GetMapping("/all")
    public String showAllProducts(Model model){
        Model products = model.addAttribute("products", productService.getAllProducts());
        return "products-all";
    }

}
