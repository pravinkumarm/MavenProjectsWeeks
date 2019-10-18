package week2.day1homework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Railway {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
driver.manage().window().maximize();
driver.findElementById("userRegistrationForm:userName").sendKeys("Pravin");
driver.findElementById("userRegistrationForm:password").sendKeys("password");
driver.findElementById("userRegistrationForm:confpasword").sendKeys("password");
WebElement Secques = driver.findElementById("userRegistrationForm:securityQ");
Select dropdownsecques=new Select(Secques);
dropdownsecques.selectByIndex(3);
driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("answer");
driver.findElementById("userRegistrationForm:firstName").sendKeys("Pravin");
driver.findElementById("userRegistrationForm:middleName").sendKeys("Kumar");
driver.findElementById("userRegistrationForm:lastName").sendKeys("Murugesan");
driver.findElementById("userRegistrationForm:gender:0").click();
driver.findElementById("userRegistrationForm:maritalStatus:0").click();
WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
Select dropdownoccupation=new Select(occupation);
dropdownoccupation.selectByVisibleText("Public");
driver.findElementById("userRegistrationForm:uidno").sendKeys("1234");
driver.findElementById("userRegistrationForm:idno").sendKeys("BIROOWPP");
WebElement Country = driver.findElementById("userRegistrationForm:countries");
Select dropdownCountry=new Select(Country);
dropdownCountry.selectByValue("94");
driver.findElementById("userRegistrationForm:email").sendKeys("pravin@gmail.com");
driver.findElementById("userRegistrationForm:mobile").sendKeys("4324234324");
WebElement Nationality = driver.findElementById("userRegistrationForm:nationalityId");
Select dropdownNationality=new Select(Nationality);
dropdownNationality.selectByVisibleText("India");
driver.findElementById("userRegistrationForm:address").sendKeys("Address");
driver.findElementById("userRegistrationForm:street").sendKeys("Street");
driver.findElementById("userRegistrationForm:area").sendKeys("Area");
driver.findElementById("userRegistrationForm:pincode").sendKeys("625020",Keys.TAB);
Thread.sleep(3000);
WebElement Cityname = driver.findElementById("userRegistrationForm:cityName");
Select dropdownCityname=new Select(Cityname);
dropdownCityname.selectByVisibleText("Madurai");
Thread.sleep(3000);
WebElement postoffice = driver.findElementById("userRegistrationForm:postofficeName");
Select dropdownpostoffice=new Select(postoffice);
dropdownpostoffice.selectByVisibleText("Andarkottaram B.O");
Thread.sleep(3000);
driver.findElementById("userRegistrationForm:landline").sendKeys("3424234");
driver.close();
	}

}
