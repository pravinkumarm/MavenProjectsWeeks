package week5.day2;

//import org.openqa.selenium.WebElement;

//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ProjectMethods;

public class Createlead extends ProjectMethods {
	@Test(dataProvider="FetchData")
	public void Create(String cName,String fName,String lName ) throws InterruptedException {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);

		//driver.findElementById("createLeadForm_parentPartyId").sendKeys("Company");
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);

		driver.findElementByXPath("//input[@class='smallSubmit']").click();

	}
	
	
	@DataProvider(name="FetchData")
	public String[][] getData() {
		String[][] data=new String[2][3];
		data[0][0]="TestLeaf";
		data[0][1]="Sarath";
		data[0][2]="K";
		data[1][0]="TestLeaf";
		data[1][1]="Ram";
		data[1][2]="K";
		return data;
		
	}

}
