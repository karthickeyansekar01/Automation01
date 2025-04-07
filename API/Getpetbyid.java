package APITest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class Getpetbyid {
  @Test
  
  
  public void getPetById() {
      RestAssured.given()
              .get("https://petstore.swagger.io/v2/pet/111")
              .then()
              .statusCode(200)
              .body("id", equalTo(111))
              .body("name", equalTo("doggie"));
  }

  
  
  
  
  
  
  
  
}
