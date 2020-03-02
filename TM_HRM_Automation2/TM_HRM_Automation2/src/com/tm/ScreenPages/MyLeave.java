package com.tm.ScreenPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;
import com.tm.reporting.Reports;

public class MyLeave extends Weblibrary {
        //====================================================================================
        @FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
		public static WebElement chk_All;
        
        @FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_0']")
		public static WebElement chk_Cancelled;
		
		@FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_1']")
		public static WebElement chk_pendingApproval;
		
		@FindBy(xpath = "//input[@id='btnSearch']")
		public static WebElement btn_Search;
		
		@FindBy(xpath = "//input[@id='btnReset']")
		public static WebElement btn_Reset;
		//=============================================================================
	    public static void FilterLeavesWithLeaveType(String Status)
	    {
	    	boolean status;
	    	status = clickElement(chk_All);
	    	logEvent(status, "All checkbox clicked", "All checkbox not clicked");
	    	switch(Status.trim().toUpperCase())
	    	{
	    	case "CANCELLED" :
	    	status = clickElement(chk_Cancelled);
	    	logEvent(status, "Cancelled checkbox clicked", "Cancelled checkbox not clicked");
	    	break;
	    	
	    case "Pending Approval" :
	    	status = clickElement(chk_pendingApproval);
	    	logEvent(status, "pendingApproval checkbox clicked", "pendingApproval checkbox not clicked");
	    	break;
	    	}
	    	
	    	status = clickElement(btn_Search);
	    	logEvent(status, "Search button clicked", "Search button not clicked");
	    }
	    //====================================================================================================
	    public static void VerifyStatus_ResultTable(String Status )
	    {
	    	boolean bStatus = true;
	    	int rowCount = driver.findElements(By.xpath("//table[@id='resultTable']/tr")).size();
	    	if(rowCount!=0)
	    	{
	    	for(int i=1; i<=rowCount; i++)
	    	{
	    		String appText = driver.findElement(By.xpath("//table[@id='resultTable']/tr["+i+"]/td[6]")).getText();
	    		if(!(appText.contains(Status)))
	    		{
	    			bStatus = false;
	    			break;
	    		}
	    	}
	    	logEvent(bStatus, "Leave status in result table displayed as expected", "Leave status in result table displayed as not expected");
	    }
	    	else
	    		Reports.logEvent("warning", "No results displayed in result table");
	    }
}

