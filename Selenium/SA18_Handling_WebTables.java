package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA18_Handling_WebTables {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

					List<WebElement> lst= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead"));
					for(WebElement h: lst)
					{
						System.out.println("header values are:"+h.getText());
						
					}
		
		
					List<WebElement> lst1= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
					
					
					
					for(int i=1;i<lst1.size();i++)
					{
						System.out.println("Index" + i + ": "+ driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[1]")).getText());
						
					
					}
					
					
		
		

	}

}