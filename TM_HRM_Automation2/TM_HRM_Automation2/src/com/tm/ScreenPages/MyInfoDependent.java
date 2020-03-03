package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class MyInfoDependent extends Weblibrary{
	
	@FindBy(xpath = "//a[text()='Dependents']")
    public static WebElement dependents;
	
	@FindBy(xpath = "//input[@id='btnAddDependent']")
    public static WebElement add_dependent;
	
	@FindBy(xpath = "//input[@id='dependent_name']")
    public static WebElement dependent_name;
	
	@FindBy(xpath = "//select[@id='dependent_relationshipType']")
    public static WebElement dependent_relation;
	
	@FindBy(xpath = "//input[@id='dependent_dateOfBirth']")
    public static WebElement date_Of_birth;
	
	@FindBy(xpath = "//input[@id='btnSaveDependent']")
    public static WebElement save_button;
	//=====================================================================================
	public static void MyInfo(){
		boolean status;
		
		status = clickElement(dependents);
		logEvent(status, "Clicked on dependents", " Not clicked on dependents");
		
		status = clickElement(add_dependent);
		logEvent(status, "Add Button Clicked", " Add Button not Clicked");
		
		status = setText(dependent_name, "vamsi");
		logEvent(status, "dependent name entered", " dependent name not entered");
		
		status = selectByText(dependent_relation, "other");
		logEvent(status, "Relationship Selected", " Relationship not Selected");
		
		status = setTextandEscape(date_Of_birth, "2002-11-11");
		logEvent(status, "Date of Birth Selected", " Date of Birth not Selected");
		
		status = clickElement(save_button);
		logEvent(status, "Save button clicked", "Save button is not clicked ");
		
		
	}	
		
		
		

}
