package com.mindweaver.schools;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

//import Appium.AppiumFramework.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CBSEboysWithAllGrade extends AppiumOurkids.Practical.Base 
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
	//-----------------------------------------------------------------------------------------------------------------	
		String clickOnSyllabus1 = "com.example.ourkids:id/ma2";
		MobileElement elementclickOnSyllabus1 = (MobileElement) android.findElement(By.id(clickOnSyllabus1));
		elementclickOnSyllabus1.click();
		Thread.sleep(2000);
		
		String cbse = "//android.widget.CheckedTextView[@text='CBSE']";
		MobileElement elementcbse = (MobileElement) android.findElement(By.xpath(cbse));
		elementcbse.click();
		Thread.sleep(2000);
		
		String clickOnGender1 = "com.example.ourkids:id/ma3";
		MobileElement elementclickOnGender1 = (MobileElement) android.findElement(By.id(clickOnGender1));
		elementclickOnGender1.click();
		Thread.sleep(2000);
		
		String boys = "//android.widget.CheckedTextView[@text='boys']";
		MobileElement elementboys = (MobileElement) android.findElement(By.xpath(boys));
		elementboys.click();
		Thread.sleep(2000);
		
		
		String clickOnGrade1st = "com.example.ourkids:id/ma4";
		MobileElement elementclickOnGrade1st = (MobileElement) android.findElement(By.id(clickOnGrade1st));
		elementclickOnGrade1st.click();
		Thread.sleep(2000);
		
		String clickOnGrade1 = "//android.widget.CheckedTextView[@text='1-10']";
		MobileElement elementclickOnGrade1 = (MobileElement) android.findElement(By.xpath(clickOnGrade1));
		elementclickOnGrade1.click();
		Thread.sleep(2000);
		
		String findSchoolsid1st   ="com.example.ourkids:id/schoolsactivity";
		MobileElement elementfindSchools = (MobileElement) android.findElement(By.id(findSchoolsid1st));
		elementfindSchools.click();
		Thread.sleep(2000);
		android.navigate().back();
		android.navigate().back();
//-----------------------------------------------------------------------------------------------------------------------------		
		
		String clickOnSyllabus2 = "com.example.ourkids:id/ma2";
		MobileElement elementclickOnSyllabus2 = (MobileElement) android.findElement(By.id(clickOnSyllabus2));
		elementclickOnSyllabus2.click();
		Thread.sleep(2000);
		
		String cbse1 = "//android.widget.CheckedTextView[@text='CBSE']";
		MobileElement elementcbse1 = (MobileElement) android.findElement(By.xpath(cbse1));
		elementcbse1.click();
		Thread.sleep(2000);
		
		
		String clickOnGender2 = "com.example.ourkids:id/ma3";
		MobileElement elementclickOnGender2 = (MobileElement) android.findElement(By.id(clickOnGender2));
		elementclickOnGender2.click();
		Thread.sleep(2000);
		
		String boys1 = "//android.widget.CheckedTextView[@text='boys']";
		MobileElement elementboys1 = (MobileElement) android.findElement(By.xpath(boys1));
		elementboys.click();
		Thread.sleep(2000);
		
		
		
		String clickOnGrade2nd = "com.example.ourkids:id/ma4";
		MobileElement elementclickOnGrade2nd = (MobileElement) android.findElement(By.id(clickOnGrade2nd));
		elementclickOnGrade2nd.click();
		Thread.sleep(2000);
		
		String clickOnGrade2 = "//android.widget.CheckedTextView[@text='1-12']";
		MobileElement elementclickOnGrade2 = (MobileElement) android.findElement(By.xpath(clickOnGrade2));
		elementclickOnGrade2.click();
		Thread.sleep(2000);
		
		String findSchoolsid2nd ="com.example.ourkids:id/schoolsactivity";
		MobileElement elementfindSchools2nd = (MobileElement) android.findElement(By.id(findSchoolsid2nd));
		elementfindSchools2nd.click();
		Thread.sleep(2000);
		android.navigate().back();
		android.navigate().back();
		
	//--------------------------------------------------------------------------------------------------------------------	
		String clickOnSyllabus3 = "com.example.ourkids:id/ma2";
		MobileElement elementclickOnSyllabus3 = (MobileElement) android.findElement(By.id(clickOnSyllabus3));
		elementclickOnSyllabus3.click();
		Thread.sleep(2000);
		
		String cbse2 = "//android.widget.CheckedTextView[@text='CBSE']";
		MobileElement elementcbse2 = (MobileElement) android.findElement(By.xpath(cbse2));
		elementcbse2.click();
		Thread.sleep(2000);
		
		String clickOnGender3 = "com.example.ourkids:id/ma3";
		MobileElement elementclickOnGender3 = (MobileElement) android.findElement(By.id(clickOnGender3));
		elementclickOnGender3.click();
		Thread.sleep(2000);
		

		String boys2 = "//android.widget.CheckedTextView[@text='boys']";
		MobileElement elementboys2 = (MobileElement) android.findElement(By.xpath(boys2));
		elementboys2.click();
		Thread.sleep(2000);
		
		
		String clickOnGrade = "com.example.ourkids:id/ma4";
		MobileElement elementclickOnGrade = (MobileElement) android.findElement(By.id(clickOnGrade));
		elementclickOnGrade.click();
		Thread.sleep(2000);
		
		String clickOnGrade3 = "//android.widget.CheckedTextView[@text='5-12']";
		MobileElement elementclickOnGrade3 = (MobileElement) android.findElement(By.xpath(clickOnGrade3));
		elementclickOnGrade3.click();
		Thread.sleep(2000);
		
		String findSchoolsid ="com.example.ourkids:id/schoolsactivity";
		MobileElement elementfindSchools1 = (MobileElement) android.findElement(By.id(findSchoolsid));
		elementfindSchools1.click();
		Thread.sleep(2000);
		android.navigate().back();
		android.navigate().back();
		
	}
	
	
	
	
	
	
	
		
		
		
	
	
	

}
