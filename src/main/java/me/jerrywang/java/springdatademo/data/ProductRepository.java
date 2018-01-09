package me.jerrywang.java.springdatademo.data;

import me.jerrywang.java.springdatademo.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
