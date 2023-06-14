package com.hoef.mike.productcatalogservice.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoef.mike.productcatalogservice.Entities.Brand;
import com.hoef.mike.productcatalogservice.Repositories.BrandRepository;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public Iterable<Brand> getBrands() {
        return brandRepository.findAll();
    }

    public Brand getBrandById(Integer id) {
        return brandRepository.findById(id).get();
    }

    public void addBrand(Brand brand) {
        brandRepository.save(brand);
    }

    public void updateBrand(Brand brand) {
        brandRepository.save(brand);
    }

    public void deleteBrand(Brand brand) {
        brandRepository.delete(brand);
    }
}