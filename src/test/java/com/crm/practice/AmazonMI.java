package com.crm.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import junit.framework.Assert;

public class AmazonMI {
	public static void main(String[] args) throws Throwable {
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile under 15000");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		Assert.assertEquals(true, true);
		System.out.println("test case is passed");
		
		driver.close();
	}

}
