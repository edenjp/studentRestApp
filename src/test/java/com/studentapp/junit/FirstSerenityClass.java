package com.studentapp.junit;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class FirstSerenityClass {
    @BeforeClass
    public static void init(){
        RestAssured.baseURI="http://localhost:8085/student";
    }

    @Test
    public void getAllStudents(){
    RestAssured.given()
            .when()
            .get("/list")
            .then()
            .log()
            .all()
            .statusCode(200);
    }
}
