package SeleniumAssignments;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS03_CreatingDiffMethodsForLoginUsingDiffLocators {
	
	 
	
	
	
	static void locatebyid() throws InterruptedException
	{
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement fbid=driver.findElement(By.id("email"));
		fbid.sendKeys("kk@gmail.com");
		WebElement fbpwd=driver.findElement(By.id("pass"));
		fbpwd.sendKeys("12345");
		Thread.sleep(1000);
		WebElement fblgn=driver.findElement(By.name("login"));
		fblgn.click();
		
		
		
	}
	
	static void locatebycss() throws InterruptedException
	{
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 	WebElement fbid=driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']"));
			fbid.sendKeys("kk13245@gmail.com");		
			WebElement fbpwd=driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']"));
			fbpwd.sendKeys("12345");
			Thread.sleep(1000);
			WebElement fblgn=driver.findElement(By.cssSelector("button[data-testid='royal-login-button']"));
			fblgn.click();
			
	}
	
	static void locatebyclassname() throws InterruptedException
	{
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
		
		
	}
	
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 
		
		String locatortype = null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter switch case value id or css or classname to execute:");
		locatortype=sc.next();
		
		switch( locatortype)
		{
		case "id":
			System.out.println("method select by id is executed");
			locatebyid();
			break;
			
		case "css":
			System.out.println("method select by css is executed");
			locatebycss();
			break;
			
		case"classname":
			locatebyclassname();
			break;
			
		}	
		
		
		

	}

}
