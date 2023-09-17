package com.GroupId.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoActionClass {
	
	WebDriver driver;
	
	public DemoActionClass(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchBox = By.id("APjFqb");

	public void enterSearchTerm(String searchTerm) {
		driver.findElement(searchBox).sendKeys(searchTerm);
	}
}
