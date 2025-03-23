package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS07_IS_selected_enabled_displayed_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		WebElement checkboxbtn=driver.findElement(By.cssSelector("input[name^='chk_altemail']"));
		
		checkboxbtn.click();
		boolean res,res1,res2;
		res=checkboxbtn.isSelected();
		res1=checkboxbtn.isEnabled();
		res2=checkboxbtn.isEnabled();

		
		if (checkboxbtn.isSelected())
		{
			System.out.println("already selected,checkbox:"+res);
		}
		
		
		 if(checkboxbtn.isEnabled())
			
		{
			
			System.out.println("already enabled,checkbox:"+res1);
		}
		
		 if(checkboxbtn.isDisplayed())
		{
			System.out.println("already displayed,checkbox:"+res2);
		
			
		}
		
		else
		{
			
			
			checkboxbtn.click();
			System.out.println("now checkbox is selected"+res);

			
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
