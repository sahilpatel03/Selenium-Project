package com.Selenium_ShopperStack_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_Utility {
	
	 WebDriver driver;
	  
	  public void selectByValue(WebElement element , String value)
	  {    
	    Select sel = new Select(element);
	    sel.selectByValue(value);
	  }
	  
	  public void selectByIndex(WebElement element , int i)
	  {    
	    Select sel = new Select(element);
	      sel.selectByIndex(i);
	  }
	  
	  public void selectByVisibleText(WebElement element , String value)
	  {    
	    Select sel = new Select(element);
	      sel.selectByVisibleText(value);
	  }
	  
	  public void deSelectByValue(WebElement element , String value)
	  {    
	    Select sel = new Select(element);
	    sel.deselectByValue(value);
	  }
	  
	  public void deSelectByIndex(WebElement element , int i)
	  {    
	    Select sel = new Select(element);
	      sel.deselectByIndex(i);
	  }
	  
	  public void deSelectByVisibleText(WebElement element , String value)
	  {    
	    Select sel = new Select(element);
	      sel.deselectByVisibleText(value);
	  }
	  
	  public void deSelectAll(WebElement element)
	  {
	    Select sel = new Select(element);
	    sel.deselectAll();

	  }
	  
	  public void webPageScreenShot() throws IOException
	  {
	    TakesScreenshot ts = (TakesScreenshot) Base_Test.sDriver;
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File("");
	    FileHandler.copy(source, destination);
	  }
	  
	  public void webElementScreenShot(WebElement element) throws IOException
	  {
	    
	        
	    File source=element.getScreenshotAs(OutputType.FILE);
	    File destination = new File("");
	    FileHandler.copy(source, destination);

	    
	  }

}
