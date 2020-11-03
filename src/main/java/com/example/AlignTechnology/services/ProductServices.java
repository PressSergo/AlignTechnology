package com.example.AlignTechnology.services;

import com.example.AlignTechnology.entity.Product;

import java.util.List;

public interface ProductServices {
    boolean saveProduct(Product product);
    List<Product> findProductByName(String name);
    List<Product> findProductByBrand(String brand);
    boolean updateProduct(Product product);
    boolean removeProduct(Product product);
    List<Product> findAllByQuantity(Integer quantity);
}
