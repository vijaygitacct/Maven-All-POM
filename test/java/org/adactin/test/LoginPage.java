package org.adactin.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}		
		
	@FindBy(id="username")
	private WebElement txtUser;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(id="login")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	public void Login(String UserName, String Password) {
		

		sendkeys(getTxtUser(), UserName);
		sendkeys(getTxtPass(), Password);
		click(btnLogin);
		
	}
	
	
}
