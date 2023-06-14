package com.hoef.mike.productcatalogservice.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.hoef.mike.productcatalogservice.Entities.Review;
import com.hoef.mike.productcatalogservice.Services.ReviewService;

@Controller
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public @ResponseBody Iterable<Review> getAllReviews() {
        return reviewService.getReviews();
    }

    @GetMapping("/{reviewId}")
    public @ResponseBody Review getReviewById(@PathVariable Integer reviewId) {
        return reviewService.getReviewById(reviewId);
    }

    @PostMapping
    public void addReview(@RequestBody Review review) {
        reviewService.addReview(review);
    }

    @PutMapping
    public void updateReview(@RequestBody Review review) {
        reviewService.updateReview(review);
    }

    @DeleteMapping
    public void deleteReview(@RequestBody Review review) {
        reviewService.deleteReview(review);
    }
}