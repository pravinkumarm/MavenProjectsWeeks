package utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods {
	public ChromeDriver driver;

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

}
