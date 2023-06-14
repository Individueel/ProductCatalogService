package com.hoef.mike.productcatalogservice.Services;

import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoef.mike.productcatalogservice.Entities.PatchDto;
import com.hoef.mike.productcatalogservice.Entities.Product;
import com.hoef.mike.productcatalogservice.Repositories.ProductRepository;

@Service
public class ProductCatalogService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Integer id) {
        return productRepository.findById(id).get();
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public Product patchProduct(PatchDto dto, Integer id) {
        if (dto.getOp().equalsIgnoreCase("update")) {
            Product product = productRepository.findById(id).orElse(null);
            if (product == null) {
                return null;
            }
            if (dto.getKey().equalsIgnoreCase("likes")) {
                product.setLikes(dto.getValue());
            }
            return productRepository.save(product);
        } else {
            throw new NotYetImplementedException("NOT_YET_IMPLEMENTED");
        }
    }

    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }
}