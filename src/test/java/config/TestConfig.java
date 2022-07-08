package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

public class TestConfig {
    @BeforeClass
    public static void setup(){
        RestAssured.baseURI = "https://swapi.dev";
        RestAssured.basePath = "/api/";

        RequestSpecification requestSpecification =
                new RequestSpecBuilder()
                        //.addParam("format", "wookiee")
                        .build();

        RestAssured.requestSpecification = requestSpecification;

        ResponseSpecification responseSpecification =
                new ResponseSpecBuilder()
                        .expectStatusCode(200)
                        .build();

        RestAssured.responseSpecification = responseSpecification;

    }
}
