package week4.day1homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeeds {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();

		// handle windows

		Set<String> window = driver.getWindowHandles();
		List<String> ls = new ArrayList<>();
		ls.addAll(window);
//Go to another window

		driver.switchTo().window(ls.get(1));
		String fromlead = "10431";
		driver.findElementByXPath("(//input[@class=' x-form-text x-form-field'])[1]").sendKeys(fromlead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		// switch to previous window
		// driver.switchTo().window(ls.get(0));
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-body']//a)[1]").click();

		driver.switchTo().window(ls.get(0));
		// driver.switchTo().window(ls.get(1));
		Thread.sleep(3000);
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Thread.sleep(3000);

		// switch window

		Set<String> window1 = driver.getWindowHandles();
		List<String> ls1 = new ArrayList<>();
		ls1.addAll(window1);

		driver.switchTo().window(ls1.get(1));
		Thread.sleep(3000);
		driver.findElementByXPath("(//input[@class=' x-form-text x-form-field'])[1]").sendKeys("10432");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		// driver.switchTo().window(ls.get(0));
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-body']//a)[1]").click();
		driver.switchTo().window(ls1.get(0));
		driver.findElementByLinkText("Merge").click();

		// alert
		driver.switchTo().alert().accept();

		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//label[text()='Lead ID:']//following::input[1]").sendKeys(fromlead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String text1 = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		String text2 = "No records to display";
		if (text1.equalsIgnoreCase(text2)) {
			System.out.println("No records to display");

		} else {
			System.out.println("Records available");

		}
		driver.close();
	}

}
