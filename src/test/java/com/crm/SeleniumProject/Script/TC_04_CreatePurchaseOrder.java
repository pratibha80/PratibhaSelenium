package com.crm.SeleniumProject.Script;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.SeleniumProject.Assign.LoginPage;
import com.crm.SeleniumProject.Assign3.CreatePurchaseOrder3;
import com.crm.SeleniumProject.Assign3.HomePage3;
import com.crm.SeleniumProject.Assign3.PurchaseOrderPage3;
import com.crm.SeleniumProject.Assign3.VendoePage2;
import com.crm.SeleniumProject.Assign4.CreatePurchaseOrder4;
import com.crm.SeleniumProject.Assign4.HomePage4;
import com.crm.SeleniumProject.Assign4.PurchaseOrderPage4;
import com.crm.SeleniumProject_Maven.GenericsLib.ExcelFileUtility;
import com.crm.SeleniumProject_Maven.GenericsLib.JavaUtility;
import com.crm.SeleniumProject_Maven.GenericsLib.WebDriverUtility;
import com.crm.genericUnit.JSONFileUtilty;

public class TC_04_CreatePurchaseOrder {
	
	WebDriver driver;
	/**
	 * @throws Throwable 
	 *  
	 * 
	 */
	
	@Test
	public void createPurcahseOrder() throws  Throwable {

	JSONFileUtilty jsonLib=new JSONFileUtilty();
	JavaUtility jLib=new JavaUtility();
	WebDriverUtility wlib=new WebDriverUtility();
	ExcelFileUtility Lib=new ExcelFileUtility();
	
	String URL = jsonLib.readDataFromJSON("url");
	String USERNAME = jsonLib.readDataFromJSON("username");
	String PASSWORD = jsonLib.readDataFromJSON("password");
	String BROWSER = jsonLib.readDataFromJSON("browser");
	 
	
	String subject = Lib.getExcelData("Sheet1", 1, 4);
	String Qty = Lib.getExcelData("Sheet1", 1,6);
	String listprice = Lib.getExcelData("Sheet1", 1,7);
	
	
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("invalid browser");
	}
	driver.get(URL);
	
	wlib.waitForPageLoad(driver);
	wlib.maximizeWindow(driver);
	LoginPage lp=new LoginPage(driver);
	lp.login(USERNAME, PASSWORD);
	
	
	HomePage4 hp=new HomePage4(driver);
	hp.purchaseOrder();
	hp.signout();
	
	PurchaseOrderPage4 po=new PurchaseOrderPage4(driver);
	po.clickcreatepurchaseimg();
	
	CreatePurchaseOrder4 cp=new CreatePurchaseOrder4(driver);
	cp.clickOnsubject(subject);
	cp.Createvendorname();
	cp.itembox();
	cp.quantitybox();
	cp.listPricebox(listprice);
	
	
	VendoePage2 vp=new VendoePage2(driver);
	vp.clickOntestcase();
	
	
	
	
	}
	
	
}
