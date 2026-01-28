package com.GroupId.artifactID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverInitiator {
	
	
	public WebDriver webDriverSetup() {		
//		System.setProperty("webdriver.chrome.driver", "/home/admin1/eclipse-workspace/artifactID/src/test/resource/webDrivers/chromedriver");
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized"); // open Browser in maximized mode
//		options.addArguments("disable-infobars"); // disabling infobars
//		options.addArguments("--disable-extensions"); // disabling extensions
//		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--remote-debugging-port=9222")  ; //this
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox"); // Bypass OS security model
		return new ChromeDriver(options);
//		
//		System.setProperty("webdriver.gecko.driver", "/home/admin1/eclipse-workspace/artifactID/src/test/resource/webDrivers/geckodriver");
//		return new FirefoxDriver();
		
	}
}
