package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SA10_MultiSelect_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement multiselect=driver.findElement(By.id("multiselect1"));
		Select selobj= new Select(multiselect);
		List<WebElement> lst2= selobj.getOptions();
		
		System.out.println(lst2.get(0).getText());   //value is fetching so we have control on it
		
		selobj.selectByIndex(3);
		Thread.sleep(2000);
		selobj.selectByValue("volvox");
		Thread.sleep(2000);
		selobj.deselectAll();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
