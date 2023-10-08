package com.GroupId.artifactID;

import org.openqa.selenium.WebDriver;
import com.GroupId.keywords.DemoActionClass;
import com.GroupId.keywords.DemoDataProviderActionClass;
import com.GroupId.artifactID.WebDriverInitiator;

@SuppressWarnings("unused")
public class TestSessionInitiator {
	
	public DemoActionClass demoActionClass ;
	public DemoDataProviderActionClass demoDataProviderActionClass;

	
	public WebDriver driver;
	
	public TestSessionInitiator() {
		WebDriverInitiator wdInitiator = new WebDriverInitiator();
		this.driver = wdInitiator.webDriverSetup();
		initiate();
	}
	
	public void initiate() {
		demoActionClass = new DemoActionClass(driver);
		demoDataProviderActionClass = new DemoDataProviderActionClass(driver);

	}
		
	public void launchApplication(String url) {
		driver.get(url);
	}
	
	public void quitSession() {
//		this will close test session
		driver.quit();
	}
	
	public void closeSession() {
//		this will close the windows
		driver.close();
	}
	
}
