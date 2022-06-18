package com.crm.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.utility.WebEventDriverListener;

import bsh.BshClassManager.Listener;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String configfile="D:\\Projects\\FreeCRMTest\\src\\main\\java\\com\\crm\\config\\config.properties";
	public static String jsonFilepath=System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\config\\";
	public static File jsonFile;
	public static EventFiringWebDriver listner;
	public static WebEventDriverListener c_listner;
	
	
	@BeforeMethod
	public void init()
	{
		try {
			FileInputStream fis=new FileInputStream(configfile);
			prop=new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(prop.getProperty("browser").equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(prop.get("browser").equals("ff"))
		{    
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		c_listner=new WebEventDriverListener();
		listner=new EventFiringWebDriver(driver); 
		listner.register(c_listner);
		driver=listner;
		
		driver.get(prop.getProperty("url")); 
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	public static void loadJson(String fileName)
	{
		jsonFile=new File(jsonFilepath+fileName); 
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
