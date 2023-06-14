package com.hoef.mike.productcatalogservice.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.hoef.mike.productcatalogservice.Entities.Category;
import com.hoef.mike.productcatalogservice.Services.CategoryService;

@Controller
@RequestMapping("/api/v1/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public @ResponseBody Iterable<Category> getAllCategories() {
        return categoryService.getCategories();
    }

    @GetMapping("/{categoryId}")
    public @ResponseBody Category getCategoryById(@PathVariable Integer categoryId) {
        return categoryService.getCategoryById(categoryId);
    }

    @PostMapping
    public void addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
    }

    @PutMapping
    public void updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
    }

    @DeleteMapping
    public void deleteCategory(@RequestBody Category category) {
        categoryService.deleteCategory(category);
    }
}