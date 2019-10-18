package week5.day2;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.ProjectMethodsforexcel;



public class Createleadusingexcel extends ProjectMethodsforexcel {
	@BeforeTest
	
	public void setdata() {
		dataSheetName="CL";
	}
	
	@Test(dataProvider = "FetchData")
	public void Create(String cName, String fName, String lName) throws InterruptedException {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);

		// driver.findElementById("createLeadForm_parentPartyId").sendKeys("Company");
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);

		driver.findElementByXPath("//input[@class='smallSubmit']").click();

	}

	

}
