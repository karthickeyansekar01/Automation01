package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS04_SampleWebpage_loggingUsingDiffLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();
		
		//using ends with CSS selector special character to identify word
		//$ - ends with mentioned character on name
		WebElement id=driver.findElement(By.cssSelector("input[name$='CustomerID']"));
		id.sendKeys("kk@gmail.com");
		//using ends with CSS selector special character to identify word
		//^ - starts with mentioned character on name
		
		WebElement pwd=driver.findElement(By.cssSelector("input[type^='pass']"));
		pwd.sendKeys("12345");
			
		Thread.sleep(1000);
		
		WebElement lgn=driver.findElement(By.cssSelector("input[class*='btn-lg']"));
		lgn.click();
					
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
