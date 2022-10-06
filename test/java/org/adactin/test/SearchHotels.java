package org.adactin.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotels extends Baseclass {

	public SearchHotels() {

		PageFactory.initElements(driver, this);   //
	}
	@FindBy(id="username_show")
	private WebElement WelcomeMsg;

	public WebElement getWelcomeMsg() {
		return WelcomeMsg;
	}
	@FindBy(id="location")
	private WebElement DLocation;

	@FindBy(id="hotels")
	private WebElement DHotels;

	@FindBy(id="room_type")
	private WebElement dRoomtype;

	@FindBy(id="room_nos")
	private WebElement dRoomNos;

	@FindBy(id="datepick_in")
	private WebElement dCheckin;

	@FindBy(id="datepick_out")
	private WebElement dCheckOut;

	@FindBy(id="adult_room")
	private WebElement dAdultRoom;

	@FindBy(id="child_room")
	private WebElement dChildRoom;

	@FindBy(id="Submit")
	private WebElement btnSubmit;

	public WebElement getDLocation() {
		return DLocation;
	}

	public WebElement getDHotels() {
		return DHotels;
	}

	public WebElement getdRoomtype() {
		return dRoomtype;
	}

	public WebElement getdRoomNos() {
		return dRoomNos;
	}

	public WebElement getdCheckin() {
		return dCheckin;
	}

	public WebElement getdCheckOut() {
		return dCheckOut;
	}

	public WebElement getdAdultRoom() {
		return dAdultRoom;
	}

	public WebElement getdChildRoom() {
		return dChildRoom;
	}

	public WebElement getBtnSubmit(){
		return btnSubmit;
	}

	public void searchHotelPage(String location, String Hotel, String RoomType, String RoomNos,
			String checkin, String checkOut,String Adult, String Child)  {

		selectByText(getDLocation(), location);
		selectByText(getDHotels(), Hotel);
		selectByText(getdRoomtype(), RoomType);
		selectByText(getdRoomNos(), RoomNos);			//
		sendkeys(getdCheckin(), checkin);
		sendkeys(getdCheckOut(), checkOut);
		selectByText(getdAdultRoom(), Adult);
		selectByText(getdChildRoom(), Child);
		click(getBtnSubmit());

	}


}
