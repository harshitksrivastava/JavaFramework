package com.GroupId.keywords;

import org.openqa.selenium.WebDriver;

import com.GroupId.POJO.BookDetails;

public class DemoDataProviderActionClass {
	WebDriver driver;

	public DemoDataProviderActionClass(WebDriver driver) {
		this.driver = driver;
	}

	public void addnums(int n, int m) {
		// TODO Auto-generated method stub
		System.out.println(n + m);
	}

	public void printDetails(String ISBN, String title) {
		// TODO Auto-generated method stub
		System.out.println("BookName : " + title);
		System.out.println("ISBN : " + ISBN);

	}
	
	public void printDetails(BookDetails bookD) {
		// TODO Auto-generated method stub
		System.out.println(bookD.toString());
//		System.out.println("ISBN : " + ISBN);

	}

}
