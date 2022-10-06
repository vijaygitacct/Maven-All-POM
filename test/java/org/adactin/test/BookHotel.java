package org.adactin.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends Baseclass{
		
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement getTextAsBookaHotel;
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditCradNum;
	
	@FindBy(id="cc_type")
	private WebElement txtCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCCVnum;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	
	public WebElement getGetTextAsBookaHotel() {
		return getTextAsBookaHotel;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCradNum() {
		return txtCreditCradNum;
	}

	public WebElement getTxtCardType() {
		return txtCardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getTxtCCVnum() {
		return txtCCVnum;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	
	public void BookHotelPage(String fName, String lName, String Address, String Cardnum, 
								 String CardType, String ExpMonth, String ExpYear, String CCV) {
		
		sendkeys(getTxtFirstName(), fName);
		sendkeys(getTxtLastName(), lName);
		sendkeys(getTxtAddress(), Address);
		sendkeys(getTxtCreditCradNum(), Cardnum);
		selectByText(getTxtCardType(), CardType);
		selectByText(getExpMonth(), ExpMonth);
		selectByText(getExpYear(), ExpYear);
		sendkeys(getTxtCCVnum(), CCV);
		click(getBtnBookNow());

	}
	
}

