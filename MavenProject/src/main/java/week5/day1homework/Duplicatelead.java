package week5.day1homework;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.ProjectMethods;

public class Duplicatelead extends ProjectMethods {
	@Test
	public void duplicateLead() throws InterruptedException {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("Pravin@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		String firstlead = driver.findElementByXPath("(//div[@class='x-grid3-body']//a)[3]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-body']//a)[3]").click();
		driver.findElementByXPath("(//a[@class='subMenuButton'])[1]").click();
		String title = driver.getTitle();
		String originaltitle = "Duplicate Lead | opentaps CRM";
		if (title.equalsIgnoreCase(originaltitle)) {
			System.out.println("Title is Duplicate lead");
		} else {
			System.out.println("Title is not duplicate");
		}
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		String duplicatelead = driver.findElementById("viewLead_firstName_sp").getText();
		if (firstlead.equalsIgnoreCase(duplicatelead)) {
			System.out.println("Duplicate lead name is same ");
		} else {
			System.out.println("Duplicate lead name is not same");
		}

		

	}

}
