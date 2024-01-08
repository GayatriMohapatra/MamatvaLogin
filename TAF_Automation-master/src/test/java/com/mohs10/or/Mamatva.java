package com.mohs10.or;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

public class Mamatva {
	
	
	//Login to the Mamatva Superadmin

	public static By Memailid = By.xpath("//input[@id='email']");
	public static By Mpwd = By.xpath("//input[@id='password']");
	public static By Mloginbtn = By.xpath("//input[@value='LOGIN']");
	//Add Location
	public static By AddLocation = By.xpath("//span[normalize-space()='Add Location']");
	public static By Locationfill = By.xpath("//input[@id='Location']");
	public static By submitbtn= By.xpath("//button[@type='submit']");     
	//public static By Scrolldown= By.xpath
				//("//body/div[@class='container-scroller']/div[@class='container-fluid page-body-wrapper']/div[@class='main-panel']/div[@class='content-wrapper']/div[3]/div[1]/div[1]");
	//public static By Delete = By.xpath("//tbody/tr[11]/td[2]/span[1]/a[1]");
	//public static By Dltoption = By.xpath("//button[normalize-space()='Delete']");
	
	public static By Confirmadd = By.xpath("//button[@type='submit']"); //button[@type='submit']
	public static By MLogout = By.xpath("//p[@class='mb-1 text-white']");
	public static By MSignout = By.xpath("//a[@class='dropdown-item']");
	 
}
