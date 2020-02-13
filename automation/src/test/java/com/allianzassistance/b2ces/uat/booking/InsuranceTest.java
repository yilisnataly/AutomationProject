package com.allianzassistance.b2ces.uat.booking;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

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

		// sleep for 5 seconds
		sleep(5000);
		

		// Select the desired insurance coverage
		Select oSelect = new Select (driver.findElement(By.xpath("//button[@title='Seleccionar']")));
		oSelect.selectByVisibleText("Vacaciones");
		//driver.findElement(By.xpath("//div[@class='ng-scope']/div/div[@class='ng-scope']//div[@class='region-primary']/div[@class='ng-scope primary']//form[@name='step1form']/div[1]/div[2]/button[@title='Seleccionar']/span[@class='filter-option pull-left']")).click();
		//driver.findElement(By.xpath("//select[@id='typeOfCover']/optgroup/option[2]")).click();
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

