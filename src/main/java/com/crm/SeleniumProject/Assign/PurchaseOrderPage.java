package com.crm.SeleniumProject.Assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPage {
	
	
	public PurchaseOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createpurchaseimg;

	public WebElement getCreatepurchaseimg() {
		return createpurchaseimg;
	}
	
	
	public void clickcreatepurchaseimg()
	{
		createpurchaseimg.click();
	}	

}
