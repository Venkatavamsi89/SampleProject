package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class MyInfoContact extends Weblibrary {

	@FindBy(xpath = "//a[text()='ContactDetails']")
    private static WebElement contact_details;
	
	@FindBy(xpath = "//input[@id='btnSave']")
	private static WebElement edit_details;
	
	@FindBy(xpath = "////input[@id='Contact_street1']")
	private static WebElement Contact_street1;
	
	@FindBy(xpath = "//input[@id='Contact_city']")
	private static WebElement Contact_city;
	
	@FindBy(xpath = "//input[@id='Contact_province']")
	private static WebElement Contact_province;
	
	@FindBy(xpath = "//input[@id='Contact_emp_zipcode']")
	private static WebElement contact_zip;
	
	@FindBy(xpath = "//input[@id='Contact_country']")
	private static WebElement contact_country;
	
	@FindBy(xpath = "//input[@id='Contact_emp_hm_telephone']")
	private static WebElement contact_telephone;
	
	@FindBy(xpath = "//input[@id='Contact_emp_work_email']")
	private static WebElement contact_email;
	
	@FindBy(xpath = "//input[@id='btnSave']")
	private static WebElement add_details;
	//===========================================================================================
	public static WebElement getContact_details() {
		return contact_details;
	}
public static WebElement getEdit_details() {
		return edit_details;
	}
	public static WebElement getContact_street1() {
		return Contact_street1;
	}
	public static WebElement getContact_city() {
		return Contact_city;
	}
	public static WebElement getContact_province() {
		return Contact_province;
	}
	public static WebElement getContact_zip() {
		return contact_zip;
	}
	public static WebElement getContact_country() {
		return contact_country;
	}
	public static WebElement getContact_telephone() {
		return contact_telephone;
	}
	public static WebElement getContact_email() {
		return contact_email;
	}
	public static WebElement getAdd_details() {
		return add_details;
	}
//===============================================================================================
	public static void MyInfo(){
		boolean status;
		
		status = clickElement(contact_details);
		logEvent(status, "Clicked on Contact details", " Not clicked on contact details");
		
		status = clickElement(edit_details);
		logEvent(status, "Clicked on edit details", " Not clicked on edit details");
		
		status = setText(Contact_street1, "yvstreet");
		logEvent(status, "Street name entered", " Street name not entered");
		
		status = setText(Contact_city, "Kadapa");
		logEvent(status, "City name entered", " City name not entered");
		
		status = setText(Contact_province, "Andhra Pradesh");
		logEvent(status, "State name entered", " State name not entered");
		
		status = setText(contact_zip, "516002");
		logEvent(status, "Pin number is entered", " Pin number is not entered");
		
		status = setText(contact_telephone, "9848697309");
		logEvent(status, "Mobile number is entered", " Mobile number is not entered");
		
		status = setText(contact_email, "vamsi.avula1@gmail.com");
		logEvent(status, "email is entered", " email is not entered");
		
		status = clickElement(add_details);
		logEvent(status, "Clicked on add button", " Not clicked on add button");
		
	}
	
}
