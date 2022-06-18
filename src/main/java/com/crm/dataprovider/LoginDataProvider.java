package com.crm.dataprovider;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.crm.baseclass.BaseClass;
import com.jayway.jsonpath.JsonPath;

public class LoginDataProvider extends BaseClass {
	
	static 
	{
		BaseClass.loadJson("loginPage.json");
	}
	
	@DataProvider(name="invalidUser")
	public Object[][] getinvlaidUser() throws IOException
	{	
		
			String userName=JsonPath.read(jsonFile,"$."+"firstname");
			String password=JsonPath.read(jsonFile,"$."+"password");
			
				
		return new Object[][] {{userName,password}};
	}
	
	

}
