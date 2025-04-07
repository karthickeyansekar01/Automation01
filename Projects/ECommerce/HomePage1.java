package pages1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage1{

    WebDriver driver;
    WebDriverWait wait;

    public HomePage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(id = "login2") private WebElement login;
    @FindBy(id = "signin2") private WebElement signup;
    @FindBy(id = "loginusername") private WebElement userName;
    @FindBy(id = "loginpassword") private WebElement pass;
    @FindBy(xpath = "//button[contains(text(),'Log in')]") private WebElement loginButton;
    @FindBy(id = "sign-username") private WebElement signupname;
    @FindBy(id = "sign-password") private WebElement Signuppass;
    @FindBy(xpath = "//button[contains(text(),'Sign up')]") private WebElement signupButton;

    public void signupPage(String UN, String Pass) {
        signup.click();
        wait.until(ExpectedConditions.visibilityOf(signupname)).sendKeys(UN);
        Signuppass.sendKeys(Pass);
        signupButton.click();

        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println("Signup Alert: " + alert.getText());
            alert.accept();
        } catch (Exception e) {
            System.out.println("Signup alert did not appear.");
        }
    }

    public void loginPage(String UN, String Pass) throws InterruptedException {
        login.click();
        wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys(UN);
        pass.sendKeys(Pass);
        Thread.sleep(10000);
        loginButton.click();
    }
}
