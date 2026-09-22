
package com.example.selenium_automation;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest{

	@Test
	public void contactTest() throws IOException {
		// By.xpath("//a[@id='contact-us']")

		
		WebElement element = driver.findElement(By.xpath("//a[@id='contact-us']"));

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
		String path = System.getProperty("user.dir") + "/src/test/resources/TestData1.xlsx";

		String name = ExcelUtils.getCellData(path, "Sheet1", 0, 1);

		System.out.println("FirstName from Excel: " + name);
		
		String lastName = ExcelUtils.getCellData(path, "Sheet1", 1, 1);

		
		System.out.println("LastName from Excel: " + lastName);
        String email = ExcelUtils.getCellData(path, "Sheet1", 2, 1);

		System.out.println("email from Excel: " + email);
        
        String message = ExcelUtils.getCellData(path, "Sheet1", 3, 1);

		System.out.println("message from Excel: " + message);
		
		ContactPage contactpage=new ContactPage(driver);

		contactpage.enterName(name);
		
		contactpage.enterLastName(lastName);
		
		contactpage.enterMessage(message);
		        
		contactpage.clickSubmit();
		/*
		 * driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(
		 * "Krishna");
		 * 
		 * driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Raut");
		 * 
		 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys(
		 * "krishna@gmail.com");
		 * 
		 * driver.findElement(By.xpath("//textarea[@name='message']")).
		 * sendKeys("Contact details");
		 * 
		 * driver.findElement(By.xpath("//input[@type='submit']")).submit();
		 */
	}
	
	

}