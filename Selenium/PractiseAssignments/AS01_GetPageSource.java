package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS01_GetPageSource {

	public static void main(String[] args) {
		// Get page source
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
		System.out.println(driver.getPageSource());
		
		
		
		
		
		
		

	}

}
