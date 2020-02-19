package com.allianzassistance.b2ces.uat.booking;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsuranceTest {

	@Test
	public void calculateInsuranceTest() {

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		// sleep for 3 seconds
		sleep(3000);
		driver.manage().window().maximize();

		String url = "https://b2c-es.uat.booking.allianz-assistance.com/iframe.html?angularparams=/TRAVEL/B2C/ES/es_ES/step-1";
		driver.get(url);


		// Select the desired insurance coverage
		WebDriverWait wait = new WebDriverWait (driver, 10);
		
		driver.findElement(By.xpath("//*[@class='caret']//preceding::span[1]")).click();
	  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='dropdown-menu_open']/child::[2]")));
		driver.findElement(By.xpath("//*[@class='dropdown-menu_open']/child::[2]")).click();
	}
	

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	}

