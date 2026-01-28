package com.GroupId.test;

import org.testng.annotations.Test;

import com.GroupId.utils.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Demo Testing file 1")
@Feature("Searching Functionality")
public class DemoTest2 extends BaseTest{
	
	
	@Test
	@Story("Valid Login")
    @Description("Verify that user can log in with valid credentials")
    @Severity(SeverityLevel.CRITICAL)
	public void demo_Testing01() {
		System.out.println("starting test in Demo2 class");
//		webDriverSetup();
		test.launchApplication("https://www.youtube.com/");
//		test.demoActionClass.enterSearchTerm("hello");
		test.demoActionClass.verifyUrl("youtube");		
	}
}
