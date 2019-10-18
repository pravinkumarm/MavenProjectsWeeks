package utils;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.day2.ReadExcel2;

public class ProjectMethodsforexcel {
	public ChromeDriver driver;
public String dataSheetName;
	@Parameters({ "URL", "Username", "password" })

	@BeforeMethod

	public void startApp(String URL, String Username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementById("username").sendKeys(Username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}

	@DataProvider(name = "FetchData")
	public String[][] getData() throws IOException {
		ReadExcel2 excel = new ReadExcel2();
		return excel.readExcel(dataSheetName);

	}

}
