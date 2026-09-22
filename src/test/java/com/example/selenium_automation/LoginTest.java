package com.example.selenium_automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	
	public void loginTest() throws IOException {
		
		WebElement element = driver.findElement(By.xpath("//a[@id='login-portal']"));

		Actions action = new Actions(driver);

		action.scrollToElement(element).build().perform();

		String parentWindow = driver.getWindowHandle();

		element.click();

		// Switch to contact us window

		for (String window : driver.getWindowHandles()) {

			if (!window.equals(parentWindow)) {

				driver.switchTo().window(window);
			}

		}
		ConfigReader.loadProperties();
		
		String username= ConfigReader.getProperty("username");
		
		String password= ConfigReader.getProperty("password");
		
		LoginPage loginPage= new LoginPage(driver);
		
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		
		
	}
	
}
