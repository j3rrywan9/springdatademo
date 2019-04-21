package me.jerrywang.java.springdatademo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import me.jerrywang.java.springdatademo.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
