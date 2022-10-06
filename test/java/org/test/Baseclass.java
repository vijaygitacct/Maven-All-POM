package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.poi.ss.usermodel.DateUtil;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;

	// get Data
	public String getData(String sheetName, int rowNum, int cellNum) throws IOException {
		String data = null;
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\Adactin.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			data = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
				data = f.format(dateCellValue);
			} else {
				double d = cell.getNumericCellValue();
				//BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				//data = valueOf.toString();
				long check = Math.round(d);
				if(check==d) {
					data = String.valueOf(check);
				}
				else {
					data = String.valueOf(d);
				}
			}
		default:
			break;
		}
		return data;
	}

	// update oldDate to newDate
	public void updateDate(String sheetName, int rowNum, int cellNum, String oldData, String newData)
			throws IOException {
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\ExcelSheet1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String stringCellValue = cell.getStringCellValue();
		if (stringCellValue.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

	// writeData
		public void writeData(String sheetName, int rowNum, int cellNum, String value ) throws IOException {
			File file = new File("C:\\Users\\hp\\eclipse-workspace\\Example1Maven\\Excel\\Adactin.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet createSheet = workbook.getSheet(sheetName);
			Row createRow = createSheet.getRow(rowNum);
			Cell createCell = createRow.createCell(cellNum);
			createCell.setCellValue(value);
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);

	}

	// 1.getDriver
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// 2.loadUrl
	public static void loadUrl(String url) {
		driver.get(url);
	}

	// 3.maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// 4.getTitle
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 5.getCurrentUrl
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// 6.sendKeys
	public void sendkeys(WebElement element, String text) {
		element.sendKeys(text);
	}

	// 7.click
	public void click(WebElement element) {
		element.click();
	}

	// 8.getText
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 9.getAttribute
	public String getAttribute(WebElement element) {
		String text = element.getAttribute("value");
		return text;
	}

	// 10.findLocatorById
	public WebElement findLocatorById(String attributeValue) {
		WebElement findElement = driver.findElement(By.id(attributeValue));
		return findElement;
	}

	
	
	// 11.findLocatorByName
	public WebElement findLocatorByName(String attributeValue) {
		WebElement findElement = driver.findElement(By.name(attributeValue));
		return findElement;
	}

	// 12.findLocatorByClassName
	public WebElement findLocatorByClassName(String attributeValue) {
		WebElement findElement = driver.findElement(By.className(attributeValue));
		return findElement;
	}

	// 13.findLocatorByXpath
	public WebElement findLocatorByXpath(String attributeValue) {
		WebElement findElement = driver.findElement(By.xpath(attributeValue));
		return findElement;
	}

	// 14.getAttribute other thanValue
	public String getAttribute(String attributeName, WebElement element) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}
	//to get text from text box
	public String getAttributee(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	// 15.Sleep
	
		public void sleep(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
	}

	// 16.moveToElement
	public void moveToElement(WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();
	}

	// 17.dragAndDrop
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target);
	}

	// 18.contextClick(rightclick)
	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	// 19.robot keyPress
	public void robotKeyPress(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(keycode);
	}

	// 20.robot keyRelease
	public void robotKeyRelease(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(keycode);
	}

	// 21.KeyDown
	public void keyDown(CharSequence key) {
		Actions actions = new Actions(driver);
		actions.keyDown(key);
	}

	// 22.KeyUp
	public void keyUp(CharSequence key) {
		Actions actions = new Actions(driver);
		actions.keyUp(key);
	}

	// 23.SendKeys in Actions
	public void sendkeysinactions(WebElement element, CharSequence keycode, String keysToSend) {
		element.sendKeys(keysToSend, keycode);
	}

	// 24.double click
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	// 25.Accept Alert
	public void acceptAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	// 26.Dismiss Alert
	public void dismissAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	// 27.JavaScript insert text
	public void insertTextJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value'," + text + ")", element);
	}

	// 28.JavaScript print text
	public Object printTextJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("return arguemnt[0].getAttribute('value')", element);
		return executeScript;
	}

	// 29.JavaScript click
	public void clickjs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0],click()", element);
	}

	// 30.Scroll Down JavaScript
	public void scrollDownJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0].scrollIntoView(true)", element);
	}

	// 31.Scroll Up JavaScript
	public void scrolUpJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0].scrollIntoView(false)", element);
	}

	// 32.Take Screenshot
	public File screenShot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		return file;
	}

	// 33.Take ScreenShot for WebElement
	public File screenshotWebElement(WebElement element) {
		File file = element.getScreenshotAs(OutputType.FILE);
		return file;
	}

	// 34.Create new File
	public File newFile(String location) {
		File f = new File(location);
		return f;
	}

	// 35.Copy and Paste File
	public void copypastefile(String sourcelocation, String destlocation) throws IOException {
		File s = new File(sourcelocation);
		File d = new File(destlocation);
		FileUtils.copyFile(s, d);
	}

	// 36.Launch url using Navigation
	public void urlNavigation(String url) {
		driver.navigate().to(url);
	}

	// 37.To move Backward in Navigation
	public void moveback() {
		driver.navigate().back();
	}

	// 38.To move Forward
	public void moveforward() {
		driver.navigate().forward();
	}

	// 39.To Refressh
	public void refresh() {
		driver.navigate().refresh();
	}

	// 40.Select By Value in Drop Down
	public void selectByValue(String value, WebElement element) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	// 41.Select By Index in Drop Down
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	// 42.Select By Text in Drop Down
	public void selectByText(String text, WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// 43.get Options in Drop Down
	public List<WebElement> getoptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	// 44.get all options in Drop down
	public void gettAllOptions(WebElement element) {
		Select select = new Select(element);
		select.getAllSelectedOptions();
	}

	// 45.get First option
	public void getFirstOption(WebElement element) {
		Select select = new Select(element);
		select.getFirstSelectedOption();
	}

	// 46.is multiple
	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// 47.deselectByIndex
	public void deselectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// 48.deselect all
	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	// 49.deselect By Value
	public void deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	// 50.deselectByText
	public void deselectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	// 51.SwitchToFrameById
	public void SwitchToFrameByNameOrId(String NameOrId) {
		driver.switchTo().frame(NameOrId);
	}

	// 52.SwitchToFrameByIndex
	public void SwitchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	// 53.switchToFrameByWebElement
	public void switchToFrameByWebElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	// 54.defaultContent
	public void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// 55.getWindowHandle/get Parent Id
	public String getWindowHandle() {
		String parentWinId = driver.getWindowHandle();
		return parentWinId;
	}

	// 56.getWindowHandles/get all windows id
	public Set<String> getWindowHandles() {
		Set<String> allWinId = driver.getWindowHandles();
		return allWinId;
	}

	// 57.switch To Window
	public void switchToWindow(String nameOrHandle) {
		driver.switchTo().window(nameOrHandle);
	}

	// 58.close
	public void close() {
		driver.close();
	}

	// 59.quit
	public static void quit() {
		driver.quit();
	}

	// 60.wait
	public void waitMethod() throws InterruptedException {
		driver.wait();
	
	}

	// 62.clear
	public void clearMethod(WebElement element) {
		element.clear();
	}
	
	


}
