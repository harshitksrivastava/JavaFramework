package com.GroupId.test;

import java.io.IOException;
import com.GroupId.utils.ConfigFileReader;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.GroupId.POJO.BookDetails;
import com.GroupId.utils.BaseTest;
import com.GroupId.utils.ExcelReader;

public class DemoTest3 extends BaseTest {

	String path = ConfigFileReader.getProperty("excelFilePath");
	String sheetName = ConfigFileReader.getProperty("excelSheetName");

	@DataProvider(name = "data")
	public Object[][] demoData() {
		return new Object[][] { { 1, 2 }, { 3, 4 } };
	}

	@DataProvider(name = "dataFromExcel")
	String[][] demoDataFromExcel() throws IOException {
//		String path = "/home/admin1/eclipse-workspace/artifactID/src/test/resource/TestData/ExcelFiles/bookList.xlsx";
		int rowNum = ExcelReader.getRowCount(path, sheetName);
		int colNum = ExcelReader.getCellCount(path, sheetName, 1);
			

		String books[][] = new String[rowNum][colNum];
		for (int i = 1; i <= rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				books[i - 1][j] = ExcelReader.getCellData(path, sheetName, i, j);
			}
		}
		return books;
	}

	@DataProvider(name = "dataFromExcelIntoPOJO")
	Object[][] demoDataFromExcelIntoPOJO() throws IOException {
		List<BookDetails> excelDataList = ExcelReader.readExcelData(path);
		Object[][] dataArray = new Object[excelDataList.size()][1];

		for (int i = 0; i < excelDataList.size(); i++) {
			dataArray[i][0] = excelDataList.get(i);
		}

		return dataArray;

	}

	@Ignore
	@Test(dataProvider = "data")
	public void demo_Testing01(int n, int m) {
		System.out.println("starting test in Demo3 class");
//		test.launchApplication("https://www.youtube.com/");
////		test.demoActionClass.enterSearchTerm("hello");
//		test.demoActionClass.verifyUrl("youtube");		

		test.demoDataProviderActionClass.addnums(n, m);
	}

	@Ignore
	@Test(dataProvider = "dataFromExcel")
	public void demo_Testing02(String ISBN, String title, String author) {
		test.demoDataProviderActionClass.printDetails(ISBN, title);
	}

	@Test(dataProvider = "dataFromExcelIntoPOJO")
	public void demo_Testing03(BookDetails bookD) {
//		System.out.println("BookName : " + title);
//		System.out.println("ISBN : " + ISBN);
		test.demoDataProviderActionClass.printDetails(bookD);
	}


}
