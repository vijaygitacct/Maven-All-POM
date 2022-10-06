package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewSheetRowCellExcel {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\Demo.xlsx");
		
		Workbook workbook = new  XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("New");
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(0);
		cell.setCellValue("Hi I'm New Cell ");
		
		FileOutputStream outputStream = new  FileOutputStream(file);
		workbook.write(outputStream);
		
		
		
		
		
		
		
		
		
		
	}

}
