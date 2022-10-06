package org.junit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitExample {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

	@Before
	public void beforeMethod() {
		
		long time = System.currentTimeMillis();
		System.out.println(time);
	}

	@Test
	public void test() {
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("vijay");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("vj@12345566");
		
		WebElement btnLog = driver.findElement(By.name("login"));
		btnLog.click();
		

	}

	@After
	public void afterMethod() {
		long time = System.currentTimeMillis();
		System.out.println(time);

	}



}
