package APITest;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class Addingnewpet {
	
	public void addNewPet() {
        String requestBody = """
                {
                    "id": 111,
                    "category": { "id": 0, "name": "string" },
                    "name": "doggie",
                    "photoUrls": ["string"],
                    "tags": [{ "id": 0, "name": "string" }],
                    "status": "available"
                }
                """;

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .body("id", equalTo(111))
                .body("name", equalTo("doggie"))
                .body("status", equalTo("available"));
    }


}
