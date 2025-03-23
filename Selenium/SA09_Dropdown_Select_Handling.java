package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SA09_Dropdown_Select_Handling {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		WebElement dropdownlist=driver.findElement(By.id("country"));
		Select countries=new Select(dropdownlist);
			//1.	already First selected value printing	
		System.out.println("values of country dropdown list are:"+countries.getFirstSelectedOption().getText());
					
		
		List<WebElement> lst1=countries.getOptions();
			//2.	printing first index value on list
		
		System.out.println("drop down total values are "+ lst1.get(0).getText());
		
			//3.	for loop to print all values: and get index if value is India
		
		int index=0;
		for(int i=0;i<lst1.size();i++)
		{
			System.out.println("drop down value of "+i+"is :"+ lst1.get(i).getText());
		
			if(lst1.get(i).getText().equals("india"))
			{
				System.out.println("index of india is:"+index );
				
			}
		
		
		
		}
		
		
		
		
		
		
		//selecting india next value plus 1 of index
		
		System.out.println("selected next value is:"+lst1.get(index+1).getText());
		
		
		
		
			//printing using select by value index and method
		
		countries.selectByValue("100");
		 	 	
		
			WebElement dropdownlist1=driver.findElement(By.cssSelector("select[id='country']"));
			
			
			
				
		countries.selectByContainsVisibleText("Burundi");
		countries.selectByIndex(200);
		
		
		
		

	}

}
