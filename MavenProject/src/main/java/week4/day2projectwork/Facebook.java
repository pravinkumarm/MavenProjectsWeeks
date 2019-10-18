package week4.day2projectwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		//Code to disable notifications
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ops);
		
		driver.get("https://www.Facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String Company="Testleaf";
driver.findElementByXPath("//input[@id='email']").sendKeys("testdemo");
driver.findElementByXPath("//input[@id='pass']").sendKeys("Testdemo@1");
driver.findElementByXPath("//input[@data-testid='royal_login_button']").click();
Thread.sleep(3000);
driver.findElementByXPath("//input[@data-testid='search_input']").sendKeys(Company);
driver.findElementByXPath("//button[@data-testid='facebar_search_button']").click();
Thread.sleep(3000);
String companytitle = driver.findElementByXPath("//a[text()='TestLeaf'][1]").getText();
if (Company.equalsIgnoreCase(companytitle)) {
	System.out.println("company name verified as :" +companytitle);
}
else {
	System.out.println("Not verified");
}

Thread.sleep(3000);


	}

}
