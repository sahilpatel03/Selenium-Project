package com.Selenium_ShopperStack_GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility {
	
	public int generateRandomNumber() {
		
		Random r = new Random();
		int num = r.nextInt();
		return num;
		
	}
	
	
	
	public String localDate() {
		
		return LocalDate.now().toString().replace("-"," ");
		
		
		
	}
	
	public String localDateTime() {
		
		
		return LocalDateTime.now().toString().replaceAll("-", "").replaceAll(":", "").replaceAll(".", "");
	}
	

}
