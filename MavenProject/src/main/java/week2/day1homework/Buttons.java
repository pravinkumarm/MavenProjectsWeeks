package week2.day1homework;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElementById("home").click();
driver.findElementByXPath("//a[@href='pages/Button.html']").click();
Point location = driver.findElementById("position").getLocation();
System.out.println(location);
String cssValue = driver.findElementById("color").getCssValue("background-color");
System.out.println(cssValue);
Dimension size = driver.findElementById("size").getSize();
System.out.println(size);
driver.close();
	}

}
