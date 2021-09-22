package com.crm.SeleniumProject.Script;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.SeleniumProject.Assign.CreatePurchaseOrder;
import com.crm.SeleniumProject.Assign.HomePage;
import com.crm.SeleniumProject.Assign.LoginPage;
import com.crm.SeleniumProject.Assign.PurchaseOrderPage;
import com.crm.SeleniumProject.Assign.ServicePage;
import com.crm.SeleniumProject.Assign2.CreatePurchaseOrder2;
import com.crm.SeleniumProject.Assign2.HomePage2;
import com.crm.SeleniumProject.Assign2.PurchaseOrderPage2;
import com.crm.SeleniumProject.Assign2.VendoePage;
import com.crm.SeleniumProject_Maven.GenericsLib.ExcelFileUtility;
import com.crm.SeleniumProject_Maven.GenericsLib.JavaUtility;
import com.crm.SeleniumProject_Maven.GenericsLib.WebDriverUtility;
import com.crm.genericUnit.JSONFileUtilty;

public class TC_02_CreatePurchaseOrder {
	
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
	
	
	HomePage2 hp=new HomePage2(driver);
	hp.purchaseOrder();
	hp.signout();
	
	PurchaseOrderPage2 po=new PurchaseOrderPage2(driver);
	po.clickcreatepurchaseimg();
	
	
	CreatePurchaseOrder2 cp=new CreatePurchaseOrder2(driver);
	cp.clickOnsubject(subject);
	cp.Createvendorname();
	cp.itembox();
	cp.savebutton();
	
	VendoePage vp=new VendoePage(driver);
	vp.clickOntestcase();
			
	
	
	}
	
	
}
