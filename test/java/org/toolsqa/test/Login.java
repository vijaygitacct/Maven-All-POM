package org.toolsqa.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login  extends Baseclass{
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userName")
	private WebElement txtUserName;
	@FindBy(id="password")
	private WebElement txtPassWord;
	@FindBy(id="login")
	private WebElement btnLogin;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassWord() {
		return txtPassWord;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void LoginPage(String Username, String Password) {
		sendkeys(getTxtUserName(), Username);
		sendkeys(getTxtPassWord(), Password);
		click(getBtnLogin());
	}
	
	
	

}
