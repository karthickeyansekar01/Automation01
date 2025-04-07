package APIChaining;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter; 

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.ITestResult;

import io.restassured.response.Response;
public class Telecom {

 String authToken;
 String contactId;
public static ExtentReports extent;
 public static ExtentTest test;

 @BeforeSuite
 public void setupExtent() {
 ExtentSparkReporter sparkReporter = new ExtentSparkReporter("testoutput/ExtentReport.html");
 extent = new ExtentReports();
 extent.attachReporter(sparkReporter);
 extent.setSystemInfo("Tester", "Devendra Kumar Vatsa");
 }

 @AfterSuite
 public void tearDown() {
 extent.flush();
}

 @AfterMethod
 public void logTestResults(ITestResult result) {
 if (result.getStatus() == ITestResult.FAILURE) {
 test.fail("Test Failed: " + result.getThrowable());
 } else if (result.getStatus() == ITestResult.SUCCESS) {
 test.pass("Test Passed");
 } else if (result.getStatus() == ITestResult.SKIP) {
 test.skip("Test Skipped");
 }
 }
 
 @Test (priority=1)
 public void addNewUser() {

 test = extent.createTest("Add New User");
 System.out.println("Test for Add New User: ");

 Response res = given()
		    .contentType("application/json")
		    .body("{\n" +
		          "  \"firstName\": \"Test\",\n" +
		          "  \"lastName\": \"User\",\n" +
		          "  \"email\": \"testing88993@test.com\",\n" +
		          "  \"password\": \"myPassword\"\n" +
		          "}")
		.when()
		 .post("https://thinking-tester-contact-list.herokuapp.com/users");
 //Log Body

 res.then().log().body();

 //validate status code and Message

 Assert.assertEquals(res.getStatusCode(), 201);
 System.out.println("Status Code is: " + res.getStatusCode());

 Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 201 Created");
 System.out.println("Status Message is: " + res.getStatusLine());

 // Generate & Validate Token
 String token = res.jsonPath().getString("token");
 Assert.assertNotNull(token, "Token is null");
 authToken = token;
 System.out.println("Generated Token: " + token); 
 
}
 

 @Test (priority=2,enabled=false)

 public void getUserProfile() {

 test = extent.createTest("Get User Profile");
 System.out.println("\nTest for Get User Profile: "); 
 Response res = given()
		 .header("Authorization", "Bearer " + authToken)
		 .when().get("https://thinking-tester-contactlist.herokuapp.com/users/me");
		 //Log Body

		 res.then().log().body();

		 //validate status code and Message

		 Assert.assertEquals(res.getStatusCode(), 200);
		 System.out.println("Status Code is: " + res.getStatusCode());

		 Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 200 OK");
		 System.out.println("Status Message is: " + res.getStatusLine()); 

		//Validate Email

		 String email = res.jsonPath().getString("email");
		 Assert.assertNotNull(email, "Email is null");
		 System.out.println("User Profile: " + res.asString());


		 } 
 
 
 @Test (priority=3)

 public void updateUser() { 
	 test = extent.createTest("Update User");
	 System.out.println("\nTest For Update User: ");

	 Response res = given()
	 .header("Authorization", "Bearer " + authToken)
	 .contentType("application/json")
	 .body("{ \n"
	 + "\"firstName\": \"Updated\", \n"
	 + "\"lastName\": \"Username\", \n"
	 + "\"email\": \"testing88993@test.com\", \n"
	 + "\"password\": \"myNewPassword\" \n"
	 + "}")
	 .when().patch("https://thinking-tester-contact-list.herokuapp.com/users/me");
	 //Log Body

	 res.then().log().body(); 
	//validate status code and Message

	 Assert.assertEquals(res.getStatusCode(), 200);
	 System.out.println("Status Code is: " + res.getStatusCode());

	 Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 200 OK");
	 System.out.println("Status Message is: " + res.getStatusLine());

	 //Validate Email

	 String email = res.jsonPath().getString("email");
	 Assert.assertEquals(email, "testing88993@test.com", "Email did not update");
 } 

 @Test (priority=4)

 public void loginUser() {

 test = extent.createTest("Login User");
 System.out.println("\nTest for Login User: ");
 Response res = given()
 .contentType("application/json")
 .body("{ \n"
 + " \n"
 + " \n"
 + "\"email\": \"testing88993@test.com\", \n"
 + "\"password\": \"myNewPassword\" \n"
 + " \n"
 + "}")
 .when().post("https://thinking-tester-contact-list.herokuapp.com/users/login");

 //Log Body

 res.then().log().body();

 //validate status code and Message
 Assert.assertEquals(res.getStatusCode(), 200);
 System.out.println("Status Code is: " + res.getStatusCode()); 
 
 Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 200 OK");
 System.out.println("Status Message is: " + res.getStatusLine());

 //Generate & Validate Token
 String token = res.jsonPath().getString("token");
 Assert.assertNotNull(token, "Token is null");
 authToken = token;
 System.out.println("Generated Token: " + token);

 } 
 @Test (priority=5)

 public void addContact() {

 test = extent.createTest("Add Contact");
 System.out.println("\n Test For Add Contact: ");

 Response res = given()
 .header("Authorization", "Bearer " + authToken)
 .contentType("application/json")
 .body("{ \n"
 + "\"firstName\": \"John\", \n"
 + "\"lastName\": \"Doe\", \n"
 + "\"birthdate\": \"1970-01-01\", \n"
 + "\"email\": \"jdoe@fake.com\", \n"
 + "\"phone\": \"8005555555\", \n"
 + "\"street1\": \"1 Main St.\", \n" 
 + "\"street2\": \"Apartment A\", \n"
 + "\"city\": \"Anytown\", \n"
 + "\"stateProvince\": \"KS\", \n"
 + "\"postalCode\": \"12345\", \n"
 + "\"country\": \"USA\" \n"
 + "} ")
 .when().post("https://thinking-tester-contact-list.herokuapp.com/contacts");
 //Log Body

 res.then().log().body();

 //validate status code and Message

 Assert.assertEquals(res.getStatusCode(), 201);
 System.out.println("Status Code is: " + res.getStatusCode());

 Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 201 Created");
 System.out.println("Status Message is: " + res.getStatusLine());

 //Generate & Validate Id

 String contactId = res.jsonPath().getString("_id");
 Assert.assertNotNull(contactId, "Contact ID is null");
 this.contactId = contactId;
 System.out.println("Generated ID: " + contactId);
 }

 @Test (priority=6,enabled=true) 

 public void getContactList() {

 test = extent.createTest("Get Contact List");
 System.out.println("\n Test For Get Contact List: ");

 Response res = given()
 .header("Authorization", "Bearer " + authToken)
 .when().get("https://thinking-tester-contact-list.herokuapp.com/contacts");

 //Log Body

 res.then().log().body();

 //validate status code and Message

 Assert.assertEquals(res.getStatusCode(), 200);
 System.out.println("Status Code is: " + res.getStatusCode());

 Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 200 OK");
 System.out.println("Status Message is: " + res.getStatusLine()); 
 
//ValidaƟon For Response is Array
Assert.assertTrue(res.jsonPath().getList("$").size() > 0, "Contact list is empty");

}

@Test (priority=7,enabled=true)
public void getContact() {

	 test = extent.createTest("Get Contact");
	 System.out.println("\nTest For Get Contact: ");
	 Response res = given()
	 .header("Authorization", "Bearer " + authToken)
	 .when().get("https://thinking-tester-contact-list.herokuapp.com/contacts/"+contactId);

	 //Log Body

	 res.then().log().body();

	 //validate status code and Message

	 Assert.assertEquals(res.getStatusCode(), 200);
	 System.out.println("Status Code is: " + res.getStatusCode());

	 Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 200 OK");
	 System.out.println("Status Message is: " + res.getStatusLine());

	 //Generate & Validate Id
	 String id = res.jsonPath().getString("_id");
	 Assert.assertEquals(id, contactId, "Contact ID does not match");
	 System.out.println("Generated ID Is: " + id);


	 }

	 @Test (priority=8,enabled=false)

	 public void updateContact() {

	 test = extent.createTest("Update Contact");
	 System.out.println("\nTest For Update Contact: ");

	 Response res = given()
	 .header("Authorization", "Bearer " + authToken)
	 .contentType("application/json")
	 .body("{ \n"
	 + "\"firstName\": \"Amy\", \n"
	 + "\"lastName\": \"Miller\",\n"
	 + "\"birthdate\": \"1992-02-02\", \n"
	 + "\"email\": \"amiller@fake.com\", \n"
	 + "\"phone\": \"8005554242\", \n"
	 + "\"street1\": \"13 School St.\", \n"
	 + "\"street2\": \"Apt. 5\", \n"
	 + "\"city\": \"Washington\", \n"
	 + "\"stateProvince\": \"QC\", \n"
	 + "\"postalCode\": \"A1A1A1\", \n"
	 + "\"country\": \"Canada\" \n"
	 + "}")
	 .when().put("https://thinking-tester-contactlist.herokuapp.com/contacts/"+contactId);

	 //Log Body

	 res.then().log().body();

	 //validate status code and Message
	 Assert.assertEquals(res.getStatusCode(), 200);
	 System.out.println("Status Code is: " + res.getStatusCode());

	 Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 200 OK");
	 System.out.println("Status Message is: " + res.getStatusLine());

	 //Generate & Validate Email Id
	 String email = res.jsonPath().getString("email");
	 Assert.assertEquals(email, "amiller@fake.com", "Contact email did not update");
	 System.out.println("Email Id Is: "+ email);



	 }

	 @Test (priority=9,enabled=false)
	 public void updateContactPartial() {

	 test = extent.createTest("Update Contact Partial");
	 System.out.println("\nTest For Update Contact Partially: ");

	 Response res = given()
	 .header("Authorization", "Bearer " + authToken)
	 .contentType("application/json")
	 .body("{ \n"
	 + "\"firstName\": \"Anna\" \n"
	 + "} ")
	 .when().patch("https://thinking-tester-contactlist.herokuapp.com/contacts/"+contactId); 
	//Log Body

	 res.then().log().body();

	 //validate status code and Message

	 Assert.assertEquals(res.getStatusCode(), 200);
	 System.out.println("Status Code is: " + res.getStatusCode());

	 Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 200 OK");
	 System.out.println("Status Message is: " + res.getStatusLine());

	 //Generate & Validate First Name
	 String firstName = res.jsonPath().getString("firstName");
	 Assert.assertEquals(firstName, "Anna", "Partial update failed");
	 System.out.println("First Name is: "+ firstName);

	 } 

	 
	 @Test (priority=10)
	 public void logoutUser() {

	 test = extent.createTest("Logout User");
	 System.out.println("\nTest For Logout User");

	 Response res = given()
	 .header("Authorization", "Bearer " + authToken)
	 .when().post("https://thinking-tester-contact-list.herokuapp.com/users/logout"); 
	 
	//validate status code and Message

	 Assert.assertEquals(res.getStatusCode(), 200);
	 System.out.println("Status Code is: " + res.getStatusCode());

	 Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 200 OK");
	 System.out.println("Status Message is: " + res.getStatusLine());

	 }
	} 


 



























