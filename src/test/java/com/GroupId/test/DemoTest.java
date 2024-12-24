package com.GroupId.test;

import org.testng.annotations.Test;
import io.qameta.allure.*;

import com.GroupId.utils.BaseTest;

@Epic("Demo Testing file 1")
@Feature("Searching Functionality")
public class DemoTest extends BaseTest {

	@Test
	@Story("Valid Login")
    @Description("Verify that user can log in with valid credentials")
    @Severity(SeverityLevel.CRITICAL)
	public void demo_Testing01() {
		System.out.println("starting test in Demo class");
//		webDriverSetup();
		test.launchApplication("https://google.com");
		test.demoActionClass.enterSearchTerm("hello");
		
	}
	
	@Test
	@Story("Valid Login")
    @Description("Verify that user can log in with valid credentials")
    @Severity(SeverityLevel.CRITICAL)
	public void demo_Testing02() {
		System.out.println("starting test 2 in Demo class");
//		webDriverSetup();
		test.launchApplication("https://google.com");
		test.demoActionClass.enterSearchTerm("hello");		
	}
}
