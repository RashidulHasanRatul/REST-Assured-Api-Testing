package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GETandPOST {

    @Test
    public static  void GET(){
        baseURI="https://reqres.in/api/users?page=2";
        given().get("/users?page=2").then().statusCode(200);
    }
}
