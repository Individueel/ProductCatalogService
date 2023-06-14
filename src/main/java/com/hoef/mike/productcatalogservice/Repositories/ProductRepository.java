package com.hoef.mike.productcatalogservice.Repositories;

import com.hoef.mike.productcatalogservice.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}