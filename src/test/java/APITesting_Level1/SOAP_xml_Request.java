package APITesting_Level1;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class SOAP_xml_Request {


    @Test
    public void validateSOAP_xml_request(){
        baseURI="www.dneonline.com";
       given()
               .contentType("text/xml").
               accept(ContentType.XML);
    }
}
