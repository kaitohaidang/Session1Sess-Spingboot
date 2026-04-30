package com.example.product_management.controller;

import com.example.product_management.model.Product;
import com.example.product_management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService=productService;
    }
    @GetMapping("/products")
    public List<Product> getProducts() {
       return productService.getAllProducts();
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
       return productService.addProduct(product);
    }
    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable int id , @RequestBody Product product) {
        return productService.updateProduct(id ,product);
    }
    @DeleteMapping("/products/{id}")
    public String deleteProduct (@PathVariable int id) {
        boolean isRemoved = productService.deleteProduct(id);
        if (isRemoved) return  "Da xoa san pham";
        else return "khong tim thay san pham";
    }
}
