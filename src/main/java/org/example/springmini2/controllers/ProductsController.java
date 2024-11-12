package org.example.springmini2.controllers;

import org.example.springmini2.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.example.springmini2.service.ProductService;

@Controller
public class ProductsController {
    private final ProductService productService;


    public ProductsController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

    @PostMapping(path="/products")
    public String addProduct(
            Product p,
            Model model
    ) {
        productService.addProduct(p);
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

}
