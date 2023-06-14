package com.hoef.mike.productcatalogservice.Repositories;

import com.hoef.mike.productcatalogservice.Entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}