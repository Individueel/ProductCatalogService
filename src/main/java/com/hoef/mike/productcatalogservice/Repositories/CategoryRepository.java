package com.hoef.mike.productcatalogservice.Repositories;

import com.hoef.mike.productcatalogservice.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}