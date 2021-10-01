package APITesting_Level1;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

public class PUT_PATCH_DELETE {

    @Test
    public static void PUT ()  {

        baseURI="https://reqres.in/api";

        JSONObject request = new JSONObject();
        request.put("Name","Rashidul Hasan");
        request.put("Job","FullStack QA");


        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .put("/users/2")
                .then()
                .statusCode(200)
                .log().all();

    }


    @Test
    public static void PATCH ()  {

        baseURI="https://reqres.in/";

        JSONObject request = new JSONObject();
        request.put("Name","Rashidul Hasan");
        request.put("Job","FullStack QA");


        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .put("api/users/2")
                .then()
                .statusCode(200)
                .log().all();

    }


    @Test
    public static void DELETE ()  {

        baseURI="https://reqres.in";

                when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .log().all();
    }


}
