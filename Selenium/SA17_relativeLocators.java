package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SA17_relativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://facebook.com");
		
		
		//similar to other locator but it comes with .with(By.id("name"))) and then above,below we can mention another locator .above(by.id("pwd"))
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("pass")))
		.sendKeys("kk12345@gmail.com");
		
		
		
		
		
		
		
		
		
	}

}
