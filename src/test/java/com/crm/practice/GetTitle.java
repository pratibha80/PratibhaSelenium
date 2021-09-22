package com.crm.practice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class GetTitle {  
	public static void main(String[] args) 
		
	
		{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	      String ele=driver.findElement(By.xpath("//img[@title='Open Calendar...']")).getAttribute("title");
	      System.out.println(ele);
		//	Actions a=new Actions(driver);
		//a.moveToElement(ele).perform();
		//System.out.println(ele.getAttribute("title"));

	}

}
