package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.switchTo().frame(0);
WebElement myelementdraggable = driver.findElementById("draggable");
WebElement myelementdroppable = driver.findElementById("droppable");
Actions Builder=new Actions(driver);
Builder.clickAndHold(myelementdraggable).moveToElement(myelementdroppable).perform();

	}

}
