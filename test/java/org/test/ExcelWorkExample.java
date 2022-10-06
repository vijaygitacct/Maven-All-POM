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

public class ExcelWorkExample {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\ExcelSheet1.xlsx");  //path of Excel file
		// Replace the value in cell
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook =new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Details");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		
		System.out.println(cell);
		
		String Value = cell.getStringCellValue();
		
		if (Value.equals("Amazon")) {
			cell.setCellValue("FGgHH");
			
		}
		
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);
		
		
	}

}
