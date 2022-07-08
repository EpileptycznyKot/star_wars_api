package tests;

import config.FootballAPIConfig;
import endpoints.FootballEndpoints;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class FootballApiTest extends FootballAPIConfig {
    @Test
    public void test1(){
        RestAssured.given()
                .queryParam("areas", 2072)
                .when()
                .get(FootballEndpoints.AREA)
                .then();
    }
}
