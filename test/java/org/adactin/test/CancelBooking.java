package org.adactin.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends Baseclass {
	
	public CancelBooking() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement cancelBooking;
	
	@FindBy(id="order_id_text")
	private WebElement orderId;
	
	@FindBy(id="id=\"search_hotel_id\"")
	private WebElement cancelhotel;
	
	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getCancelhotel() {
		return cancelhotel;
	}

	public WebElement getCancelBooking() {
		return cancelBooking;
	}
	
	public String cancelBookingPage(String OrderId) {
		click(getCancelBooking());
		sendkeys(getOrderId(), OrderId);
		click(cancelBooking);
//		acceptAlert();
		return OrderId;
		

	}
	

}
