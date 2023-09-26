package com.GroupId.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.GroupId.artifactID.TestSessionInitiator;

public class BaseTest {

	
	public TestSessionInitiator test;
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("****This is before Test being executed****");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("####This is after Test being executed####");
	}

	@BeforeClass
	public void startTest() {
		System.out.println("!!!!This is before class being executed!!!!");
		test = new TestSessionInitiator();
	}
	
	@AfterClass
	public void CloseSession() {
		System.out.println("@@@@This is after class being executed@@@@");
		test.quitSession();
	}
	
}
