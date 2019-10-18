package week2.day2homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class Editlead {

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
		driver.findElementByXPath("//div[@class='x-grid3-body']//a").click();
		String title = driver.getTitle();
		//System.out.println(title);
		String Title1="View Lead | opentaps CRM";
		if (title.equalsIgnoreCase(Title1))
		{
			System.out.println("Title is succcesfully Verified");
		}
		else {
			System.out.println("Title is not Verified");
		}
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
		Thread.sleep(3000);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TestDemo");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@value='Update']").click();
		
		Thread.sleep(3000);
		String textcompanyname = driver.findElementById("viewLead_companyName_sp").getText();
		//System.out.println(textcompanyname);
		String updatedindex="TestDemo";
		if (textcompanyname.startsWith(updatedindex))
		{
			System.out.println(" Company name Verified");
		}
		else {
			System.out.println("Company name Not verified");
		}
driver.close();
	}

}
