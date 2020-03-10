package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.ApplyLeave;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Immigration;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.MyLeave;


public class TestCases_Leave extends BaseClass {
	
	@Test
	public static void TC103_FilterAndVerifyLeaveStatus()
	{
		String[] data = ReadRowData(CurrentTestCaseName);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		MyLeave myleave = PageFactory.initElements(driver, MyLeave.class);
		
		//step 1 : Login as a team member
		login.LoginHRM(data[0], data[1]);
		
		//step 2 : Navigate to My Leave Page
		home.navMyLeave();
		
		//step 3 : Filter Leaves list with Leave Type
		myleave.FilterLeavesWithLeaveType(data[2]);
		
		//step 4 : Verify leaves status in result table
		myleave.VerifyStatus_ResultTable(data[2]);
		
		//step 5 : Logout
		home.Logout(); 
		
	}
	
	
	@Test
	public void TC101_verifyLoginFunctionality() {
		
		String[] data = ReadRowData(CurrentTestCaseName);
		
		// Create the page pattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);
		//Login lp = new Login();
		// Create the page pattern to Home Page
		//Home hpg = PageFactory.initElements(driver, Home.class);		

		lp.LoginHRM(data[0], data[1]);
		//lp.LoginHRM("user02", "TM1234");
		//hpg.Exist();
		//hpg.logOut();
	}
	
	//==============================================================================
	@Test
	public void TC102_ApplyLeave() {
		String[] data = ReadRowData(CurrentTestCaseName);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		ApplyLeave applyleave = PageFactory.initElements(driver, ApplyLeave.class);
				
		//Step 1: Login as a team member
		login.LoginHRM(data[0], data[1]);
		
		//Step 2: Navigate Apply Leave page
		home.navApplyLeave();
		
		//Step 3: Enter leave details and click save
		applyleave.ApplyLeave(data[2], data[3], data[4]);
		
		//Step 4: Navigate my Leave page
		home.navMyLeave();
		
		//Step 5: Verify leave details in My Leave page
		
		
		//Step 6: Logout
		home.Logout();
		
	}
	
	//=================================================================================
	@Test
	public void TC104_Immigration() {
		String[] data = ReadRowData(CurrentTestCaseName);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Immigration myInfo = PageFactory.initElements(driver, Immigration.class);
				
		//Step 1: Login as a team member
		login.LoginHRM(data[0], data[1]);
		
		//Step 2: Navigate Apply Leave page
		home.navApplyLeave();
		
		//Step 3: Enter leave details and click save
		//applyleave.ApplyLeave(data[2], data[3], data[4]);
		myInfo.immigration();
		//Step 4: Navigate my Leave page
		//home.navMyLeave();
		
		//Step 5: Verify leave details in My Leave page
		
		
		//Step 6: Logout
		home.Logout();
		
	}
	
}
	
	
	
	
	
	
	
	
