package com.deepalien.teluskoApp.Controller;

import com.deepalien.teluskoApp.Model.Product;
import com.deepalien.teluskoApp.Services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//This is the controller part of the request
//get all request and give the response
@Component
@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Service service;
    @GetMapping("/products")
    public List<Product> product(){
        return service.getProduct();
    }
    @GetMapping("/products/{prodId}")
    public Product productById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteById(prodId);
    }

    @PutMapping("/products/{prodId}")
    public void updateById(@PathVariable int prodId,@RequestBody Product prod){
        service.updateById(prodId,prod);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product prod) {
        return service.addProduct(prod);
    }
}
