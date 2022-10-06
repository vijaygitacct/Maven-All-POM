package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandle {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumNew\\src\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");	
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Oppo" +Keys.ENTER);
		WebElement oppo = driver.findElement(By.xpath("//span[contains(text(),\'OPPO A15s\')]"));
		oppo.click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		
	for (String eachwindow : allWindow) {
			
			if (!parentWindow.equals(eachwindow)) {
				driver.switchTo().window(eachwindow);
				
				
			}
			
		}
	
		
	WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		cart.click();

}}
