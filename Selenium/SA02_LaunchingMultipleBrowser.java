package Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SA02_LaunchingMultipleBrowser{

	public static void main(String[] args) {
		
		// in if else getting browser name and using them to open different browser based on person input
		
		
		String browserName="";
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter browser name");
		browserName=scn.nextLine();
		
		
		WebDriver driver=null;
		
		
		
		if(browserName.equals("Chrome"))
		{
			//do this
			
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.quit();
			
		}
		
		else if(browserName.equals("Edge"))
			
			
		{
			driver=new EdgeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.quit();
			
		}
		
				
		
	}

}
