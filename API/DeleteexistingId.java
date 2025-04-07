package APITest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class DeleteexistingId {
  @Test
  
  
  
  
  public void deletePet() {
      RestAssured.given()
              .delete("https://petstore.swagger.io/v2/pet/111")
              .then()
              .statusCode(200)
              .body("message", equalTo("111"));
  }

  
  
  
  
  
  
}
