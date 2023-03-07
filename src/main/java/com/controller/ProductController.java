package com.controller;

import com.Model.Product;

import com.Service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }


//    @GetMapping("/")
//    public ResponseEntity<?> getAllProduct(){
//    	System.out.println(productService.getAllProduct());
//        return new ResponseEntity<>(productService.getAllProduct(),HttpStatus.OK);
//    }
    
    
    @RequestMapping("/allProduct")
    public List<Product> getAllProduct(){
    	System.out.println("hello");
    	System.out.println(productService.getAllProduct().toString());
    	return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> gatProductById(@PathVariable Integer id){
        return new ResponseEntity<>(productService.getProductById(id),HttpStatus.OK);
    }

    @GetMapping("/DeleatProduct/{id}")
    public ResponseEntity<?> deleatProduct(@PathVariable Integer id){

        return new ResponseEntity<>(productService.deleatProduct(id),HttpStatus.OK);
    }

    @PostMapping("/editProduct")
    public ResponseEntity<?> editProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }
}
