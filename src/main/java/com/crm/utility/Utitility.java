package com.crm.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.baseclass.BaseClass;

public class Utitility extends BaseClass {
	static WebDriverWait wait;
	
	public static void switchToframe(String frameName)
	{
		driver.switchTo().frame(frameName);
	}
	
	public static void WaitFOrElement(WebElement element)
	{
		wait=new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.elementToBeClickable(element)); 
		
	}

}
