package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNG04_AllAnnotations_realtimeExample {
	
	@BeforeTest					//1st step - general overall 1st step
	  public static void beforeTest() {

		System.out.println("All Execution will start now");
		  
	  }

	
	 @BeforeMethod				//2nd step - prepares browser
	  public void beforeMethod() {
		  System.out.println("CNN is opening");
		  
		  
		 
	  }
	 
	 @Test						//3rd step - does some operations in browser -opens,maximizes,getsTitle
	  public static void testcase1() throws InterruptedException  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.CNN.com");
		  driver.manage().window().maximize();
		//  Thread.sleep(30000);
		  System.out.println("the title is:"+driver.getTitle());
		  driver.close();
		  
	  
	  }
	
	 @AfterMethod				//4th step -closes browser
	  public void afterMethod() {
		  System.out.println("CNN is closed");
		//  WebDriver driver=new ChromeDriver();
		 
		  
	  }
	 
	 @AfterTest					//5th step -quitting overall
	  public void afterTest() {
	  
		  System.out.println("AfterTest:After all test executing this test will run as closeing all open stuffs");
		 
		//  driver.quit();
	  }
	  
	  
	
	
  
  
  
 
  
 
  
 

}
