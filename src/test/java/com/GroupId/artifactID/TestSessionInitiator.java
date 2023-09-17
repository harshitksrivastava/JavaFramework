package com.GroupId.artifactID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.GroupId.keywords.DemoActionClass;

public class TestSessionInitiator {
	
	public DemoActionClass demoActionClass ;
	
	public WebDriver driver;
	
	public TestSessionInitiator() {
		WebDriverInitiator wdInitiator = new WebDriverInitiator();
		this.driver = wdInitiator.webDriverSetup();
		initiate();
	}
	
	public void initiate() {
		demoActionClass = new DemoActionClass(driver);
	}
		
	public void launchApplication(String url) {
		driver.get(url);
	}
	
	public void quitSession() {
		driver.quit();
	}
	
	public void closeSession() {
		driver.close();
	}
	
}
