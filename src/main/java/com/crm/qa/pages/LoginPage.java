package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.baseclass.BaseClass;
import com.crm.dataprovider.LoginDataProvider;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//input[@type='text' and @name='email']")
	WebElement userbtn;
	
	@FindBy(xpath="//input[@type='password' and @name='password']")
	WebElement passbtn;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement submitbtn;
	
	
	@FindBy(xpath="//div[@class='ui negative message']//p")
	WebElement getNegetiveMessege;
	
	public LoginPage() {
		
		//System.out.println("LoginPage Constructor");
	
		PageFactory.initElements(driver,this);
		
	}
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	
	public HomePage login(String userName,String password)
	{
		userbtn.sendKeys(userName);
		passbtn.sendKeys(password);
		submitbtn.click();
		
		return new HomePage();
	}
	
	public String getNegetiveLoginMessege() 
	{
		return getNegetiveMessege.getText();
		
	}
	
	
	
	
	
}
