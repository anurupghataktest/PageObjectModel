package com.crm.qa.testclasses;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.crm.dataprovider.ContactDataProvider;

public class TestClass {
	
	
	@Test(dataProvider="Test",dataProviderClass=ContactDataProvider.class)
	public void test(String in,String mi)
	{
		
		
	}

}
