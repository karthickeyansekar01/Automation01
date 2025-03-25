package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA11_ReadingTextFromElement_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String colorname;

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		
		//input[@name='color'])[2] --relative xpath with specific input mentioned at end
			
		//*[@id='post-body-7702345506409447484'] -- * means wherever this id present show
				
				
		//div[@id='post-body-7702345506409447484']/div/input[2] -- step by step tracking from div which had id to input is nt straight forward
				
				
		driver.findElement(By.xpath("//div[@id='post-body-7702345506409447484']/div/input[2]")).click();

		
		colorname=driver.findElement(By.xpath("//div[@id='post-body-7702345506409447484']/div/input[2]")).getText();
		System.out.println("color selected is:"+colorname );
		
		colorname=driver.findElement(By.xpath("//div[@id='post-body-7702345506409447484']/div/input[2]")).getAttribute("value");
		System.out.println("color selected using getAttribute is:"+colorname );
		
		colorname=driver.findElement(By.xpath("//div[@id='post-body-7702345506409447484']/div/input[2]")).getDomAttribute("value");
		System.out.println("color selected using DOMAttribute is:"+colorname );
		
		colorname=driver.findElement(By.xpath("//div[@id='post-body-7702345506409447484']/div/input[2]")).getCssValue("value");
		System.out.println("color selected using Css Value is:"+colorname );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
