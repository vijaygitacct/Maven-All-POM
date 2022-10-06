package org.adactin.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectHotel extends Baseclass {
	public selectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement SelectHotelText;
	
	public WebElement getSelectHotelText() {
		return SelectHotelText;
	}

	@FindBy(id="radiobutton_0")
	private WebElement selectHotelButton;
	
	@FindBy(id="continue")
	private WebElement btnSarch;

	
	
	public WebElement getSelectHotelButton() {
		return selectHotelButton;
	}

	public WebElement getBtnSarch() {    		
		return btnSarch;
	}
	
	public void selectHotelPage() {
		
		click(selectHotelButton);
		click(btnSarch);

	}
	
	

}
