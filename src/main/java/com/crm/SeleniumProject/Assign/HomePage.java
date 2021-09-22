package com.crm.SeleniumProject.Assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SeleniumProject_Maven.GenericsLib.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='More']")
	private WebElement moreImg;
	
	@FindBy(xpath="//a[text()='Purchase Order']")
	private WebElement purchasebtn;

	

	public WebElement getMoreImg() {
		return moreImg;
	}

	public WebElement getPurchasebtn() {
		return purchasebtn;
	}
	
	
	public void purchaseOrder()
	{
	   mouseOver(driver, moreImg);
	   
	   purchasebtn.click();
	}
	

}
