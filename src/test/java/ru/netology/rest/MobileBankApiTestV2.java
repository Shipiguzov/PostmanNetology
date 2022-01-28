package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class MobileBankApiTestV2 {
    @Test
    void shouldReturnDemoAccounts() {
      // Given - When - Then
      // Предусловия
      given()
          .baseUri("https://postman-echo.com")
          .body("")
      // Выполняемые действия
      .when()
          .post("/post")
      // Проверки
      .then()
          .statusCode(200)
          // .header("Content-Type", "application/json; charset=UTF-8")
          // специализированные проверки - лучше
          .contentType(ContentType.JSON)
      ;
    }
}
