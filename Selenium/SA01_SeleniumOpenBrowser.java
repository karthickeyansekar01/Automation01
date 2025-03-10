package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA01_SeleniumOpenBrowser {

	public static void main(String[] args) {
		// opening browser using web driver
		//prerequisite - add selenium_server in prop-java build path - classpath
		//here we are opening browser then getting title and validating if its true or false 
		//printing validation result using if else loop
	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//verify title of web page
		String ActualRes=driver.getTitle();
		
		String ExpectedRes="Google";
		
		if(ExpectedRes.equals(ActualRes))
		{
			System.out.println("Title validation is done successful");
			
		}
		
		else
			System.out.println("Title validation is not done successful");
		
		
		
		driver.quit();
		System.out.println("Title of browser is:"+ActualRes);
		 
		//validating actual vs expected result 
		
		
		
		
		
		
		
	}

}
