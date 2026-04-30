package com.example.product_management.service;

import com.example.product_management.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
        public List<Product> getAllProducts() {
            return Arrays.asList(
                    new Product(1, "Laptop Dell XPS", 1500.0),
                    new Product(2, "iPhone 15 Pro", 1200.0),
                    new Product(3, "Chuột Logitech G", 50.0)
            );
        }
}
