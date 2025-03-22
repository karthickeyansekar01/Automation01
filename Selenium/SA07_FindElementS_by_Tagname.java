package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA07_FindElementS_by_Tagname {

	public static void main(String[] args) {
		
		//Finding how many links present in google page and printing them
		// we are using webElements and so we need to use <WebElement>list interface to use list interface object
		// findElements returns more number of items so we need a list to store them not array to store it due to size constraint of array

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> items;
		
		
		items=driver.findElements(By.tagName("a"));
		
		
		
		for(int i=0;i<items.size();i++)
		{
			
			System.out.println("items" + i +"value is :" +items.get(i).getText());
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
