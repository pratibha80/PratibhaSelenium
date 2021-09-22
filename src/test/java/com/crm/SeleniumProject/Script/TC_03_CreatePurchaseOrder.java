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
import com.crm.SeleniumProject_Maven.GenericsLib.ExcelFileUtility;
import com.crm.SeleniumProject_Maven.GenericsLib.JavaUtility;
import com.crm.SeleniumProject_Maven.GenericsLib.WebDriverUtility;
import com.crm.genericUnit.JSONFileUtilty;

public class TC_03_CreatePurchaseOrder {
	
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
	String QTY = jsonLib.readDataFromJSON("qty");
	String LISTPRICE = jsonLib.readDataFromJSON("listprice");
	
	String subject = Lib.getExcelData("Sheet1", 1, 4);
	
	
	
	
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
	
	
	HomePage3 hp=new HomePage3(driver);
	hp.purchaseOrder();
	hp.signout();
	
	PurchaseOrderPage3 po=new PurchaseOrderPage3(driver);
	po.clickcreatepurchaseimg();
	
	CreatePurchaseOrder3 cp=new CreatePurchaseOrder3(driver);
	cp.clickOnsubject(subject);
	cp.Createvendorname();
	cp.itembox();
	cp.Quantitybox();
	
	
	VendoePage2 vp=new VendoePage2(driver);
	vp.clickOntestcase();
	
	
	
	
	}
	
	
}
