package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA20_Handling_FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dr.get("https://demo.guru99.com/test/upload/");
		
		dr.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\kar3k\\OneDrive\\Desktop\\selenium05listSelect.png");
		
		dr.findElement(By.cssSelector("#terms")).click();
		
		Thread.sleep(1000);
		dr.findElement(By.cssSelector("#submitbutton")).click();
		
		
		
		
		
		
	}

}
