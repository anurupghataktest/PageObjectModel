package com.crm.dataprovider;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.DataProvider;

import com.crm.baseclass.BaseClass;

import com.jayway.jsonpath.JsonPath;

import net.minidev.json.JSONArray;

public class ContactDataProvider extends BaseClass {
	
	static 
	{
		BaseClass.loadJson("Test.json");
	}
	
	

	@DataProvider(name="Test")
	public Object[][] getinvlaidUser() throws IOException
	{	
		
			List userName=JsonPath.read(jsonFile,"$.[*]");
			
			Object[][] returnValue=new Object[userName.size()][];
			
			Iterator it=userName.iterator();
			int i=0;
			int j=0;
			while(it.hasNext())
			{
				Map m=(Map)it.next();			
				Set s=m.entrySet();
				returnValue[i]=new Object[s.size()];
				Iterator itr=s.iterator();
				while(itr.hasNext())
				{
					Map.Entry em=(Map.Entry)itr.next();
					returnValue[i][j]=em.getValue();
					j++;
				}
				j=0;
				i++;
			}
			
			
				
		return returnValue;
	}

}
