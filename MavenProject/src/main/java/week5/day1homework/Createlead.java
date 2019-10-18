package week5.day1homework;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utils.ProjectMethods;

public class Createlead extends ProjectMethods {
	@Test
	public void Create() throws InterruptedException {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
//		driver.findElementByXPath("//img[@src='/images/fieldlookup.gif']").click();
		// String handle = driver.getWindowHandle();
		// driver.switchTo().window(handle);
		// Thread.sleep(3000);
		// driver.findElementByXPath("//input[@class=' x-form-text x-form-field
		// ']").sendKeys("a");
//		driver.findElementByXPath("//table[@class='x-btn-wrap x-btn ']").click();
		driver.findElementById("createLeadForm_parentPartyId").sendKeys("Company");
		driver.findElementById("createLeadForm_firstName").sendKeys("Pravin");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");

		WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(Source);
		dropdown.selectByVisibleText("Direct Mail");
		WebElement marketingcampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown1 = new Select(marketingcampaign);
		dropdown1.selectByVisibleText("Car and Driver");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Pravin");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Kumar");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Title");
		driver.findElementById("createLeadForm_birthDate").sendKeys("03/20/19");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Department");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("30000");
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select dropdown2 = new Select(currency);
		dropdown2.selectByValue("INR");
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown3 = new Select(industry);
		dropdown3.selectByVisibleText("Distribution");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("213213");
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdown4 = new Select(ownership);
		dropdown4.selectByVisibleText("Corporation");
		driver.findElementById("createLeadForm_sicCode").sendKeys("21");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("3");
		driver.findElementById("createLeadForm_description").sendKeys("Description");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Importantnote");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("433432");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("423");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("s");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("Pravin@gmail.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Toname");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Attensionname");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Address1");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Address2");
		driver.findElementById("createLeadForm_generalCity").sendKeys("City");
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropdown5 = new Select(country);
		dropdown5.selectByVisibleText("India");
		Thread.sleep(3000);
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dropdown6 = new Select(state);
		dropdown6.selectByVisibleText("TAMILNADU");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("625020");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("032");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@class='smallSubmit']").click();

		

	}

}
