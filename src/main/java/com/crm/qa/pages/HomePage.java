package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.baseclass.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//span[@class='user-display']")
	WebElement userName;
	
	@FindBy(xpath="//div[@id='top-header-menu']//div[@class='header item']")
	WebElement logoHomePage;
	
	@FindBy(xpath="//span[@class='item-text' and text()='Contacts']")
	WebElement contactPage;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getUserName()
	{
		return userName.getText();
	}
	
	public boolean validateLogo()
	{
		return logoHomePage.isDisplayed();
	}
	
	public ContactPage clickOnContact()
	{
		contactPage.click();
		return new ContactPage();
	}
	
	
}
