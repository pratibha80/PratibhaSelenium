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

public class TC_04_createContactWithOrganizationTest {
	WebDriver driver;
	/**
	 * 
	 * @throws Throwable
	 * @throws Throwable
	 */
	
	@Test
	public void creatContactWithOrganizatio() throws Throwable
	{
		//read all the necessary data
		JSONFileUtilty jsonLib=new JSONFileUtilty();
		JavaUtility jLib=new JavaUtility();
		WebDriverUtility wLib=new WebDriverUtility(); 
		ExcelFileUtility Lib=new ExcelFileUtility();
		String URL = jsonLib.readDataFromJSON("url");
		String BROWSER = jsonLib.readDataFromJSON("browser");
		String USERNAME = jsonLib.readDataFromJSON("username");
		String PASSWORD = jsonLib.readDataFromJSON("password");
		String contactName = Lib.getExcelData("Sheet1", 1, 2);
		String OrgName = Lib.getExcelData("Sheet1", 1, 3);
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
		
		
driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		
		driver.findElement(By.name("lastname")).sendKeys(contactName);
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		
		
		wLib.swithToWindow(driver, "Accounts");
		driver.findElement(By.id("search_txt")).sendKeys(OrgName);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.linkText("xyz")).click();
		
		
		wLib.swithToWindow(driver, "EditView");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		// logout
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wLib.mouseOver(driver, ele);
          driver.findElement(By.linkText("Organizations")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("pratibha");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		
		
	}

}
