package week5.day1homework;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.ProjectMethods;

public class Deletelead extends ProjectMethods {
	@Test
	public void delete() throws InterruptedException {

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
		String originalmessage = "No records to display";
		String message = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if (message.equalsIgnoreCase(originalmessage)) {
			System.out.println("Message is Verified");

		} else {
			System.out.println("Message is not verified");
		}

	}

}
