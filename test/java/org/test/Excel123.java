package org.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel123 {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement country = driver.findElement(By.name("country"));

		Select select = new  Select(country);

		List<WebElement> options = select.getOptions();


		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\hi.xlsx");

		Workbook workbook =new  XSSFWorkbook();

		Sheet sheet = workbook.createSheet("Data");

		for (int i = 0; i <options.size() ; i++) {

			String text = options.get(i).getText();

			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);

		}


		FileOutputStream outputStream = new  FileOutputStream(file);
		workbook.write(outputStream);

















	}

}
