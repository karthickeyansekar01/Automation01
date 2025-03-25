package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA19_HandlingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alert alt ;
		WebDriver dr = new ChromeDriver();
	
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dr.get("https://demoqa.com/alerts");
			
dr.findElement(By.id("promtButton")).click();
		
		alt = dr.switchTo().alert();
		
		alt.sendKeys("Karthick");
		
		alt.accept();
		
		System.out.println(dr.findElement(By.id("promptResult")).getText());
		
		dr.close();
		
		
		
		
		
		
	}

}
