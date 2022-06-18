package com.crm.qa.testclasses;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.baseclass.BaseClass;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactPageTest extends BaseClass{

	LoginPage loginPage;
	HomePage home;
	ContactPage contactPage;
	
	@BeforeMethod
	public void Setup()
	{
		loginPage=new LoginPage();
		home=loginPage.login(prop.getProperty("userName"),prop.getProperty("password"));
		contactPage=home.clickOnContact();
	}
	
	@Test
	public void CheckTitle()
	{
		boolean result=contactPage.checkContactTitle();
		Assert.assertTrue(result);
	}
	
	
}
