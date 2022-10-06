package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenExample {
	
	public static void main(String[] args) {
		
		System.out.println("vijaykumar");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtmail = driver.findElement(By.id("email"));	
		txtmail.sendKeys("vijay");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("12345");
		
		
	WebElement btnLog = driver.findElement(By.name("login"));
	btnLog.click();
		
		
		
		
		
		
	}

}
