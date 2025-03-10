package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA03_FindingLocatorsbyID {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement fbid=driver.findElement(By.id("email"));
		fbid.sendKeys("kk@gmail.com");
		WebElement fbpwd=driver.findElement(By.id("pass"));
		fbpwd.sendKeys("12345");
		Thread.sleep(1000);
		WebElement fblgn=driver.findElement(By.name("login"));
		fblgn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
