package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsw3school {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame1 = driver.findElementById("iframeResult");
		driver.switchTo().frame(frame1);
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		String value2 = "James Bond";
		alert.sendKeys(value2);
		Thread.sleep(5000);
		alert.accept();
		String value1 = driver.findElementByXPath("//P[@id='demo']").getText();
		if (value1.contains(value2)) {
			System.out.println("The string is present");
		} else {
			System.out.println("The string is not present");
		}

	}

}
