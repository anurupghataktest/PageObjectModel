package com.crm.qa.testclasses;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.baseclass.BaseClass;
import com.crm.dataprovider.LoginDataProvider;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	LoginPage loginPage;
	public static String title="Cogmento CRM";
	public static String negetiveMsg="Invalid login";
	
	
	@BeforeMethod
	public void setupLogin()
	{
		//System.out.println("Login Test Constructor");
		loginPage=new LoginPage();
		
	}
	
	
	@Test(priority=1)
	public void checkTitle()
	{
		System.out.println("p1");
		Assert.assertEquals(title, loginPage.getTitle());
	}


	@Test(priority=2)
	public void loginWithValidUser ()
	{
		System.out.println("p2");
		loginPage.login(prop.getProperty("userName"),prop.getProperty("password"));
		
	}
	
	
	@Test(dataProvider="invalidUser",dataProviderClass=LoginDataProvider.class,priority=5)
	public void loginWithinValidData(String username,String pass)
	{
		System.out.println("P3");
		loginPage.login(username, pass);
		Assert.assertEquals(negetiveMsg, loginPage.getNegetiveLoginMessege());
		
	}

	
	
	
}
