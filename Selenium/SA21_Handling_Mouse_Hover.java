package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SA21_Handling_Mouse_Hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://istqb.in/");
		
		Actions act = new Actions(dr);
		WebElement specilist = dr.findElement(By.linkText("SPECIALIST"));
		act.moveToElement(specilist).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
