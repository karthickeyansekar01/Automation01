package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS06_Facebook_login_and_display_Errormessage {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebElement errormsg;
		
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
					

		Thread.sleep(7000);
		errormsg=driver.findElement(By.cssSelector("span[id='lblMsg']"));
		System.out.println(errormsg.getText());		
	}

}
