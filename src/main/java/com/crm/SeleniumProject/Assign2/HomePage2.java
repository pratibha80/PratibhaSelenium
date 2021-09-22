package com.crm.SeleniumProject.Assign2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SeleniumProject_Maven.GenericsLib.WebDriverUtility;

public class HomePage2 extends WebDriverUtility {
	WebDriver driver;
	
	public HomePage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement moreImg;
	
	@FindBy(xpath="//a[text()='Purchase Order']")
	private WebElement purchasebtn;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administartorimg;
	
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutlnk;
	

	public WebElement getMoreImg() {
		return moreImg;
	}

	public WebElement getPurchasebtn() {
		return purchasebtn;
	}
	
	
	public WebElement getAdministartorimg() {
		return administartorimg;
	}

	public WebElement getSignoutlnk() {
		return signoutlnk;
	}

	public void purchaseOrder()
	{
	   mouseOver(driver, moreImg);
	   
	   purchasebtn.click();
	}
	public void signout()
	{
		mouseOver(driver, administartorimg);
		signoutlnk.click();
		
	}

}
