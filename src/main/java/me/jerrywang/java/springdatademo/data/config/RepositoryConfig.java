package me.jerrywang.java.springdatademo.data.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import me.jerrywang.java.springdatademo.domain.Product;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    config.exposeIdsFor(Product.class);
  }
}
