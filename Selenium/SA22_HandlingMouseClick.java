package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SA22_HandlingMouseClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(dr);
		
		WebElement rightClick = dr.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.moveToElement(rightClick).contextClick().perform();
		act.contextClick(rightClick).perform();
		
		
		WebElement dblClick = dr.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.moveToElement(dblClick).doubleClick().perform();
		//act.doubleClick(dblClick).perform();
		
		dr.switchTo().alert().accept(); // accepts the alert.
		
		
		
		
		
		
		
		
		
		
		
	}

}
