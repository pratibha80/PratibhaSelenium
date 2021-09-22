package com.crm.SeleniumProject.Assign2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class VendoePage {
	
	WebDriver driver;
	
	public VendoePage(WebDriver driver)
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
