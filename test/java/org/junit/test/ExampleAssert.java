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
import junit.framework.Assert;

public class ExampleAssert {
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
		
		String attribute = txtUser.getAttribute("value");
		
		Assert.assertEquals("Verify UserName","vijay", txtUser);
		
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("vj@12345566");
		
		String attribute2 = txtPass.getAttribute("value");
		
		Assert.assertEquals("verify password","vj@12345566", txtPass);
		
		WebElement btnLog = driver.findElement(By.name("login"));
		btnLog.click();
		
		String title = driver.getTitle();
		 boolean contains = title.contains("Sign In");
		Assert.assertFalse(contains);
	}

	@After
	public void afterMethod() {
		long time = System.currentTimeMillis();
		System.out.println(time);

	}



}
