package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//create new cell insert value
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreateCell {

	public static void main(String[] args) throws IOException {
		File file =new  File("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\Example1Maven\\\\Excel\\\\Demo.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.createCell(5);
		
		cell.setCellValue("Chennai");
		
		FileOutputStream fileOutputStream =new  FileOutputStream(file);
		workbook.write(fileOutputStream);
		
		
		
	}

}
