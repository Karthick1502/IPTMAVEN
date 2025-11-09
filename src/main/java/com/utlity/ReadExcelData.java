package com.utlity;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void readParticularData() {
		try {
				
			File file = new File("/Users/javagar/Downloads/DataDriven_IPT.xlsx");
			Workbook book = new XSSFWorkbook(file);
			Sheet sheet = book.getSheet("Sheet1");
			Row row = sheet.getRow(2);
			Cell cell = row.getCell(1);
			
			DataFormatter dataFormatter = new DataFormatter();
			String data = dataFormatter.formatCellValue(cell);
			
			System.out.println(data);
		}
		catch( Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		readParticularData();
	}
}
