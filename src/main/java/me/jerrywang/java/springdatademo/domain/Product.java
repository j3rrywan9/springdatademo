package me.jerrywang.java.springdatademo.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.Identifiable;

@Entity(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Identifiable<Long> {
  @Id
  private Long id;

  @NotNull
  private String name;

  @NotNull
  private BigDecimal unitPrice;

  private String description;

  @NotNull
  private String manufacturer;

  @NotNull
  private String category;

  private long unitsInStock;

  private long unitsInOrder;

  private boolean discontinued;

  private String condition;
}
