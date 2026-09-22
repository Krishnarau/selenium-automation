package com.example.selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.webdriveruniversity.com/");


	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
