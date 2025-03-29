package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNG03_AllAnnotations {
  @Test
  public void testcase1() {
  System.out.println("testcase1: main execution as first testcase,starts from here");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod:before running each testcase,beforeMethod runs then this tc will start");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod:after running each testcase,afterMethod runs then next tc will run");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest:before all test executing this test will run as initialise few basics");
  }

  @AfterTest
  public void afterTest() {
  
	  System.out.println("AfterTest:After all test executing this test will run as closeing all open stuffs");

  }
  
  

}
