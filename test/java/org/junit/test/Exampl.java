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

public class Exampl
{
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		//driver.manage().window().maximize();
	}



	@Before
	public void beforeMethod() {

		long time = System.currentTimeMillis();
		System.out.println(time);
	}

	@Test
	public void test() {

		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("Greens8767");

		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("L4R739");

		WebElement btnLog = driver.findElement(By.name("login"));
		btnLog.click();


	}

	@After
	public void afterMethod() {
		long time = System.currentTimeMillis();
		System.out.println(time);

	}

	@AfterClass
	public static void afterClass() {
		//driver.quit();
	}


}
