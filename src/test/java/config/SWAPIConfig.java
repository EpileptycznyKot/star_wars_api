package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

public class SWAPIConfig {

    public static RequestSpecification requestSpecification;
    public static ResponseSpecification responseSpecification;


    @BeforeClass
    public static void setup(){
        RestAssured.basePath = "/api/";
        RestAssured.baseURI = "https://swapi.dev";

        requestSpecification = new RequestSpecBuilder()
                .build();
        responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();

    }
}
