package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TNG07_DependsFunctionality {
	
	
							//checking with if condition is true means then use SkipException and skip the test
							//
	
	
	
							//setting flag and skipping test also using depends to skip dependency methods also
							//for here open RedBus is a main method to execute lets say, we are skipping other two depending methods eg:
							//if main method not executing what is need to execute sub methods
	
	
	//boolean flag= false;	//for executing all methods
	  boolean flag= true;	//for skipping using SkipException and depends on methods
	@Test(priority='1')
	
		
	  public void openRedbus() {
							
		
							//skipping the execution of main redbus login itself
		
		if(flag) throw new SkipException("skipping this main redbus opening");
		  WebDriver driver= new ChromeDriver();
		  
		  System.out.println("redbus is opening");
		  driver.get("https://www.redbus.in");
		  driver.manage().window().maximize();
		  System.out.println("the title is:"+driver.getTitle());
		  driver.close();	 
	  }

	
	 @Test(priority='2',dependsOnMethods= {"openRedbus"})
	 
	 
	 
	  public void redbusRailways() {
		  
		  WebDriver driver= new ChromeDriver();
		  
		  System.out.println("Google is opening");
		  driver.get("https://www.redbus.in/railways");
		  driver.manage().window().maximize();
		  System.out.println("the title is:"+driver.getTitle());
		  driver.close(); 
	  }
	  
	  @Test(priority='3',dependsOnMethods= {"openRedbus","redbusRailways"})
	  
	  public void redbusHelp() {
		  
		  WebDriver driver= new ChromeDriver();
		  
		  System.out.println("redbus help is opening");
		  driver.get("https://www.redbus.in/info/redcare");
		  driver.manage().window().maximize();
		  System.out.println("the title is:"+driver.getTitle());
		  driver.close();
		  	 
	  }
	  
	    
  
  
}
