package week2.day1homework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/Edit.html");
driver.manage().window().maximize();
driver.findElementById("email").sendKeys("pravin@gmail.com");
//driver.findElementByXPath("//input[@value='Append ']").clear();
driver.findElementByXPath("//input[@value='Append ']").sendKeys("Junior",Keys.TAB);
String text = driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value");
System.out.println(text);
driver.findElementByXPath("//input[@value='Clear me!!']").clear();
boolean displayed = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
if (displayed==true){
	System.out.println("Editfield is Enabled");
}
	else
	{
		System.out.println("Editfield is not Enabled");		
	}

	
}
}


