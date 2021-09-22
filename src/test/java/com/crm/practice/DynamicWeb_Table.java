package com.crm.practice;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.genericUnit.JSONFileUtilty;


public class DynamicWeb_Table {
	@Test
	public void Vtiger() throws Throwable {
		JSONFileUtilty jsonLib = new JSONFileUtilty();
		String URL = jsonLib.readDataFromJSON("url");
		String USERNAME = jsonLib.readDataFromJSON("username");
		String PASSWORD = jsonLib.readDataFromJSON("password");
		String BROWSER = jsonLib.readDataFromJSON("browser");
		
		WebDriver driver=new ChromeDriver();
		//load the url
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// login the vTiger
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		//click on organization
		driver.findElement(By.linkText("Organizations")).click();
		//print all the checkbox
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td/input[@name='selected_id']"));
		//List<WebElement> list = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr[@class='lvtColData']/td/input[@name='selected_id'])[]"));
		//driver.findElement(By.linkText("del")).click();
		//driver.switchTo().alert().accept();
		//int count=0;
		//for(int i=1;i<list.size();i++) {
		for( WebElement web:list) {
		
			web.click();
			list.get(3).click();
		}
		
		}
	
		//list.get(list.size()-1).click();
		//driver.close();
		//System.out.println("Count " + list.size());
		
	}


