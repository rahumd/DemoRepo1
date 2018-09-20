package com.frm.qa.util;

import java.io.FileInputStream;

import com.frm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT=40;
	public static long IMPCILIT_WAIT=20;
	

	static Workbook book;
	static Sheet sheet;
	
	public static Object[][] getTestData(String sheetName){
		
		FileInputStream file = new FileInputStream("");
		
		book=WorkBookFactory.create(File);
		sheet=book.getSheet(sheetName);
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (i) {
			for(k) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		
		
		
	}
}
