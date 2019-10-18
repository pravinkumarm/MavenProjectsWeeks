package week2.day2homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElementById("txtStationFrom").clear();
driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
driver.findElementById("txtStationTo").clear();
driver.findElementById("txtStationTo").sendKeys("MDU",Keys.TAB);
WebElement checkbox = driver.findElementById("chkSelectDateOnly");
char check='K';
if (checkbox.isSelected())
{
	driver.findElementById("chkSelectDateOnly").click();
}
Thread.sleep(3000);
WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
List<WebElement> rows = table.findElements(By.tagName("tr"));
int rowcount = rows.size();
for (int i=0;i<rowcount;i++)
{
	WebElement singlerow = rows.get(i);
	List<WebElement> columns = singlerow.findElements(By.tagName("td"));
	String trainname = columns.get(1).getText();
	if (trainname.charAt(0)==check) {
		System.out.println(columns.get(0).getText());
	}
}


	}
	
}
