package com.example.AlignTechnology.controller;

import com.example.AlignTechnology.entity.Product;
import com.example.AlignTechnology.services.ProductServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SampleController {

    @Autowired
    ProductServicesImpl productServices;

    @RequestMapping(method = RequestMethod.GET,value = "/enterNewProduct")
    public ResponseEntity enterNewProduct(@RequestBody Product product){
        productServices.saveProduct(product);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/findByName")
    public ResponseEntity<List<Product>> findProductByName(@Param(value = "name") String name){
        return ResponseEntity.ok().body(productServices.findProductByName(name));
    }

    @RequestMapping(method = RequestMethod.GET,value = "/findByBrand")
    public ResponseEntity<List<Product>> findProductByBrand(@Param(value = "brand") String brand){
        return ResponseEntity.ok().body(productServices.findProductByBrand(brand));
    }

    @RequestMapping(method = RequestMethod.GET,value = "/updateProduct")
    public ResponseEntity updateProduct(@RequestBody Product product){
        productServices.updateProduct(product);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/removeProduct")
    public ResponseEntity removeProduct(@RequestBody Product product){
        productServices.removeProduct(product);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/findAllByQuantity")
    public ResponseEntity<List<Product>> findAllByQuantity(@Param(value = "quantity") Integer quantity){
        return ResponseEntity.ok().body(productServices.findAllByQuantity(quantity));
    }

}
