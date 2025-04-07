package scenario1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.util.*;
import utility.Utility;



public class OHRM_DDT {
  
	public static WebDriver driver = new ChromeDriver();
	String fpath = "C:\\Users\\kar3k\\OneDrive\\Desktop\\LoginData.xlsx";
//	String fpath = System.getProperty("user.dir") +"\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	ExtentSparkReporter htmlreport;
	ExtentReports report;
	ExtentTest test;
	
//	String extentreportpath = System.getProperty("user.dir")+ "\\Report.html\"";
	String extentreportpath = "C:\\Users\\kar3k\\OneDrive\\Desktop\\reports\\Report1.html";
	@Test(dataProvider = "loginData")
	public void Ohrmlogin(String un, String ps) throws InterruptedException
	{
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(ps);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
	}
	@DataProvider
	public Object[][] loginData() {
	int totalrows = sheet.getPhysicalNumberOfRows();
	String[][] logindata = new String[totalrows - 1][2];
	for (int i = 0; i < totalrows - 1; i++) {
	row = sheet.getRow(i + 1);
	for (int j = 0; j < 2; j++) {
	cell = row.getCell(j);
	logindata[i][j] = cell.getStringCellValue();
	}
	}
	return logindata;
	}
	@BeforeTest
	public void beforeTest() throws IOException {
	file = new File(fpath);
	fis = new FileInputStream(file);
	wb = new XSSFWorkbook(fis);
	sheet = wb.getSheetAt(0);
	
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	// Extent Report initialization
	htmlreport = new ExtentSparkReporter(extentreportpath);
	report = new ExtentReports();
	report.attachReporter(htmlreport);
	// setting environment for Extent report
	report.setSystemInfo("Machine name:", "HP");
	report.setSystemInfo("Tester name:", "Rajalakshmi");
	report.setSystemInfo("OS", "Windows 11");
	report.setSystemInfo("Browser", "Google Chrome");
	// Configuration of the report
	htmlreport.config().setDocumentTitle("OHRM_Login_Report");
	htmlreport.config().setReportName("OHRM_Login_Details");
	htmlreport.config().setTheme(Theme.STANDARD);
	htmlreport.config().setTimeStampFormat("EEEE MM DD,yyyy HH:mm:ss");
	}
	
	
	
	@AfterMethod
	public void afterMethod() throws Exception {
	String current_url = driver.getCurrentUrl();
	Assert.assertTrue(current_url.contains(current_url), "URl does not match");
	if (current_url.contains("dashboard")) {
	System.out.println("Test Case Pass");
	Thread.sleep(3000);
	Utility.getScreenshot(driver);
	
	test = report.createTest("OHRM Valid Login");
	test.log(Status.PASS, MarkupHelper.createLabel("OHRM Login:Pass", ExtentColor.GREEN));
	driver.findElement(By.xpath("//i[contains(@class,'oxd-userdropdown-icon')]")).click();
	driver.findElement(By.linkText("Logout")).click();
	}
	else {
	System.out.println("Test Case Fail");
	Thread.sleep(3000);
	
	Utility.getScreenshot(driver);
	test = report.createTest("OHRM Invalid Login");
	test.log(Status.FAIL, MarkupHelper.createLabel("OHRM Login:Fail", ExtentColor.RED));
	}
	}
	
}
