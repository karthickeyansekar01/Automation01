package pages1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddtoCart1{

    WebDriver driver;
    WebDriverWait wait;

    public AddtoCart1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//a[contains(text(),'Nokia lumia 1520')]") private WebElement product;
    @FindBy(xpath = "//a[contains(text(),'Add to cart')]") private WebElement addtocart;
    @FindBy(id = "cartur") private WebElement cart;
    @FindBy(xpath = "//button[contains(text(),'Place Order')]") private WebElement placeorder;
    @FindBy(id = "name") private WebElement name;
    @FindBy(id = "country") private WebElement country;
    @FindBy(id = "city") private WebElement city;
    @FindBy(id = "card") private WebElement card;
    @FindBy(id = "month") private WebElement month;
    @FindBy(id = "year") private WebElement year;
    @FindBy(xpath = "//button[contains(text(),'Purchase')]") private WebElement purchase;

    public void productSelection() {
        wait.until(ExpectedConditions.elementToBeClickable(product)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addtocart)).click();

        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println("Add to cart alert: " + alert.getText());
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert appeared after add to cart.");
        }
    }

    public void checkout(String nameVal, String countryVal, String cityVal, String cardVal, String monthVal, String yearVal) {
        wait.until(ExpectedConditions.elementToBeClickable(cart)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeorder)).click();
        name.sendKeys(nameVal);
        country.sendKeys(countryVal);
        city.sendKeys(cityVal);
        card.sendKeys(cardVal);
        month.sendKeys(monthVal);
        year.sendKeys(yearVal);
        purchase.click();
    }

	
}
