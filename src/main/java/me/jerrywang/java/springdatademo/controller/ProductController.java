package me.jerrywang.java.springdatademo.controller;

import me.jerrywang.java.springdatademo.data.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
  @Autowired
  private ProductRepository productRepository;

  @GetMapping("/products")
  public String listAllProducts(final Model model) {
    model.addAttribute("products", productRepository.findAll());
    return "products";
  }
}
