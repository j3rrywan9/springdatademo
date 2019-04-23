package me.jerrywang.java.springdatademo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import me.jerrywang.java.springdatademo.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

  @Transactional(readOnly = true)
  Long countById(@Param("id") Long id);
}
