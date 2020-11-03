package com.example.AlignTechnology.services;

import com.example.AlignTechnology.entity.Product;
import com.example.AlignTechnology.repository.ProductRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log
@Service
public class ProductServicesImpl implements ProductServices {

    @Autowired
    ProductRepository productRepository;

    @Override
    @Transactional
    public boolean saveProduct(Product product) {
        productRepository.save(product);
        return true;
    }

    @Override
    public List<Product> findProductByName(String name) {
        return productRepository.findAllByName(name);
    }

    @Override
    public List<Product> findProductByBrand(String brand) {
        return productRepository.findAllByBrand(brand);
    }

    @Override
    @Transactional
    public boolean updateProduct(Product product) {
        productRepository.save(product);
        return true;
    }

    @Override
    @Transactional
    public boolean removeProduct(Product product) {
        productRepository.delete(product);
        return true;
    }

    @Override
    public List<Product> findAllByQuantity(Integer quantity) {
        return productRepository.findAllByQuantity(quantity);
    }
}
