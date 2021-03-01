package com.Connect.postGresql.Controller;


import com.Connect.postGresql.Model.Product;
import com.Connect.postGresql.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return (List<Product>) productRepository.findAll();
    }

    @PostMapping("/products")
    public List<Product> saveProduct(@RequestBody Product product){
        productRepository.save(product);
        return (List<Product>) productRepository.findAll();
    }
}
