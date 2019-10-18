package week4.day2projectwork;

import java.util.ArrayList;
//import java.util.Calendar;
import java.util.Collections;
//import java.util.Date;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
import java.util.concurrent.TimeUnit;

//import org.apache.poi.hssf.record.InterfaceEndRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//div[@class='component-popular-locations']/div[2]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='months']/following::div[@class='day low-price'][1]").click();
		driver.findElementByXPath("//button[text()='Next']").click();

		/*
		 * //to find datetime
		 * 
		 * String daterun =
		 * driver.findElementByXPath("//div[@class='label time-label'][1]").getText();
		 * System.out.println(daterun); Calendar calendar=Calendar.getInstance();
		 * calendar.add(Calendar.DAY_OF_YEAR,1); int date = calendar.DATE;
		 * System.out.println(date);
		 */

		driver.findElementByXPath("//button[text()='Done']").click();
		List<WebElement> carlist = driver.findElements(By.xpath("//div[@class='car-item']"));
		System.out.println(carlist.size());
		// int count = carlist.size();
		List<WebElement> pricecount = driver.findElements(By.xpath("//div[@class='price']"));

		List<Integer> all = new ArrayList<>();

		for (WebElement price : pricecount) {
			// System.out.println(price.getText().replaceAll("\\D",""));
			int val = Integer.parseInt(price.getText().replaceAll("\\D", ""));

			all.add(val);

		}
		Integer max = Collections.max(all);
		System.out.println("Maximum Price =" + max);
		String brand = driver
				.findElementByXPath("//div[contains(text(),'" + max + "')]/preceding::div[@class='details'][1]/h3")
				.getText();
		System.out.println("BrandName= " + brand);

		driver.findElementByXPath("//div[contains(text(),'" + max + "')]/following::button[text()='BOOK NOW'][1]")
				.click();
		Thread.sleep(3000);
		driver.close();

	}

}
