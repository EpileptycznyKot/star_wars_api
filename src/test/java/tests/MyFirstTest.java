package tests;

import config.SWAPIConfig;
import endpoints.SWAPIEndpoints;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class MyFirstTest extends SWAPIConfig {


    @Test
    public void test(){
        RestAssured.given()
                .log().all()
                .when().get()
                .then()
                .body("people", equalTo("https://swapi.dev/api/people/"))
                .body("films", equalTo("https://swapi.dev/api/films/"));
    }

    @Test
    public void test2(){
        RestAssured.given()
                .log().all()
                .when().get(SWAPIEndpoints.PLANETS)
                .then().log().all();
    }

    @Test
    public void getCustomPerson(){
        RestAssured.given()
                .log().all()
                .when()
                .get(SWAPIEndpoints.PEOPLE+"/5")
                .then()
                .log().all();
    }
}
