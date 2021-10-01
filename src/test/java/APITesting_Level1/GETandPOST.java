package APITesting_Level1;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GETandPOST {

    @Test
    public static  void GET(){
        baseURI="https://reqres.in/api";
        given()
                .get("/users?page=2")
                .then()
                .statusCode(200)
                .body("data[4].first_name",equalTo("George"))
                .body("data.first_name",hasItems("George","Rachel"));
    }

    @Test
    public static  void POST(){
//        baseURI="https://reqres.in/api";
      Map<String,Object> map = new HashMap<String,Object>();

      /*
      *  map.put("Name","Ratul");
      map.put("Job","Tester");
        System.out.println(map);
      * */



        JSONObject request = new JSONObject();
        request.put("Country","BD");
        request.put("Name","Rashiul Hasan");
        System.out.println(request);

        baseURI="https://reqres.in/api";

        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .log().all();

    }


}
