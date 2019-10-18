package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
driver.findElementById("createLeadForm_firstName").sendKeys("Pravin");
driver.findElementById("createLeadForm_lastName").sendKeys("Murugesan");
WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
Select dropdown=new Select(industry);
//dropdown.selectByVisibleText("Finance");
//dropdown.selectByValue("IND_FINANCE");
dropdown.selectByIndex(5);
List<WebElement> options = dropdown.getOptions();
for (WebElement singleelement : options) {
	String text = singleelement.getText();
	System.out.println(text);
	
}
	}

}
