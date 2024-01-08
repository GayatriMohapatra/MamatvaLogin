package com.mohs10.reuse;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.mohs10.base.StartBrowser;
import com.mohs10.or.HomePage;
import com.mohs10.or.Mamatva;
import com.mohs10.or.THpage;

//import com.Mohs10.OR.PharmacySuperadminPage;
import com.mohs10.ActionDriver.Action;
import com.mohs10.ActionDriver.Actionitem;
import com.mohs10.ActionDriver.XLUtils;

public class MamatvaFun {
	public Actionitem aaDriver;
	public static Action aDriver;
	public static WebDriver driver;
	
	public MamatvaFun()
	{
		aaDriver= new Actionitem();
		aDriver = new Action();
		driver = StartBrowser.driver;
	
		
	}


	
	
	public void MamatvaTest(String Memailid,String Mpwd, String Location)throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to the Mamatva application");
		aDriver.navigateToApplication("http://mamatva.ap-south-1.elasticbeanstalk.com/");
		Thread.sleep(4000);
		
		//, String Location
		
		aDriver.type(Mamatva.Memailid, Memailid,"Enter the emailid");
		Thread.sleep(2000);
		
		aDriver.type(Mamatva.Mpwd, Mpwd,"Enter the emailid");
		Thread.sleep(2000);
		
		aDriver.click(Mamatva.Mloginbtn, "Click on the Login Button");
		Thread.sleep(2000);
		
		aDriver.click(Mamatva.AddLocation, "Click on the Login Button");
		Thread.sleep(2000);
		
		//WebElement button = driver.findElement(PharmacySuperadminPage.AddLocation);

		aDriver.type(Mamatva.Locationfill, Location, "Click on the Login Button");
		Thread.sleep(2000);
		
		aDriver.click(Mamatva.submitbtn, "Click on the Login Button");
		Thread.sleep(2000); 
		
		aDriver.click(Mamatva.Confirmadd,"Click on the confirm add");	
		
		aDriver.click(Mamatva.MLogout, "Click on the Logout Button");
		Thread.sleep(2000);
		aDriver.click(Mamatva.MSignout, "Click on the Signout Button");
		Thread.sleep(2000);
	}
		
		public void VerifyingWebsiteTitle() {
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Verifying the Title of the Application");
			aDriver.navigateToApplication("http://mamatva.ap-south-1.elasticbeanstalk.com/");

			String actualTitle = driver.getTitle();
			String expTitle = "Mamatva";

			if (actualTitle.equalsIgnoreCase(expTitle)) {

				System.out.println("Verified Title : Test Passed   " + actualTitle);
			} else {
				System.out.println("Title Not Matched : Test Failed" + expTitle);
			}
		
	}
	}