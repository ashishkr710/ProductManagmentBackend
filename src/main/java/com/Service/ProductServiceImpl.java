package com.Service;

import com.Model.Product;
import com.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepo;
    
    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id).get();
    }

    @Override
    public String deleatProduct(Integer id) {
           Product product = productRepo.findById(id).get();

           if (product != null)
           {
               productRepo.delete(product);
               return "Product Delete Sucessfully";
           }
           return "Something Went wrong";
    }
}
