package org.test;


import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Employee {
	public static void main(String[] args) throws IOException, InterruptedException {
		Employee employee = new  Employee();
		employee.Booking();
	}

	private void Booking() throws IOException, InterruptedException {
		Baseclass baseclass = new  Baseclass();


		baseclass.getDriver();
		baseclass.loadUrl("https://adactinhotelapp.com/");
		//baseclass.maximize();


		WebElement txtUser = baseclass.findLocatorById("username");
		String data = baseclass.getData("Sheet1", 1, 0);	
		baseclass.sendkeys(txtUser, data);

		WebElement txtPass = baseclass.findLocatorById("password");
		String data2 = baseclass.getData("Sheet1", 1, 1);
		baseclass.sendkeys(txtPass, data2);


		WebElement btnLog = baseclass.findLocatorById("login");
		baseclass.click(btnLog);


		WebElement location = baseclass.findLocatorById("location");
		String data3 = baseclass.getData("Sheet1", 1, 2);
		baseclass.selectByText(data3, location);

		WebElement hotel = baseclass.findLocatorById("hotels");
		String data4 = baseclass.getData("Sheet1", 1, 3);
		baseclass.selectByText(data4, hotel);

		WebElement roomType = baseclass.findLocatorById("room_type");
		String data5 = baseclass.getData("Sheet1", 1, 4);
		baseclass.selectByText(data5, roomType);

		WebElement noOfRoom = baseclass.findLocatorById("room_nos");
		String data6 = baseclass.getData("Sheet1", 1, 5);
		baseclass.selectByText(data6, noOfRoom);

		WebElement checkIn = baseclass.findLocatorById("datepick_in");
		baseclass.sendkeys(checkIn, "20/9/2022");



		WebElement checkOut = baseclass.findLocatorById("datepick_out");
		baseclass.sendkeys(checkOut, "25/9/2022");

		WebElement adultRoom = baseclass.findLocatorById("adult_room");
		String data9 = baseclass.getData("Sheet1", 1, 8);
		baseclass.selectByText(data9, adultRoom);

		WebElement childRoom = baseclass.findLocatorById("child_room");
		String data10 = baseclass.getData("Sheet1", 1, 9);
		baseclass.selectByText(data10, childRoom);

		WebElement btnSubmit = baseclass.findLocatorById("Submit");
		baseclass.click(btnSubmit);


		WebElement selectHotel = baseclass.findLocatorById("radiobutton_0");
		baseclass.click(selectHotel);

		WebElement btnCont= baseclass.findLocatorById("continue");
		baseclass.click(btnCont);


		WebElement firstName = baseclass.findLocatorById("first_name");
		baseclass.sendkeys(firstName, "vijay");


		WebElement lastName = baseclass.findLocatorById("last_name");
		baseclass.sendkeys(lastName, "kumar");

		WebElement address = baseclass.findLocatorById("address");
		baseclass.sendkeys(address, "3/150, OMR Chennai");

		WebElement creditCard = baseclass.findLocatorById("cc_num");
		baseclass.sendkeys(creditCard, "4565789876543412");

		WebElement cardType = baseclass.findLocatorById("cc_type");
		String data7 = baseclass.getData("Sheet1", 1, 10);
		baseclass.selectByText(data7, cardType);

		WebElement expMonth = baseclass.findLocatorById("cc_exp_month");
		String data8 = baseclass.getData("Sheet1", 1, 11);
		baseclass.selectByText(data8, expMonth);

		WebElement expYear = baseclass.findLocatorById("cc_exp_year");
		String data11 = baseclass.getData("Sheet1", 1, 12);
		baseclass.selectByText(data11, expYear);

		WebElement cardCCV = baseclass.findLocatorById("cc_cvv");
		baseclass.sendkeys(cardCCV, "987");

		WebElement bookNow = baseclass.findLocatorById("book_now");
		baseclass.click(bookNow);	


Thread.sleep(5000);
		WebElement orderNum = baseclass.findLocatorById("order_no");
		String attribute = baseclass.getAttribute(orderNum);
		System.out.println(attribute);	
		
		baseclass.writeData("Sheet1", 1, 13, attribute);
		
		









	}

}
