package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;



public class LearnWindows {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Contact Us").click();

//take Snap

		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/imp.png");
		FileUtils.copyFile(src, desc);

		// Window handle

		Set<String> allwindow = driver.getWindowHandles();
		List<String> ls = new ArrayList<>();
		ls.addAll(allwindow);

		String value = "New Delhi";

		System.out.println(driver.getTitle());

		driver.switchTo().window(ls.get(1));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		String value2 = driver
				.findElementByXPath("//b[text()=\"Registered Office / Corporate Office : \"]/following::p").getText();

		if (value2.contains(value)) {
			System.out.println("It Exists");

		} else {
			System.out.println("Not Exists");
		}
		driver.switchTo().window(ls.get(0));
		driver.close();
		driver.switchTo().window(ls.get(1));
		driver.close();
	}

}
