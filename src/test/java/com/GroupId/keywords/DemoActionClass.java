package com.GroupId.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DemoActionClass {
	
	WebDriver driver;
	By searchBox = By.id("APjFqb");
	
	public DemoActionClass(WebDriver driver) {
		this.driver = driver;
	}
		

	public void enterSearchTerm(String searchTerm) {
		driver.findElement(searchBox).sendKeys(searchTerm);
	}
	
	public void verifyUrl(String expectedUrl) {
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl),"The URL is not the specified one");
	}
}
