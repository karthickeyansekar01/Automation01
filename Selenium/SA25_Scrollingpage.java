package Selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA25_Scrollingpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dr.get("https://echoecho.com/school.htm");
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		
		js.executeScript("window.scrollBy(0,600)", ""); // top to down
		//js.executeScript("window.scrollBy(300,0)", ""); left to right
		
		
		
		
		
		
		
		
		
	}

}
