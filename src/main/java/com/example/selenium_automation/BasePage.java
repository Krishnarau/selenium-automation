/**
 * 
 */
package com.example.selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 */
public class BasePage {
	
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void selectDropdown(WebElement dropdown, String value) {
		
		Select select=new Select(dropdown);
		
		select.selectByVisibleText(value);
	}

}
