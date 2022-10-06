package org.adactin.test;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AdactinHotelBooking  extends Baseclass{


	@BeforeClass
	public static void beforeClass() {

		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();

	}
	@AfterClass
	public static void afterClass() {
		//quit();
	}

	@Test
	public void booking() throws IOException, InterruptedException {

		//********login
		LoginPage lp = new LoginPage();
		lp.Login(getData("data", 1, 0), getData("data", 1, 1));

		//*******Search Hotel
		SearchHotels searchHotels = new  SearchHotels();							
		WebElement searchHotelwelcomeMsg = searchHotels.getWelcomeMsg();
		String MsgMsg = getAttribute(searchHotelwelcomeMsg);
		Assert.assertEquals("verify After login", "Hello Greens8767!", MsgMsg);

		searchHotels.searchHotelPage(getData("data", 1, 2), getData("data", 1, 3), getData("data", 1, 4), getData("data", 1, 5), getData("data", 1, 8), getData("data", 1, 9),
				getData("data", 1, 6), getData("data", 1, 7));




		//******select Hotel
		selectHotel selectHotel = new  selectHotel();
		
		WebElement welcomeMsg = selectHotel.getSelectHotelText();
		String text = getText(welcomeMsg);
		Assert.assertEquals("verify after select hotel", "Select Hotel", text);
		selectHotel.selectHotelPage();


		//******Book Hotel
		BookHotel bookHotel = new  BookHotel();
		WebElement BookaHotel = bookHotel.getGetTextAsBookaHotel();
		String text2 = getText(BookaHotel);
		Assert.assertEquals("verify after select a hotel", "Book A Hotel", text2);
		
		bookHotel.BookHotelPage(getData("data", 1, 10), getData("data", 1, 11), getData("data", 1, 12), getData("data", 1, 13), getData("data", 1, 14), getData("data", 1, 15), getData("data", 1, 16), getData("data", 1, 17));



		//*********Booking Confirmation
		
		BookingConfirmation bookCofirm =new  BookingConfirmation();
//		WebElement BookingConfirm = bookCofirm.getTxtBookingConfirmation();
//		String bookCnfrm = getText(BookingConfirm);
//		Assert.assertEquals("verify after book a hotel", "Booking Confirmation", bookCnfrm);
		Thread.sleep(6000);
		bookCofirm.bookingConfirmPage();


		//******CancelBooking
		CancelBooking cancel = new CancelBooking();
		cancel.cancelBookingPage(getData("data", 1, 19));
		
		
		//*******CancelAll
		CancelBookItenatery cancelBookItenatery = new CancelBookItenatery();
		cancelBookItenatery.cancBook();


	}















}
