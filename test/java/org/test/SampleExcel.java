package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcel {
	public static void main(String[] args) throws IOException {

		File file = new  File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\Book.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("sheet1");
			for (int i = 1; i < args.length; i++) {
				Row row = sheet.getRow(0);
				for (int j = 0; j < args.length; i++) {
					Cell cell = row.getCell(0);
					System.out.println(cell);
				} 
			}
			} 
		}

		

	
	

