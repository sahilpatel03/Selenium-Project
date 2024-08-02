package com.Selenium_ShopperStack_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.internal.TestResult;

public class Listeners_Utility implements ITestListener, ISuiteListener {
	
	Java_Utility java = new Java_Utility();
	
	public void conTestFailure(TestResult result) {
		
		TakesScreenshot ts = (TakesScreenshot) Base_Test.sDriver;
		
		File file = ts.getScreenshotAs(OutputType.FILE);
		
		File destn = new File(Framework_Contants.screenshotPath +java.localDateTime()+".png");
		
		try {
			FileHandler.copy(file, destn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
