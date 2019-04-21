package me.jerrywang.java.springdatademo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.jerrywang.java.springdatademo.data.ProductRepository;
import me.jerrywang.java.springdatademo.domain.Product;

@BasePathAwareController
@RestController
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping("/products")
  public ResponseEntity<List<Product>> listAllProducts() {
    final List<Product> products = productRepository.findAll();
    return wrap(products, HttpStatus.OK);
  }

  private ResponseEntity<List<Product>> wrap(final List<Product> products, final HttpStatus responseStatus) {
    return new ResponseEntity<>(products, responseStatus);
  }
}
