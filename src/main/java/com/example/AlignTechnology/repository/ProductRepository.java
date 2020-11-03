package com.example.AlignTechnology.repository;

import com.example.AlignTechnology.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findAllByName(String name);
    List<Product> findAllByBrand(String brand);
    @Query(value = "select p from Product p where p.quantity >= ?1")
    List<Product> findAllByQuantity(Integer quantity);
}
