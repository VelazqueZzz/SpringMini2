package org.example.springmini2.service;

import org.example.springmini2.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<Product>();
    public void addProduct(Product p) {
        products.add(p);
    }
    public List<Product> findAll(){
        return products;
    }

}
