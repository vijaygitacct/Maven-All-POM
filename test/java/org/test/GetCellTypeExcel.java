package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetCellTypeExcel {
	
	public static void main(String[] args) throws IOException {
		
		File file =  new File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\Demo.xlsx");
		FileInputStream stream =new  FileInputStream(file);
		Workbook workbook = new  XSSFWorkbook(stream);  
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(3);
		CellType type = cell.getCellType();
		
		switch (type){
		case STRING:	
			String stringCellValue = cell.getStringCellValue();
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateValue = cell.getDateCellValue();
				SimpleDateFormat date = new  SimpleDateFormat("dd/MM/yy");
			}
			else {
				double numericValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericValue);
				String string = valueOf.toString();
			}

		default:
			break;
		}
		
		
		
		
	}
	//return ;
	
	

}
