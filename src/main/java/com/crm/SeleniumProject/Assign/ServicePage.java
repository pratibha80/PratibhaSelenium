package com.crm.SeleniumProject.Assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SeleniumProject_Maven.GenericsLib.WebDriverUtility;

public class ServicePage extends WebDriverUtility {
	
	
	WebDriver driver;
	
	public ServicePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="popup_product_22")
	private WebElement linkbtn;

	public WebElement getLinkbtn() {
		return linkbtn;
	}
	
	
	public void clickonLink()
	{
		linkbtn.click();
	}
	
	
	//@FindBy(id="search_txt")
	//private WebElement searchtxtEdt;
	
	//@FindBy(name="search_field")
	//private WebElement searchFieald;


	//@FindBy(name="search")
	//private WebElement searchbtn;


	//public WebElement getSearchtxt() {
		//return searchtxtEdt;
	//}


	//public WebElement getSearchFieald() {
		//return searchFieald;
	//}


	//public WebElement getSearchbtn() {
		//return searchbtn;
	//}	
	
	
	//public void CreateSearchTxt (String searchtxt)
	//{
		//swithToWindow(driver, searchtxt);
		//searchtxtEdt.sendKeys(searchtxt);
	//}
	
	//public void SelectSearchField(String servicetyp)
	//{
		//searchFieald.sendKeys(servicetyp);
	//}
	
	//public void clickOnSearchbutton()
	//{
		//searchbtn.click();
	//}
	
}
