package com.mohs10.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mohs10.ActionDriver.Screenshot;
import com.mohs10.ActionDriver.XLUtils;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;
import com.mohs10.reuse.Tcfuns;

public class MamatvaScript extends StartBrowser
{
	
	String excelfile = "C:\\Users\\DELL\\Downloads\\TAF_Automation-master\\TAF_Automation-master\\TestData\\Mamatva.xlsx";
	String xlsheet = "Superadmin";
	
	@Test()
	
	public void PharmacyLoginTestcase() throws Exception {
		CommonFuns hm = new CommonFuns();
		//CommonFuns hm1 = new CommonFuns();
		//CommonFuns hm2 = new CommonFuns();
		
		
		String Memailid = XLUtils.getStringCellData(excelfile, xlsheet, 2, 0);//(rows, columns) 
		String Mpwd = XLUtils.getStringCellData(excelfile, xlsheet, 2, 1);
		String Location = XLUtils.getStringCellData(excelfile, xlsheet, 2, 2);
		
		hm.MamatvaTest (Memailid, Mpwd, Location);
		
		//hm.MamatvaLogin(Memailid, Mpwd,Location );  //,
		//hm1.Login(emailid1, pwd1); 
		Thread.sleep(5000);
	}
}