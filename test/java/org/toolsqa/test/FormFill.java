package org.toolsqa.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormFill extends Baseclass{

	public FormFill() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//div[text()='Elements']")
	private WebElement clkElements;

	@FindBy(xpath="//span[text()='Text Box']")
	private WebElement textBox;

	@FindBy(id="userName")
	private WebElement TxtUserName;

	@FindBy(id="userEmail")
	private WebElement txtEmail;

	@FindBy(id="currentAddress")
	private WebElement txtCurrentAddress;

	@FindBy(id="permanentAddress")
	private WebElement txtPermanentAddress;

	@FindBy(xpath="//button[@id='submit']")
	private WebElement btnSubmit;

	public WebElement getClkElements() {
		return clkElements;
	}

	public WebElement getTextBox() {
		return textBox;
	}

	public WebElement getTxtUserName() {
		return TxtUserName;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtCurrentAddress() {
		return txtCurrentAddress;
	}

	public WebElement getTxtPermanentAddress() {
		return txtPermanentAddress;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void formFillPage(String UseName, String Email, String CurrAddress, String PermAddress) {
		moveToElement(getClkElements());
		click(getClkElements());
		moveToElement(getTextBox());
		click(getTextBox());
		sendkeys(getTxtUserName(), UseName);
		sendkeys(getTxtEmail(), Email);
		sendkeys(getTxtCurrentAddress(), CurrAddress);
		sendkeys(getTxtPermanentAddress(), PermAddress);
		click(getBtnSubmit());


	}


}


