package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Immigration extends Weblibrary {
 @FindBy(xpath = "//a[text()='Immigration']")
	 private static WebElement immigration;	
	
 @FindBy(xpath ="//input[@id='btnAdd']")
	 private static WebElement clk_Add;	
	
 @FindBy(xpath = "//input[@id='immigration_type_flag_1']")
 private static WebElement document;
 
 @FindBy(xpath = "//input[@id='immigration_number']")
 private static WebElement number;
 
 @FindBy(xpath = "//input[@id='immigration_passport_issue_date']")
 private static WebElement issuedDate;
	
 @FindBy(xpath = "//input[@id='immigration_passport_expire_date']")
 private static WebElement expiryDate;
 
 @FindBy(xpath = "//input[@id='immigration_i9_status']")
 private static WebElement eligibleStatus;
 
 @FindBy(xpath = "//input[@id='immigration_country']")
 private static WebElement issuedBy;
 
 @FindBy(xpath = "//input[@id='immigration_i9_review_date']")
 private static WebElement eligibleReviewDate;
 
 @FindBy(xpath = "//input[@id='immigration_comments']")
 private static WebElement comments;
 
 @FindBy(xpath = "//input[@id='btnSave']")
 private static WebElement save;
 //=====================================================================
public static WebElement getImmigration() {
	return immigration;
}
public static WebElement getAdd() {
	return clk_Add;
}
public static WebElement getDocument() {
	return document;
}
public static WebElement getNumber() {
	return number;
}
public static WebElement getIssuedDate() {
	return issuedDate;
}
public static WebElement getExpiryDate() {
	return expiryDate;
}
public static WebElement getEligibleStatus() {
	return eligibleStatus;
}
public static WebElement getIssuedBy() {
	return issuedBy;
}
public static WebElement getEligibleReviewDate() {
	return eligibleReviewDate;
}
public static WebElement getComments() {
	return comments;
}
public static WebElement getSave() {
	return save;
}
//=========================================================================================

public static void immigration(){
	boolean status;
	
	status = clickElement (immigration);
	logEvent(status, "Clicked on immigration", "Not Clicked on immigration");
	
	status = clickElement(clk_Add);
	logEvent(status, "Clicked on addButton", "Not Clicked on addButton");
	
	status = clickElement(document);
	logEvent(status, "Clicked on document", "Not Clicked on document");
	
	status = setText(number, "12345");
	logEvent(status, "number entered", "number not entered");
	
	status = setTextandEscape(issuedDate, "2002-11-11");
	logEvent(status, "issuedDate Selected", " issuedDate not Selected");
			 
	status = setTextandEscape(expiryDate, "2020-11-11");
	logEvent(status, "expiryDate Selected", " expiryDate not Selected");
	
	status = setText(eligibleStatus, "eligible");
	logEvent(status, "status entered", "status not entered");
			 
	status = selectByText(issuedBy, "India");
	logEvent(status, "country Selected", "country not Selected");
	
	status = setTextandEscape(eligibleReviewDate, "2018-11-11");
	logEvent(status, "eligibleReviewDate Selected", " eligibleReviewDate not Selected");
	
	status = setText(comments, "no comments");
	logEvent(status, "comments entered", "comments not entered");
	
	status = clickElement(save);
	logEvent(status, "Save button clicked", "Save button is not clicked ");
	
}
}
