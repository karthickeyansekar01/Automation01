package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS02_FindingLocatorsByClassName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement fbid=driver.findElement(By.className("inputtext"));
		fbid.sendKeys("kk13245@gmail.com");		
		WebElement fbpwd=driver.findElement(By.className("_9npi"));
		fbpwd.sendKeys("12345");
		Thread.sleep(1000);
		WebElement fblgn=driver.findElement(By.className("_42ft"));
		fblgn.click();
		
				
	/*	
		
		
		
		
	*/
				
			
		
		
		
		
		
		
		
		
		
	}

}
