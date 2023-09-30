package com.GroupId.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GroupId.utils.BaseTest;

public class DemoTest3 extends BaseTest{
	
	@DataProvider(name="data")
	public Object[][] demoData() {
		return new Object[][] {{1,2},{3,4}};
	}
	
	
	@Test(dataProvider="data")
	public void demo_Testing01(int n,int m) {
		System.out.println("starting test in Demo3 class");
//		webDriverSetup();
//		test.launchApplication("https://www.youtube.com/");
////		test.demoActionClass.enterSearchTerm("hello");
//		test.demoActionClass.verifyUrl("youtube");		
		
		test.demoDataProvider.addnums(n,m);
	}
}
