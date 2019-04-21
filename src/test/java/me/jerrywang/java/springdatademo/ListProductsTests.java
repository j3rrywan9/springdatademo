package me.jerrywang.java.springdatademo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class ListProductsTests {

  @Test
  public void listProductById() {
    given()
        .baseUri("http://localhost")
        .port(8080)
        .basePath("/api/v1")
        .when()
        .get("/products/1")
        .then()
        .statusCode(200)
        .assertThat()
        .body("manufacturer", equalTo("DELL"));
  }
}
