package com.tm.Libraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.tm.BaseClass.BaseClass;
import com.tm.reporting.Reports;

public class Weblibrary extends BaseClass {
	public static void highlight(WebElement element){
		try{
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 Thread.sleep(2000);
			 for(int i=1; i<=2; i++){
				 js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid black;')" , element);
				 Thread.sleep(200);
				 js.executeScript("arguments[0].setAttribute('style', 'border:;')" , element);
				 
			 }
		}
		catch(Exception e){}
	}

	public static boolean launchApplication(String URL) {

		boolean status;
		try {
			driver.get(URL);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}
		return status;
	}

	/*
	 * Method Name : setText
	 * 
	 * Description : This method is used to send the data to input text field
	 * 
	 * Input:: WebElement and text Data
	 * 
	 * Output: boolean status
	 * 
	 * Author : Testing Masters Technologies
	 * 
	 * 
	 * 
	 */

	public static boolean setText(WebElement element, String value) {
		boolean status;

		try {	
			highlight(element);
			element.click();
			element.clear();
			element.sendKeys(value);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}

	/*
	 * Method Name : setTextandEscape
	 * 
	 * Description : This method is used to send the data to input text field
	 * and Click on Escape button
	 * 
	 * Input:: WebElement and text Data
	 * 
	 * Output: boolean status
	 * 
	 * Author : Testing Masters Technologies
	 * 
	 * 
	 * 
	 */

	public static boolean setTextandEscape(WebElement element, String value) {
		boolean status;

		try {
			highlight(element);
			element.click();
			element.clear();
			element.sendKeys(value);
			element.sendKeys(Keys.ESCAPE);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}

	/*
	 * Method Name : logEvent
	 * 
	 * Description : This method is used to print the log status and take the
	 * screenshots
	 * 
	 * Input::boolean status, PassDescription , FailDescription
	 * 
	 * Output: Log status
	 * 
	 * Author : Testing Masters Technologies
	 * 
	 * 
	 * 
	 */

	public static void logEvent(boolean status, String PassDescription, String FailDescription) {

		if (status) {
			Reports.logEvent("Pass", PassDescription);
			System.out.println("		<<>> " + PassDescription + " <<>>");

		} else {
			Reports.logEvent("Fail", FailDescription);
			System.out.println("		<<>> " + FailDescription + " <<>>");

		}

	}

	/*
	 * Method Name : clickElement
	 * 
	 * Description : This method is used to Click the Element
	 * 
	 * Input:: WebElement
	 * 
	 * Output: boolean status
	 * 
	 * Author : Testing Masters Technologies
	 * 
	 * 
	 * 
	 */
	public static boolean clickElement(WebElement element) {

		boolean status;

		try {
			highlight(element);
			element.click();
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;
	}
	

	public static boolean moveToElement(WebElement element) {

		boolean status;
		try {
			highlight(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}
	
	
	
	public static boolean isExist(WebElement element) {

		boolean status;
		try {
			highlight(element);
			element.isDisplayed();
			status=true;
		} 
		catch (Exception e) 
		{
			status = false;
		}

		return status;

	}	
	
	public static boolean selectByText(WebElement element, String Selected_value) {

		boolean status;
		
		try {
			highlight(element);
			Select sc=new Select(element);
			sc.selectByVisibleText(Selected_value);
			
			status=true;
		}
		
		catch (Exception e) 
		{
			status = false;
		}
		
		return status;
	}
	
	public static void wait(int seconds)
	{
		try
		{
			Thread.sleep(seconds*1000);
		}
		catch(Exception e)
		{
			
		}
	}

}
