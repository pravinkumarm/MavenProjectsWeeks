package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectitems {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.switchTo().frame(0);
WebElement Item2 = driver.findElementByXPath("//li[text()='Item 2']");
WebElement Item6 = driver.findElementByXPath("//li[text()='Item 6']");
Actions Builder=new Actions(driver);
Builder.keyDown(Keys.CONTROL).click(Item2).click(Item6).perform();
//Builder.clickAndHold(Item2).click(Item6).perform();
	}

}
