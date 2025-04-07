package APITest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;


public class AutomationPOJO {
	 @Test

	 
		

		public class PostRequestUsingPojo {

		    @Test
		    public void createObjectUsingPojo() {
		        // Prepare the inner data object
		        Data data = new Data();
		        data.setYear(2019);
		        data.setPrice(1849.99);
		        data.setCPUmodel("Intel Core i9");
		        data.setHarddisksize("1 TB");

		        // Prepare the main request body
		        ObjectRequest requestBody = new ObjectRequest();
		        requestBody.setName("Apple MacBook Pro 16");
		        requestBody.setData(data);

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

	 
	 
	 
	 
	 
	 public class ObjectRequest {
		    private String name;
		    private Data data;

		    // Getters and Setters
		    public String getName() {
		        return name;
		    }
		    public void setName(String name) {
		        this.name = name;
		    }
		    public Data getData() {
		        return data;
		    }
		    public void setData(Data data) {
		        this.data = data;
		    }
		}
 
	 
	 
	 
	 
	 
	 
	
  
  
}
