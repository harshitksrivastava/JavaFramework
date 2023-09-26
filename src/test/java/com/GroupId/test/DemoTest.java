package com.GroupId.test;

import org.testng.annotations.Test;

import com.GroupId.utils.BaseTest;

public class DemoTest extends BaseTest {

	@Test
	public void demo_Testing01() {
		System.out.println("starting test in Demo class");
//		webDriverSetup();
		test.launchApplication("https://google.com");
		test.demoActionClass.enterSearchTerm("hello");
		
	}
	
	@Test
	public void demo_Testing02() {
		System.out.println("starting test 2 in Demo class");
//		webDriverSetup();
		test.launchApplication("https://google.com");
		test.demoActionClass.enterSearchTerm("hello");		
	}
}
