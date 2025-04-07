package APITest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class NewAPITest {
	
	
  @Test
 
	  

	   public void findPetByStatus() {
	        RestAssured.given()
	                .queryParam("status", "available")
	                .get("https://petstore.swagger.io/v2/pet/findByStatus")
	                .then()
	                .statusCode(200)
	                .body("[0].status",equalTo("available"));
	    }
  
  
  
  

  }

