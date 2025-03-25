package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA24_HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dr.get("https://www.naukri.com/");
        JavascriptExecutor js = (JavascriptExecutor) dr;
		
       
		js.executeScript("window.scrollBy(0,300)", "");
		
		
		dr.findElement(By.xpath("(//a[@title='MNC'])[2]")).click();
		
		System.out.println("Title "+ dr.getTitle());
		
		Set<String> windows = dr.getWindowHandles(); // sorted set 
		Iterator<String>	it = windows.iterator();
		String mainWindow = it.next(); // main window
		String childWindow = it.next(); // child window.
		
		System.out.println("MainWindow "+ mainWindow);
		System.out.println("ChildWindow "+ childWindow);
		
		dr.switchTo().window(childWindow); // move selenium control to child window.
		
		Thread.sleep(5000);
		
		System.out.println(dr.getTitle());
		
		dr.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();

		
		
		
		
		
		
		
		
		
		
		
	}

}
