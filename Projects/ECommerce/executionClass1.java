package pages1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages1.AddtoCart1;;

public class executionClass1{

    WebDriver driver;
    HomePage1 homePage;
    AddtoCart1 addtoCart;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        homePage = new HomePage1(driver);
        addtoCart = new AddtoCart1(driver);
    }

    @Test(priority = 1)
    public void signupNew() {
     //   String randomUser = "test" + System.currentTimeMillis();
        String randomUser = "test23@123";
        homePage.signupPage(randomUser, "Pass12345");
    }

    @Test(priority = 2, dependsOnMethods = "signupNew")
    public void login() throws InterruptedException {
        String user = "test23@123"; // Replace this if using dynamic signup
        homePage.loginPage(user, "Pass12345");
        Thread.sleep(10000);
       // Assert.assertTrue(driver.findElement(By.id("nameofuser")).isDisplayed(), "Login failed!");
    }

    @Test(priority = 3)
    public void checkout() {
        addtoCart.productSelection();
        addtoCart.checkout("Test", "USA", "Newyork", "12345678", "12", "2025");
        Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]")).isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
