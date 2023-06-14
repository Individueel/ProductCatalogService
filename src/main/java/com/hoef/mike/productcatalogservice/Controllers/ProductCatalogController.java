package com.hoef.mike.productcatalogservice.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.hoef.mike.productcatalogservice.Entities.PatchDto;
import com.hoef.mike.productcatalogservice.Entities.Product;
import com.hoef.mike.productcatalogservice.Services.ProductCatalogService;

@Controller
@RequestMapping("/api/v1/products")
public class ProductCatalogController {

    @Autowired
    private ProductCatalogService productCatalogService;

    @GetMapping
    public @ResponseBody Iterable<Product> getAllProducts() {
        return productCatalogService.getProducts();
    }

    @GetMapping("/{productId}")
    public @ResponseBody Product getProductById(@PathVariable Integer productId) {
        return productCatalogService.getProductById(productId);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productCatalogService.addProduct(product);
    }

    @PatchMapping("/{productId}")
    public @ResponseBody Product updateProduct(@RequestBody PatchDto dto, @PathVariable Integer productId) {
        return productCatalogService.patchProduct(dto, productId);
    }

    @DeleteMapping
    public void deleteProduct(@RequestBody Product product) {
        productCatalogService.deleteProduct(product);
    }
}