package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class PersonalDetails extends Weblibrary{
	
	@FindBy(xpath = "//input[@id='txtUsername']")
	private static WebElement Enter_username;
	@FindBy(xpath = "//input[@id='txtPassword']")
	private static WebElement Enter_password;
	@FindBy(xpath = "//input[@id='btnLogin']")
	private static WebElement Clk_login;
	@FindBy(xpath = "//b[txt()='My Info']")
	private static WebElement Clk_MyInfo;
	@FindBy(xpath = "//a[txt='Personal Details']")
	private static WebElement Clk_personalDetails;
	@FindBy(xpath = "//input[@id='btnSave']")
	private static WebElement Clk_Edit;
	@FindBy(xpath = "//input[@id='Personal_txtEmpFirstName']")
	private static WebElement Enter_firstname;
	@FindBy(xpath = "//input[@id='Personal_txtEmpMiddleName']")
	private static WebElement Enter_middlename;
	@FindBy(xpath = "//input[@id='Personal_txtEmpLastName']")
	private static WebElement Enter_lastname;
	@FindBy(xpath = "//input[@id='Personal_txtOtherID']")
	private static WebElement Enter_ID;
	@FindBy(xpath = "//input[@id='Personal_txtLicExpDate']")
	private static WebElement Enter_date;
	@FindBy(xpath = "//input[@id='Personal_optGender_2']")
	private static WebElement clk_gender;
	@FindBy(xpath = "//select[@id='Personal_cmbMarital']")
	private static WebElement select_status;
	@FindBy(xpath = "//select[@id='Personal_cmbNation']")
	private static WebElement select_nation;
	@FindBy(xpath = "//input[@id='btnSave']")
	private static WebElement clk_save;
	@FindBy(xpath = "//a[@id='welcome']")
	private static WebElement clk_welcome;
	@FindBy(xpath = "//a[text()='Logout']")
	private static WebElement clk_logout;
	//================================================================================================
	public static WebElement getEnter_username() {
		return Enter_username;
	}
	public static WebElement getEnter_password() {
		return Enter_password;
	}
	public static WebElement getClk_login() {
		return Clk_login;
	}
	public static WebElement getClk_MyInfo() {
		return Clk_MyInfo;
	}
	public static WebElement getClk_personalDetails() {
		return Clk_personalDetails;
	}
	public static WebElement getClk_Edit() {
		return Clk_Edit;
	}
	public static WebElement getEnter_firstname() {
		return Enter_firstname;
	}
	public static WebElement getEnter_middlename() {
		return Enter_middlename;
	}
	public static WebElement getEnter_lastname() {
		return Enter_lastname;
	}
	public static WebElement getEnter_ID() {
		return Enter_ID;
	}
	public static WebElement getEnter_date() {
		return Enter_date;
	}
	public static WebElement getClk_gender() {
		return clk_gender;
	}
	public static WebElement getSelect_status() {
		return select_status;
	}
	public static WebElement getSelect_nation() {
		return select_nation;
	}
	public static WebElement getClk_save() {
		return clk_save;
	}
	public static WebElement getClk_welcome() {
		return clk_welcome;
	}
	public static WebElement getClk_logout() {
		return clk_logout;
	}
	//==========================================================================================================
	public static void enterContactDetails(){
		boolean status;
		status = setText(Enter_username, "user02");
		logEvent(status, "username entered successfully", "username not entered successfully");
		status = setText(Enter_password, "TM1234");
		logEvent(status, "password entered successfully", "password not entered successfully");
		status = clickElement (Clk_login);
		logEvent(status, "Clicked on login", "Not Clicked on login");
		status = clickElement (Clk_MyInfo);
		logEvent(status, "successfully navigated to MyInfo", "unable to navigate to MyInfo");
		status = clickElement (Clk_personalDetails);
		logEvent(status, "successfully navigated to Personal Details", "unable to navigate to Personal Details");
		status = clickElement (Clk_Edit);
		logEvent(status, "successfully clicked on edit button", "unable to click on edit button");
		status = setText(Enter_firstname, "avula");
		logEvent(status, "firstname entered successfully", "firstname not entered successfully");
		status = setText(Enter_middlename, "venkata");
		logEvent(status, "middlename entered successfully", "middlename not entered successfully");
		status = setText(Enter_lastname, "vamsi");
		logEvent(status, "lastname entered successfully", "lastname not entered successfully");
		status = setText(Enter_ID, "1989");
		logEvent(status, "id entered successfully", "id not entered successfully");
		status = setText(Enter_date, "13-08-1989");
		logEvent(status, "date entered successfully", "date not entered successfully");
		status = clickElement (clk_gender);
		logEvent(status, "gender entered successfully", "unable to enter gender");
		status = selectByText(select_status, "Single");
		logEvent(status, "status Selected", "status not Selected");
		status = selectByText(select_nation, "India");
		logEvent(status, "nation Selected", "nation not Selected");
		status = clickElement(clk_save);
		logEvent(status, "Save button clicked", "Save button is not clicked ");
		status = moveToElement(clk_welcome);
		status = clickElement(clk_logout);
		logEvent(status, "Successfully logged out", "unable to logout");
	
       }
}