package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA08_Checking_Box_or_Button_isSelected {

	public static void main(String[] args) {
		
		
		
		
		

			WebDriver driver=new ChromeDriver();
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			driver.manage().window().maximize();
			
			WebElement checkboxbtn=driver.findElement(By.cssSelector("input[name^='chk_altemail']"));
			
			checkboxbtn.click();
			
			
			if (checkboxbtn.isSelected())
			{
				System.out.println("already selected");
			}
			else
			{
				
				
				checkboxbtn.click();
				System.out.println("now checkbox is selected");

				
				
			}
		
		

	}

}
