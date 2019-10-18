package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadsteps {
	public ChromeDriver driver;
	@Given("Open the Browser")
	public void open_the_Browser() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
	  
	}

	@And ("max Browser")
	public void max_Browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
	   
	}

	@And ("Set the Timeouts")
	public void set_the_Timeouts() {
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And ("Load the URL")
	public void load_the_URL() {
		driver.get("http://leaftaps.com/opentaps");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And ("Enter the Username")
	public void enter_the_Username() {
		driver.findElementById("username").sendKeys("demosalesmanager");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And ("Enter the Password")
	public void enter_the_Password() {
		driver.findElementById("password").sendKeys("crmsfa");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And ("Click the Login Button")
	public void click_the_Login_Button() {
		driver.findElementByClassName("decorativeSubmit").click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And ("Click CRM\\/SFA")
	public void click_CRM_SFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And ("Click Create Lead")
	public void click_Create_Lead() {
		driver.findElementByLinkText("Create Lead").click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And ("Enter Companyname")
	public void enter_Companyname() {
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And ("Enter Firstname")
	public void enter_Firstname() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Pravin");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And ("Enter Lastname")
	public void enter_Lastname() {
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on CreateLeadButton")
	public void click_on_CreateLeadButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
	    
	}

	@Then("Verify Created Successfully")
	public void verify_Created_Successfully() {
		System.out.println("Created Successfully");
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
