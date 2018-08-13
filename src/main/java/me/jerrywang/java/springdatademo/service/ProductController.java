package me.jerrywang.java.springdatademo.service;

import me.jerrywang.java.springdatademo.data.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@BasePathAwareController
public class ProductController {
  @Autowired
  private ProductRepository productRepository;

  @GetMapping("/products")
  public String listAllProducts(final Model model) {
    model.addAttribute("products", productRepository.findAll());
    return "products";
  }
}
