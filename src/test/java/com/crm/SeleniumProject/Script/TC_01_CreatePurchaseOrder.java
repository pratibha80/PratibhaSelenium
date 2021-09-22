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
import com.crm.SeleniumProject_Maven.GenericsLib.ExcelFileUtility;
import com.crm.SeleniumProject_Maven.GenericsLib.JavaUtility;
import com.crm.SeleniumProject_Maven.GenericsLib.WebDriverUtility;
import com.crm.genericUnit.JSONFileUtilty;

public class TC_01_CreatePurchaseOrder extends WebDriverUtility{
	
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
	
	String servicetyp = Lib.getExcelData("Sheet1", 1,3);
	String searchtxt = Lib.getExcelData("Sheet1", 1,2);
	String partialWinTitle = Lib.getExcelData("Sheet1", 1,7);
	
	System.out.println(servicetyp);
	System.out.println(searchtxt);
	System.out.println(partialWinTitle);
	
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
	
	
	HomePage hp=new HomePage(driver);
	hp.mouseOver(driver,hp.getMoreImg());
	hp.mouseOver(driver,hp.getPurchasebtn());
	hp.getPurchasebtn().click();
	Thread.sleep(3000);
	
	PurchaseOrderPage pg=new PurchaseOrderPage(driver);
	pg.clickcreatepurchaseimg();
	
	CreatePurchaseOrder cp=new CreatePurchaseOrder(driver);
	cp.clickaddservicebtn();
	cp.clickservicebtn();
	cp.clickdownwrdsymbol();
	
	
	ServicePage sp=new ServicePage(driver);
	Thread.sleep(2000);
	swithToWindow(driver, partialWinTitle);
	Thread.sleep(2000);
     //sp.CreateSearchTxt(searchtxt);
	//sp.SelectSearchField(servicetyp);
	//sp.clickOnSearchbutton();
	
	
	}
	
	
}
