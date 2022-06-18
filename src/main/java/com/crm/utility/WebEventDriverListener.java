package com.crm.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.baseclass.BaseClass;

public class WebEventDriverListener extends BaseClass implements WebDriverEventListener{

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("A");
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		System.out.println("B");
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("C");
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("D");
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("E");	
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("F");
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("G");
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("H");
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("I");
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("J");
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("K");
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("L");
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("M");
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("N");
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("O");
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("P");
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Q");
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("R");
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		System.out.println("S");
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		System.out.println("T");
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("U");
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		 
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

}
