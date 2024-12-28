package com.GroupId.POJO;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("sheetName")
public class BookDetails {
	
	@ExcelCell(0)
	private String ISBN;
	
	@ExcelCellName("title")
	private String title;
	
	@ExcelCellName("author")
	private String author;
	
	public String toString() {
		return "ISBN number is "+ISBN+" title is "+title+ " author is "+author+"\n";
	}
}
