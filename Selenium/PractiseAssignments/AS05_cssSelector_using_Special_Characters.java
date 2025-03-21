package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS05_cssSelector_using_Special_Characters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();
		WebElement id=driver.findElement(By.name("txtCustomerID"));
		id.sendKeys("kk@gmail.com");
		
		WebElement pwd=driver.findElement(By.cssSelector("input[type='password']"));
		pwd.sendKeys("12345");
			
		Thread.sleep(1000);
		WebElement fblgn=driver.findElement(By.name("Butsub"));
		fblgn.click();
					
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
