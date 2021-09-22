package com.crm.Selenium.Contacts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.SeleniumProject_Maven.GenericsLib.ExcelFileUtility;
import com.crm.SeleniumProject_Maven.GenericsLib.JavaUtility;
import com.crm.SeleniumProject_Maven.GenericsLib.WebDriverUtility;
import com.crm.genericUnit.JSONFileUtilty;

public class TC_05_createProductTest {
	
	WebDriver driver;
	/**
	 * @throws Throwable 
	 * @throws IOException 
	 * 
	 */
	@Test
	
	public void createProduct() throws Throwable {
		JSONFileUtilty jsonLib=new JSONFileUtilty();
		JavaUtility jLib=new JavaUtility();
		WebDriverUtility wLib=new WebDriverUtility();
		ExcelFileUtility Lib=new ExcelFileUtility();
		String URL = jsonLib.readDataFromJSON("url");
		String BROWSER = jsonLib.readDataFromJSON("browser");
		String USERNAME = jsonLib.readDataFromJSON("username");
		String PASSWORD = jsonLib.readDataFromJSON("password");
		//String productName = Lib.getExcelData("Sheet1", 1, 2);
		//String partnumber = Lib.getExcelData("Sheet1", 1, 3);
		String PRODUCTNAME = jsonLib.readDataFromJSON("productName");
		String PARTNUM = jsonLib.readDataFromJSON("partNum");
		
		
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
		wLib.waitForPageLoad(driver);
		wLib.maximizeWindow(driver);
		
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
          
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	    driver.findElement(By.name("productname")).sendKeys(PRODUCTNAME);
	    driver.findElement(By.id("productcode")).sendKeys(PARTNUM);
	    
	    
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    
	    driver.findElement(By.linkText("Products")).click();
	    
	    driver.findElement(By.name("search_text")).sendKeys(PARTNUM);
	     WebElement ele = driver.findElement(By.id("bas_searchfield"));
	     ele.click();
	    wLib.select(ele, 2);
	    wLib.select(ele, "Part Number");
	    
	    driver.findElement(By.name("submit")).click();
		
	
	}

}
