package com.hoef.mike.productcatalogservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import com.hoef.mike.productcatalogservice.Controllers.CategoryController;

@SpringBootTest
class ProductCatalogServiceApplicationTests {

	@Autowired
	private CategoryController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
