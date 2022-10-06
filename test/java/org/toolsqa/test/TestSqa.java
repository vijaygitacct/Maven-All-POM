package org.toolsqa.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSqa extends Baseclass {
	
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		loadUrl("https://demoqa.com/login");
		maximize();
	}
	
	@AfterClass
	public static void afterClass() {
		//quit();

	}
	
	
	@Test
	public void formFill() {
		
		Login login = new Login();
		login.LoginPage("vijay17492", "Vj@12345");
		
		FormFill f = new  FormFill();
		f.formFillPage("vijay", "vijay@gmail.com", "OMR Chennai", "Omr Chennai");
		
	
	}
	

}
