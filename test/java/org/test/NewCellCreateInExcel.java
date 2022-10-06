package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewCellCreateInExcel {
	public static void main(String[] args) throws IOException {
		
		File file = new  File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\Demo.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new  XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		
		Row row2 = sheet.getRow(0);
		Cell cell2 = row2.createCell(2);
		cell2.setCellValue("Mobile No");
		
		Cell cell = row.createCell(2);
		cell.setCellValue("9876548745");
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
