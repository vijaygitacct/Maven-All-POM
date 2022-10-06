package org.adactin.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookItenatery extends Baseclass {

	public CancelBookItenatery() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="ids[]")
	private WebElement cancelSelectButton;
	
	@FindBy(name="cancelall")
	private WebElement cancelAll;

	public WebElement getCancelSelectButton() {
		return cancelSelectButton;
	}

	public WebElement getCancelAll() {
		return cancelAll;
	}
	
	public void cancBook() {
		click(getCancelSelectButton());
		click(getCancelAll());
		

	}
	
	
	
}
		
		
