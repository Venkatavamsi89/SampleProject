package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class MyInfoContact extends Weblibrary {

	@FindBy(xpath = "//a[text()='ContactDetails']")
    public static WebElement contact_details;
	
	@FindBy(xpath = "//input[@id='btnSave']")
    public static WebElement edit_details;
	
	@FindBy(xpath = "////input[@id='Contact_street1']")
    public static WebElement Contact_street1;
	
	@FindBy(xpath = "//input[@id='Contact_city']")
    public static WebElement Contact_city;
	
	@FindBy(xpath = "//input[@id='Contact_province']")
    public static WebElement Contact_province;
	
	@FindBy(xpath = "//input[@id='Contact_emp_zipcode']")
    public static WebElement contact_zip;
	
	@FindBy(xpath = "//input[@id='Contact_country']")
    public static WebElement contact_country;
	
	@FindBy(xpath = "//input[@id='Contact_emp_hm_telephone']")
    public static WebElement contact_telephone;
	
	@FindBy(xpath = "//input[@id='Contact_emp_work_email']")
    public static WebElement contact_email;
	
	@FindBy(xpath = "//input[@id='btnSave']")
    public static WebElement add_details;
	//===========================================================================================
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
