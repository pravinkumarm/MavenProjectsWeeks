package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erailwebtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MDU",Keys.TAB);
		WebElement checkbox = driver.findElementById("chkSelectDateOnly");
		if (checkbox.isSelected())
		{
			driver.findElementById("chkSelectDateOnly").click();
		}
		
	Thread.sleep(3000);
	//To get row counts
	WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
	List<WebElement> rows = table.findElements(By.tagName("tr"));
//	System.out.println("RowCount= "+rows.size());
	int rowsize = rows.size();
	for (int i = 0; i < rowsize; i++) {
		WebElement singlerow = rows.get(i);
		//To get column Counts
		List<WebElement> columns = singlerow.findElements(By.tagName("td"));
		//System.out.println("ColumnCount= " + columns.size());
		//To get exact columns
		//WebElement col = columns.get(1).getText();
		System.out.println(columns.get(1).getText());
	}
	}
	
	
			
	
		

	}

