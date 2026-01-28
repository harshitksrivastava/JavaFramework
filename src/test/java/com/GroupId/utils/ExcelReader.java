package com.GroupId.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.GroupId.POJO.BookDetails;
import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;
import com.poiji.option.PoijiOptions.PoijiOptionsBuilder;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelReader {

	public static FileInputStream fi;
	public static FileOutputStream fo;

	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;

	public static XSSFRow row;
	public static XSSFCell cell;

//	xlFile => path to the excel File
//	xlSheet => name of the sheet in the excel File
	
	public static String getSheetName(String xlFile, int xlSheetNumber ) throws IOException {
		// TODO Auto-generated method stub
		fi = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fi);
		String sheetName = wb.getSheetName(xlSheetNumber);


//		close all the open resource
		wb.close();
		fi.close();
		return sheetName;
	}
	
	public static Row getRow(String xlFile, String xlSheet, int i) throws IOException {
		
		fi = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlSheet);

//		getting the row to count the columns of that row
		row = sheet.getRow(i);

		wb.close();
		fi.close();
		return row;
	}

//	method to get row count
	public static int getRowCount(String xlFile, String xlSheet) throws IOException {

//		these 3 steps to be followed in all the methods
//			step 1: open FileInputStream 
//			step 2: and with the FileInputStream open Workbook
//			step 3: and then with workbook open sheet		
		fi = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlSheet);

		int rowCount = sheet.getLastRowNum();

//		close all the open resource
		wb.close();
		fi.close();
		return rowCount;
	}

//	method to get cell count
	public static int getCellCount(String xlFile, String xlSheet, int rowNum) throws IOException {

		fi = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlSheet);

//		getting the row to count the columns of that row
		row = sheet.getRow(rowNum);
		int cellCount = row.getLastCellNum();

		wb.close();
		fi.close();
		return cellCount;
	}

//	retrieve cell data
	public static String getCellData(String xlFile, String xlSheet, int rowNum, int cellNum) throws IOException {

		fi = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlSheet);

		row = sheet.getRow(rowNum);
		cell = row.getCell(cellNum);
		String cellData;
		try {
			DataFormatter dataFormatter = new DataFormatter();
			cellData = dataFormatter.formatCellValue(cell);
		} catch (Exception e) {
			cellData = " ";
		}

		wb.close();
		fi.close();
		return cellData;
	}

//	set cell data
	public static void setCellData(String xlFile, String xlSheet, int rowNum, int cellNum, String data)throws IOException{
		
		fi = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlSheet);
		
		row = sheet.getRow(rowNum);
		cell = row.createCell(cellNum);
		
		cell.setCellValue(data);
		
//		create the output stream to write the contents into the sheet
		fo = new FileOutputStream(xlFile);
		wb.write(fo);
		
		fo.close();
		wb.close();
		fi.close();		
	}
	
	
	public static List<BookDetails> readExcelData(String xlFile){
		PoijiOptions options = PoijiOptionsBuilder.settings().build();
		List<BookDetails> bookInfo = Poiji.fromExcel(new File(xlFile), BookDetails.class, options);
		return bookInfo;
	}
}
