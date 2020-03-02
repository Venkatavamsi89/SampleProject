package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class ApplyLeave extends Weblibrary{
	//Leave Type field
	@FindBy(xpath = "//select[@id='applyleave_txtLeaveType']")
	public static WebElement dd_LeaveType;
	
	//from date field
	@FindBy(xpath = "//input[@id='applyleave_txtFromDate']")
	public static WebElement edit_fromDate;
	
	//To date field
	@FindBy(xpath = "//input[@id='applyleave_txtToDate']")
	public static WebElement edit_toDate;
	
	//Apply button field
	@FindBy(xpath = "//input[@id='applyBtn']")
	public static WebElement btn_Apply;

	//==============================================
	
	public static void ApplyLeave(String leaveType, String frmDate, String toDate){
		boolean status;
		
		status = selectByText(dd_LeaveType, leaveType);
		logEvent(status, "Leave type selected", "Leave type not selected");
		
		status = setTextandEscape(edit_fromDate, frmDate);
		logEvent(status, "From date entered", "From date not entered");
		
		status = setTextandEscape(edit_toDate, toDate);
		logEvent(status, "To date entered", "To date not entered");
		
		status = clickElement(btn_Apply);
		logEvent(status, "Apply button clicked", "Apply button not clicked");
		
	}
	
	//==============================================
	
}







