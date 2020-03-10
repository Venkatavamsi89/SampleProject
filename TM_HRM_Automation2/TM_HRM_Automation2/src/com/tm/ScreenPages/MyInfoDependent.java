package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class MyInfoDependent extends Weblibrary{
	
	@FindBy(xpath = "//a[text()='Dependents']")
    private static WebElement linkDependents;
	
	@FindBy(xpath = "//input[@id='btnAddDependent']")
	private static WebElement add_dependent;
	
	@FindBy(xpath = "//input[@id='dependent_name']")
	private static WebElement dependent_name;
	
	@FindBy(xpath = "//select[@id='dependent_relationshipType']")
	private static WebElement dependent_relation;
	
	@FindBy(xpath = "//input[@id='dependent_dateOfBirth']")
	private static WebElement date_Of_birth;
	
	@FindBy(xpath = "//input[@id='btnSaveDependent']")
	private static WebElement save_button;
	//=====================================================================================
	public static WebElement getLinkDependents() {
		return linkDependents;
	}
	public static WebElement getAdd_dependent() {
		return add_dependent;
	}
	public static WebElement getDependent_name() {
		return dependent_name;
	}
	public static WebElement getDependent_relation() {
		return dependent_relation;
	}
	public static WebElement getDate_Of_birth() {
		return date_Of_birth;
	}
	public static WebElement getSave_button() {
		return save_button;
	}
	
	//======================================================================================
	public static void MyInfo(){
		boolean status;
		
		status = clickElement(linkDependents);
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
