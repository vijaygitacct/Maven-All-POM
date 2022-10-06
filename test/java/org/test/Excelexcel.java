package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excelexcel {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://output.jsbin.com/osebed/2");
		WebElement fruit = driver.findElement(By.id("fruits"));

		Select select = new Select(fruit);

		List<WebElement> options = select.getOptions();
		/*String text = options.get(1).getText();
		System.out.println(text);*/

		File file =new  File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\fruit.xlsx");

		Workbook workbook =new XSSFWorkbook();

		Sheet sheet = workbook.getSheet("List");

		for (int i = 0; i < options.size(); i++) {

			String text = options.get(i).getText();

			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
			//	System.out.println(text);

		}		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);






	}

}
