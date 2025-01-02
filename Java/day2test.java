package seleniumbasicsay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.wait();
		
		
		
		
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
