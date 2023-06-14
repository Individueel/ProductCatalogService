package com.hoef.mike.productcatalogservice.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.hoef.mike.productcatalogservice.Entities.Brand;
import com.hoef.mike.productcatalogservice.Services.BrandService;

@Controller
@RequestMapping("/api/v1/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping
    public @ResponseBody Iterable<Brand> getAllBrands() {
        return brandService.getBrands();
    }

    @GetMapping("/{brandId}")
    public @ResponseBody Brand getBrandById(@PathVariable Integer brandId) {
        return brandService.getBrandById(brandId);
    }

    @PostMapping
    public void addCategory(@RequestBody Brand brand) {
        brandService.addBrand(brand);
    }

    @PutMapping
    public void updateCategory(@RequestBody Brand brand) {
        brandService.updateBrand(brand);
    }

    @DeleteMapping
    public void deleteCategory(@RequestBody Brand brand) {
        brandService.deleteBrand(brand);
    }
}