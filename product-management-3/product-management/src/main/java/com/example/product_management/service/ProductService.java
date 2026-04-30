package com.example.product_management.service;

import com.example.product_management.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
        private List<Product> products= new ArrayList<>( Arrays.asList(
                    new Product(1, "Laptop Dell XPS", 1500.0) ,
                    new Product(2, "iPhone 15 Pro", 1200.0),
                    new Product(3, "Chuột Logitech G", 50.0)
            ));
        public List<Product> getAllProducts (){
            return products;
        }
        public Product addProduct(Product product) {
            products.add(product);
            return product;
        }
        public Product updateProduct(int id , Product product) {
            for ( Product p :products) {
                if (p.getId()==id) {
                    p.setName(product.getName());
                    p.setPrice(product.getPrice());
                    return p;
                }
            }
            return null;
        }
        public boolean deleteProduct(int id) {
            return products.removeIf(p->p.getId()==id);
        }
        }

