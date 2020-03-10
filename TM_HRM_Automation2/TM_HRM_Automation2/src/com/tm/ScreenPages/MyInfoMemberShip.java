
	package com.tm.ScreenPages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	import com.tm.Libraries.Weblibrary;

	public class MyInfoMemberShip extends Weblibrary{
		
		@FindBy(xpath = "//a[text()='Memberships']")
		private static WebElement link_memberShips;
		@FindBy (xpath = "//input[@id='btnAddMembershipDetail']")
		private static WebElement click_add;
		@FindBy (xpath = "//select[@id='membership_membership']")
		private static WebElement select_membership;
		@FindBy (xpath = "//select[@id='membership_subscriptionPaidBy']")
		private static WebElement select_paidBy;	
		@FindBy (xpath = "//input[@id='membership_subscriptionAmount']")
		private static WebElement subscription_amount;	
		@FindBy (xpath = "//select[@id='membership_currency']")
		private static WebElement select_currency;	
		@FindBy (xpath = "//input[@id='membership_subscriptionCommenceDate']")
		private static WebElement commence_date;	
		@FindBy (xpath = "//input[@id='membership_subscriptionRenewalDate']")
		private static WebElement renewal_date;	
		@FindBy (xpath = "//input[@id='btnSaveMembership']")
		private static WebElement click_save;	
		@FindBy (xpath = "//input[@id='btnCancel']")
		private static WebElement click_cancel;
		//===============================================================================
		public static WebElement get_link_memberShips() {
			return link_memberShips;
		}
		public static WebElement get_click_add() {
			return click_add;
		}
		public static WebElement get_select_membership() {
			return select_membership;
		}
		public static WebElement get_select_paidBy() {
			return select_paidBy;
		}
		public static WebElement get_subscription_amount() {
			return subscription_amount;
		}
		public static WebElement get_select_currency() {
			return select_currency;
		}
		public static WebElement get_commence_date() {
			return commence_date;
		}
		public static WebElement get_renewal_date() {
			return renewal_date;
		}
		public static WebElement get_click_save() {
			return click_save;
		}
		public static WebElement get_click_cancel() {
			return click_cancel;
		}
		//=================================================================================
		public static void memberShip() {
			boolean status;		
			status = clickElement(link_memberShips);
			logEvent(status, "MemberShip link is clicked", "MemberShip link is not clicked");		
			status = clickElement(click_add);
			logEvent(status, "clicked add button", "not clicked add button");		
			status = selectByText(select_membership,"ISTQB");
			logEvent(status, "selected ISTQB","not selected ISTQB");		
			status = selectByText(select_paidBy,"Company");
			logEvent(status, "selected company","not selected company");		
			status = setText(subscription_amount,"5000");
			logEvent(status, "subscription amount entered", "subscription amount is not entered");		
			status = selectByText(select_currency, "Indian Rupee");
			logEvent(status, "required currency is selected", "required currency is not selected");		
			status = setTextandEscape(commence_date,"2020-03-11");
			logEvent(status, "commence date is selected", "commence date is not selected");		
			status = setTextandEscape(renewal_date, "2021-03-11");
			logEvent(status, "renewal date is selected", "renewal date is not selected");		
			status = clickElement(click_save);
			logEvent(status, "clicked on save button","not clicked on save button");
			
//			status = clickElement(click_cancel);
//			logEvent(status, "clicked on cancel button","not clicked on cancel button");
			
		}
		
	}


