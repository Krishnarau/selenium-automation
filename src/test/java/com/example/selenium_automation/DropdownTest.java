package com.example.selenium_automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

	
	@Test
	public void dropDownTest() throws IOException {
		
		WebElement element = driver.findElement(By.xpath("//a[@id='dropdown-checkboxes-radiobuttons']"));

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

		String language = ExcelUtils.getCellData(path, "Sheet2", 1, 0);

		System.out.println("FirstName from Excel: " + language);
		
		String ide = ExcelUtils.getCellData(path, "Sheet2", 1, 1);

		
		System.out.println("LastName from Excel: " + ide);
        String technology = ExcelUtils.getCellData(path, "Sheet2", 1, 2);

		System.out.println("email from Excel: " + technology);
        
		
		DropdownPage dp=new DropdownPage(driver);
		
		dp.selectJava(language);
		dp.selectEclipse(ide);
		dp.selectHTML(technology);
		
		
		
	}
	
}

