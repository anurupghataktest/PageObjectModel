package com.crm.qa.testclasses;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.baseclass.BaseClass;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends BaseClass {
	
	HomePage homePage;
	LoginPage loginPage;
	
	@BeforeMethod
	public void setupLogin()
	{
		//System.out.println("Login Test Constructor");
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("userName"),prop.getProperty("password"));
	}
	
	@Test
	public void validateUser()
	{
		assertEquals(homePage.getUserName(),"Anurup Ghatak");
	}
	
	@Test
	public void validateLogo()
	{
		assertTrue(homePage.validateLogo());
	}
	
	
}
