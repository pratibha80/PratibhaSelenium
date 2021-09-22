package com.crm.SeleniumProject.Assign5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPage5 {
	
	
	public PurchaseOrderPage5(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@alt='Create Purchase Order...']")
	private WebElement createpurchaseimg;

	public WebElement getCreatepurchaseimg() {
		return createpurchaseimg;
	}
	
	
	public void clickcreatepurchaseimg()
	{
		createpurchaseimg.click();
	}	

}
