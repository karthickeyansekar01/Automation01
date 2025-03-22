package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA06_LocatorUsingRelativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		String currentURL=driver.getCurrentUrl();
		
		WebElement search=driver.findElement(By.xpath("//textarea[@class='gLFyf']")); 
		search.sendKeys("absolutexpath");		
		search.sendKeys(Keys.ENTER);
		
		String UpdatedURL=driver.getCurrentUrl();
		
		if (currentURL.equals(UpdatedURL))
		{
			System.out.println("Expected page is not loaded");
		}
		else
		{
			System.out.println("Expected page is loaded");
		}
		
		

		
	
		 
		
		
		
	}

}
