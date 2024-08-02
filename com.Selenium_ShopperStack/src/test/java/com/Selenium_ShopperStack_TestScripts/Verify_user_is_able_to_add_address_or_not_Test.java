package com.Selenium_ShopperStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Selenium_ShopperStack_GenericUtility.Base_Test;
import com.Selenium_ShopperStack_GenericUtility.Listeners_Utility;
import com.Selenium_ShopperStack_pom.AddressForm_Page;
import com.Selenium_ShopperStack_pom.Home_Page;
import com.Selenium_ShopperStack_pom.MyAddress_Page;
import com.Selenium_ShopperStack_pom.MyProfile_Page;
import com.aventstack.extentreports.Status;

@Listeners(Listeners_Utility.class)
public class Verify_user_is_able_to_add_address_or_not_Test extends Base_Test {
	
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException {
		
		test.log(Status.INFO,"homepage is displayed");
		
		Home_Page homePage = new Home_Page(driver);
		
		homePage.getAccountSettings().click();
		
		homePage.getMyProfile().click();
		
		test.log(Status.INFO,"my profile page is displayed");
		
		MyProfile_Page myprofile = new MyProfile_Page(driver);
		
		myprofile.getMyAddressBtn().click();
		
		
		MyAddress_Page myaddress = new MyAddress_Page(driver);
		myaddress.getAddAddressBtn().click();
		
		
		
	    addressForm = new AddressForm_Page(driver);
	    addressForm.getOfficeRadioBtn().click();
	    addressForm.getNameTextField().sendKeys(file.readExcelData("Sheet1", 1, 0));
	    addressForm.getHouseInfoTextField().sendKeys(file.readExcelData("Sheet1", 1, 1));
	    addressForm.getStreetInfoTextField().sendKeys(file.readExcelData("Sheet1", 1, 2));
	    addressForm.getLandmarkTextField().sendKeys(file.readExcelData("Sheet1", 1, 3));
	    addressForm.getCountryDropDown().sendKeys(file.readPropertyData("country"));
	    addressForm.getStateDropDown().sendKeys(file.readPropertyData("state"));
	    addressForm.getCityDropDown().sendKeys(file.readPropertyData("city"));
	    addressForm.getPincodeTextField().sendKeys(file.readExcelData("Sheet1", 1, 4));
	    addressForm.getPhoneNumberTextField().sendKeys(file.readExcelData("Sheet1", 1, 5));
	    addressForm.getAddAddressBtn().click();

				
		
	}
	

}
