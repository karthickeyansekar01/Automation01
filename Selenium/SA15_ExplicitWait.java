package Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SA15_ExplicitWait {
	
	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/"); // navigate to url

		// webdriver object, time (wait time)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// From City
		driver.findElement(By.id("src")).sendKeys("PUNE");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/div"))).click();

		// To City
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[3]/div[1]/ul/li[1]/div/text"))).click();

	
		// Calendar
		driver.findElement(By.id("onwardCal")).click();

	
		// Date
		   // Select a specific date (Example: 25th March 2025)
			String day = "27"; // Change this value as needed

			// Updated XPath for selecting a date from the calendar
			WebElement dateElement = driver.findElement(By.xpath("//span[text()='" + day + "']"));
			dateElement.click();

			// Wait for a few seconds to see the result
			try {
            Thread.sleep(3000);
			} 
			catch (InterruptedException e)
			{
            e.printStackTrace();
			}
       
		
		
		
		// Search Button
		driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/button")).click();

		// Result
		System.out.println(driver.findElement(By.xpath("/html/body/section/div[2]/div[4]/div/div[2]/div/div[2]/div[2]/div/ul/div[2]/li/div[1]/div/div[1]/div[1]/div[1]/div[1]")).getText());

		driver.close();
	}

	
	
	
	

}
