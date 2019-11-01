package com.mindweaver.schools;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import AppiumOurkids.Practical.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RunMaven extends Base
{
	@Test(priority=1)
	public  void testValidation() throws InterruptedException, IOException
	{
		AndroidDriver<AndroidElement> android = capabilities("OurkidsApp");
		
		try 
		{
			Thread.sleep(2000);
			String allowx = "//android.widget.Button[@text='ALLOW']";
			MobileElement elementAllow = (MobileElement) android.findElement(By.xpath(allowx));
			elementAllow.click();
			Thread.sleep(2000);
			
			
		} 
		catch (Exception e)
		{
			System.out.println("App is Launched");
			
		}
		
		String schools = "//android.widget.TextView[@text='SCHOOLS']";
		MobileElement elementSchools = (MobileElement) android.findElement(By.xpath(schools));
		elementSchools.click();
		Thread.sleep(2000);
		
	}
		

}
