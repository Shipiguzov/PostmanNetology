package ru.netology.rest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class MobileBankApiTestV4 {
    private RequestSpecification requestSpec = new RequestSpecBuilder()
        .setBaseUri("https://postman-echo.com")
        //.setBasePath("/post")
        //.setPort(443)
        .setAccept(ContentType.JSON)
        .setContentType(ContentType.JSON)
        .log(LogDetail.ALL)
        .build();

    @Test
    void shouldReturnDemoAccounts() {
      // Given - When - Then
      // Предусловия
      given()
          .spec(requestSpec) // со спецификацией проще (особенно когда много тестов)
          .body("")
      // Выполняемые действия
      .when()
          .post("/post")
      // Проверки
      .then()
          .statusCode(200);
    }
}
