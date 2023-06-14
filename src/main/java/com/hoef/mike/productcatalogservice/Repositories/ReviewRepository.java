package com.hoef.mike.productcatalogservice.Repositories;

import com.hoef.mike.productcatalogservice.Entities.Review;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}