package org.adactin.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends Baseclass {
	
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderNo;

	public   WebElement getOrderNo() {
		return orderNo;
	}

	public void bookingConfirmPage() throws IOException {
		
		String attribute = getAttribute(getOrderNo());
		writeData("data", 1, 19, attribute);
	}



}
