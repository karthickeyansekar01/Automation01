package Testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


//when more test is there TESTNG will run in camel case with first alphabet on test case name
//TESTNG does not know how to prioritize test
//so we use priority to which case runs first
//cons- no order in execution, every time browsers opens and closes instead of one time event.


public class TNG01_firsttest {
  @Test(priority='2')
  public void openGoogle() {
	  
	  WebDriver driver= new ChromeDriver();
	  
	  System.out.println("Google is opening");
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  System.out.println("the title is:"+driver.getTitle());
	  driver.close(); 
  }
  
  @Test(priority='1')
  public void openFacebook() {
	  
	  WebDriver driver= new ChromeDriver();
	  
	  System.out.println("facebook is opening");
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  System.out.println("the title is:"+driver.getTitle());
	  driver.close();
	  	 
  }
  
  @Test(priority='3')
  public void openCNN() {
	  
	  WebDriver driver= new ChromeDriver();
	  
	  System.out.println("CNN is opening");
	  driver.get("https://www.CNN.com");
	  driver.manage().window().maximize();
	  System.out.println("the title is:"+driver.getTitle());
	  driver.close();	 
  }
  
  
  
  
  
  
  
  
}
