package com.utlity;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RedExlData {
	
	public static void readParticularData() {
        try {
        	File file = new File("/Users/javagar/Downloads/DataDriven_IPT.xlsx");
			 
        	Workbook workbook = new XSSFWorkbook(file);
        	
        	Sheet sheet =workbook.getSheet("Sheet1");
        	
        	Row row = sheet.getRow(0);
        	
        	Cell cell = row.getCell(0);
        	
        	DataFormatter dataformatter = new DataFormatter();
        	
        	String data = dataformatter.formatCellValue(cell);
        	
        	System.out.println(data);
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	readParticularData();
	}
	

}
