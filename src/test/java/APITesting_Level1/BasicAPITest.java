package APITesting_Level1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAPITest {

    @Test
    public void fristTest() {
      Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Response Time = "+response.getTime());
        System.out.println("Response Body = "+response.getBody());
        System.out.println("Response Status Code = "+response.getStatusCode());
        System.out.println("Header = "+response.getHeader("Content-type"));
        System.out.println("Status Line = "+response.getStatusLine());
        int statusCode = response.getStatusCode();
        //Assertion
        Assert.assertEquals(statusCode,200);


    }




}
