package org.phptravels.test;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClassBooking {

	public static void main(String[] args) throws IOException, InterruptedException {

		ClassBooking classBooking = new ClassBooking();
		classBooking.bookingFlight();
	}

	public void bookingFlight() throws IOException, InterruptedException {
		Baseclass bc =new  Baseclass();

		bc.getDriver();
		bc.loadUrl("https://phptravels.net/login");
		bc.maximize();

		WebElement txtUser = bc.findLocatorByName("email");		
		String user = bc.getData("Data", 1, 0);
		bc.sendkeys(txtUser, user);

		WebElement txtPass = bc.findLocatorByName("password");
		String pass = bc.getData("Data", 1, 1);
		bc.sendkeys(txtPass, pass);

		WebElement btnRemebr = bc.findLocatorByXpath("//label[text()=\'Remember Me\']");

		WebElement btnLog = bc.findLocatorByXpath("//span[text()=\'Login\']");
		btnLog.click();

		//Booking Page

		WebElement btnFlight = bc.findLocatorByXpath("//a[text()=\'flights\']");
		btnFlight.click();

		WebElement txtFrom = bc.findLocatorByXpath("//input[@id=\'autocomplete\']");
		String frm = bc.getData("Data", 1, 2);
		bc.sendkeys(txtFrom, frm);	
		btnRemebr.click();
		WebElement madras = bc.findLocatorByXpath("//div[text()=\'Madras, India\']");
		madras.click();

		WebElement txtTo = bc.findLocatorByXpath("//input[@id=\'autocomplete2\']");
		String to = bc.getData("Data", 1, 3);
		bc.sendkeys(txtTo, to);
		WebElement mumbai = bc.findLocatorByXpath("//div[text()=\'Mumbai, India\']");
		mumbai.click();

		//		WebElement txtDate = bc.findLocatorByXpath("//input[@class=\'depart form-control\']");
		//		String data = bc.getData("Data", 1, 4);
		//		bc.sendkeys(txtDate, data);

		//		WebElement btnAdult = bc.findLocatorByXpath("//a[@class=\'dropdown-toggle dropdown-btn waves-effect\']");
		//		bc.moveToElement(btnAdult);
		//		bc.selectByText("Adult",btnAdult );
		//		bc.selectByValue("2", btnAdult);

		WebElement flightType = bc.findLocatorById("flight_type");
		bc.selectByText("Business", flightType);

		WebElement btnSearch = bc.findLocatorByXpath("//span[text()=\' Search\']");
		btnSearch.click();

		WebElement flightStop = bc.findLocatorByXpath("//input[@id='all']");
		flightStop.click();

		WebElement btnBook = bc.findLocatorByXpath("//span[text()='Book Now ']");
		btnBook.click();

		WebElement txtFname = bc.findLocatorByXpath("//input[@name=\'firstname_1\']");
		String frstName = bc.getData("Data", 1, 5);
		bc.sendkeys(txtFname, frstName);
		
		WebElement txtLname = bc.findLocatorByXpath("//input[@name=\'lastname_1\']");
		String lastName = bc.getData("Data", 1, 6);
		bc.sendkeys(txtLname, lastName);

		WebElement btnNatinality = bc.findLocatorByXpath("//select[@name=\'nationality_1\']");
		String txtNation = bc.getData("Data", 1, 7);
		bc.sendkeys(btnNatinality, txtNation);
		
		WebElement dobMonth = bc.findLocatorByXpath("//select[@name='dob_month_1']");
		String dMonth = bc.getData("Data", 1, 8);
		bc.sendkeys(dobMonth, dMonth);
		
		WebElement dobDate = bc.findLocatorByXpath("//select[@name='dob_day_1']");
		String ddate = bc.getData("data", 1, 9);
		bc.sendkeys(dobDate, ddate);
		
		WebElement dobyear = bc.findLocatorByXpath("//select[@name='dob_year_1']");
		String dYear = bc.getData("Data", 1, 10);
		bc.sendkeys(dobyear, dYear);
		
		WebElement numPassport = bc.findLocatorByXpath("//input[@name='passport_1']");
		String passID = bc.getData("Data", 1, 11);
		bc.sendkeys(numPassport, passID);

		WebElement passXpMonth = bc.findLocatorByXpath("//select[@name='passport_issuance_month_1']");
		String pXMonth = bc.getData("Data", 1, 12);
		bc.sendkeys(passXpMonth, pXMonth);
		
		WebElement passxpnMonth = bc.findLocatorByXpath("//select[@name='passport_month_1']");
		String pxmonthn = bc.getData("Data", 1, 13);
		bc.sendkeys(passxpnMonth, pxmonthn);
		
		WebElement passxdate = bc.findLocatorByXpath("//select[@name='passport_day_1']");
		bc.sendkeys(passxdate, "17");
		
		WebElement passxYear = bc.findLocatorByXpath("//select[@name='passport_year_1']");
		bc.sendkeys(passxYear, "2026");
		
		Thread.sleep(500);
		
//		WebElement clikPaymnt = bc.findLocatorByXpath("//input[@id='gateway_pay-later']");
//		bc.click(clikPaymnt);
		
		WebElement agreeCondtn = bc.findLocatorByXpath("//label[@for='agreechb']");
		agreeCondtn.click();

		WebElement cnfrmBooking = bc.findLocatorById("booking");
		cnfrmBooking.click();














	}



}
