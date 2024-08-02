package com.Selenium_ShopperStack_TestScripts;

import org.testng.annotations.Test;

import com.Selenium_ShopperStack_GenericUtility.Base_Test;
import com.Selenium_ShopperStack_pom.Home_Page;
import com.Selenium_ShopperStack_pom.MyAddress_Page;
import com.Selenium_ShopperStack_pom.MyProfile_Page;

public class Verify_user_is_able_to_delete_address_or_not_Test extends Base_Test{
	@Test
	public void deleteAddress() throws InterruptedException {
		
		homePage.getAccountSettings().click();
		homePage.getMyProfile().click();
		
	
		
		MyProfile_Page myProfile = new MyProfile_Page(driver);
		myProfile.getMyAddressBtn().click();
		
		MyAddress_Page myAddress_Page = new MyAddress_Page(driver);
		myAddress_Page.getDeleteAddressBtn().click();
		Thread.sleep(1000);
		
		
		myAddress_Page.getRemoveAddressPopUp().click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		
		
	}

}
