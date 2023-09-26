package com.GroupId.test;

import org.testng.annotations.Test;

import com.GroupId.utils.BaseTest;

public class DemoTest2 extends BaseTest{
	@Test
	public void demo_Testing01() {
		System.out.println("starting test in Demo2 class");
//		webDriverSetup();
		test.launchApplication("https://www.youtube.com/");
//		test.demoActionClass.enterSearchTerm("hello");
		test.demoActionClass.verifyUrl("youtube");		
	}
}
