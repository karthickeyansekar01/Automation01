package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA05_FindingLocatorsByName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement fbid=driver.findElement(By.name("email"));
		fbid.sendKeys("kk13245@gmail.com");		
		WebElement fbpwd=driver.findElement(By.name("pass"));
		fbpwd.sendKeys("12345");
		Thread.sleep(1000);
		WebElement fblgn=driver.findElement(By.name("login"));
		fblgn.click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
