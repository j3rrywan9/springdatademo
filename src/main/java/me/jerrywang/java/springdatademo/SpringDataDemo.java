package me.jerrywang.java.springdatademo;

import java.math.BigDecimal;

import me.jerrywang.java.springdatademo.data.ProductRepository;
import me.jerrywang.java.springdatademo.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataDemo {
  public static void main(final String[] args) {
    final ApplicationContext context = SpringApplication.run(SpringDataDemo.class, args);

    final ProductRepository productRepository = context.getBean(ProductRepository.class);
    final Product newProduct = new Product();
    newProduct.setId(1L);
    newProduct.setName("XPS 13");
    newProduct.setUnitPrice(new BigDecimal(1300));
    newProduct.setManufacturer("DELL");
    newProduct.setCategory("Laptop");
    productRepository.save(newProduct);
  }
}
