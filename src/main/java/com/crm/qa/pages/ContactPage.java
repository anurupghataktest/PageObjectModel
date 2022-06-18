package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.baseclass.BaseClass;

public class ContactPage extends BaseClass  {
	
	@FindBy(xpath="//div[text()='Contacts']")
	WebElement contactTitle;
	String title="Contacts";
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement createNewContactbutton;
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean checkContactTitle()
	{
		if(contactTitle.getText().equals(title))
		{
			return true;
		}
		
		return false;
	}
	
	public void createNewContact()
	{
		createNewContactbutton.click();
	}
	
	public void SaveContact()
	{
		
	}
	
	
	
}
