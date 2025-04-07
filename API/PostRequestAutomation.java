package APITest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;



import org.testng.annotations.Test;

public class PostRequestAutomation {
  @Test
 

  public void createObjectUsingHashMap() {
      // Prepare request body using HashMap
      Map<String, Object> dataMap = new HashMap<>();
      dataMap.put("year", 2019);
      dataMap.put("price", 1849.99);
      dataMap.put("CPUmodel", "Intel Core i9");
      dataMap.put("Harddisksize", "1 TB");

      Map<String, Object> requestBody = new HashMap<>();
      requestBody.put("name", "Apple MacBook Pro 16");
      requestBody.put("data", dataMap);

      // Send POST request
      Response response = RestAssured.given()
              .header("Content-Type", "application/json")
              .body(requestBody)
              .post("https://api.restful-api.dev/objects");

      // Validate response
      response.then().statusCode(200);
      System.out.println("Response: " + response.asPrettyString());

      // Assertions
      Assert.assertEquals(response.jsonPath().getString("name"), "Apple MacBook Pro 16");
      Assert.assertEquals(response.jsonPath().getMap("data").get("year"), 2019);
  }
}

  
  
  
  
  
  
  
  
  

