package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA04_FindingGoogleSearchedinput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//getting URL to validate if search happened or not by code
				String Currenturl=driver.getCurrentUrl();
				System.out.println("URL before searching:  "+Currenturl);
				
		WebElement gglSearch=driver.findElement(By.id("APjFqb"));
		gglSearch.click();
		gglSearch.sendKeys("Automation job for experienced");
		gglSearch.sendKeys(Keys.ENTER);
		
		
		
		//getting title of page to verify if search has happened
		String currentTitle=driver.getTitle();
		System.out.println("Title after searching:  "+currentTitle);
		
		
		
		if(currentTitle.equals("Automation job for experienced"))
		
			System.out.println("Search is done successful for entered input");
		
				else
		
			System.out.println("Search is not done successful");
		
			
		String posturl=driver.getCurrentUrl();
		System.out.println("URL after searching:  "+posturl);
				
		
		if (Currenturl.equals(posturl))
		System.out.println("Search does not happen");
				else
		System.out.println("Search happened by entering input from script");
		
		
		
		
	}

}
