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

public class TC_02_createContactWithOrganizationTest {
    String OrganizationName = null;
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
		//ExcelFileUtility Lib=new ExcelFileUtility();
		String URL = jsonLib.readDataFromJSON("url");
		String BROWSER = jsonLib.readDataFromJSON("browser");
		String USERNAME = jsonLib.readDataFromJSON("username");
		String PASSWORD = jsonLib.readDataFromJSON("password");
		String ORGANIZATION = jsonLib.readDataFromJSON("OrganizationName");
		
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
		
		driver.findElement(By.linkText("Organizations")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		
		//wLib.swithToFrame(driver, 8);
		
		driver.findElement(By.name("accountname")).sendKeys(ORGANIZATION);
		System.out.println("ORGANIZATION"+ jLib.getRandomNum());
	
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wLib.mouseOver(driver, ele);
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();
		
	}

}
