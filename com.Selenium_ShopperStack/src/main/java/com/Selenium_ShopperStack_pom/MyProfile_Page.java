package com.Selenium_ShopperStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile_Page {
	
	public MyProfile_Page(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement myAddressBtn;

	public WebElement getMyAddressBtn() {
		return myAddressBtn;
	}
	
	
	

}
