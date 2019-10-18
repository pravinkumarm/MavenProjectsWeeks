package week2.day2homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class Deletelead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("Pravin@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		String LeadId = driver.findElementByXPath("//div[@class='x-grid3-body']//a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-body']//a").click();
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(LeadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		String originalmessage="No records to display";
		String message = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if (message.equalsIgnoreCase(originalmessage))
		{
			System.out.println("Message is Verified");

		}
		else
		{
			System.out.println("Message is not verified");
		}
		
driver.close();
	}

}
