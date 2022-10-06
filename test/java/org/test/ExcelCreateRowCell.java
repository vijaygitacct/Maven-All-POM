package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreateRowCell {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\ExcelSheet1.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook =new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("Details");
		Row row = sheet.createRow(6);
		Cell Cell = row.createCell(0);
		Cell.setCellValue("Ravikumar");
		
		
		
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
		
		
		
		
	}

}
