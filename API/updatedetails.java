package APITest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class updatedetails {
  @Test
  
  
  
  
  public void updatePet() {
      String requestBody = """
              {
                  "id": 111,
                  "category": { "id": 0, "name": "string" },
                  "name": "fish",
                  "photoUrls": ["string"],
                  "tags": [{ "id": 0, "name": "string" }],
                  "status": "available"
              }
              """;

      RestAssured.given()
              .header("Content-Type", "application/json")
              .body(requestBody)
              .put("https://petstore.swagger.io/v2/pet")
              .then()
              .statusCode(200)
              .body("id", equalTo(111))
              .body("name", equalTo("fish"));
  }

  
  
  
  
  
  
  
}
