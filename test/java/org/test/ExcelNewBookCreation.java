package org.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//create new workbook-new sheet-new Row- new Cell value
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelNewBookCreation {
public static void main(String[] args) throws IOException {
	
	File file = new File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\hello.xlsx");
	
	Workbook workbook = new XSSFWorkbook();
	
	Sheet Sheet = workbook.createSheet("Data");
	Row row = Sheet.createRow(1);
	Cell cell = row.createCell(1);
	cell.setCellValue("Instagram");
	
	FileOutputStream fileOutputStream = new FileOutputStream(file);
	workbook.write(fileOutputStream);
	
}
}
