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

public class NewCellRowCreateExcel {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\Demo.xlsx");
		FileInputStream stream = new  FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.createRow(2);
		Cell cell = row.createCell(0);
		cell.setCellValue("surya@gmail.com");
		
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);
		
		
		
		
				
		
		
		
		
	}
	
	

}
