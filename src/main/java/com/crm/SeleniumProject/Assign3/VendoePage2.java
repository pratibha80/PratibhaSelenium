package com.crm.SeleniumProject.Assign3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class VendoePage2 {
	
	WebDriver driver;
	
	public VendoePage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='test case']")
	private WebElement testcaselnk;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTestcaselnk() {
		return testcaselnk;
	}
	
	
	public void clickOntestcase()
	{
		testcaselnk.click();
	}
	

}
