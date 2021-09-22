package com.crm.SeleniumProject.Assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePurchaseOrder {
	
	public CreatePurchaseOrder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@class='crmbutton small create'])[2]")
	private WebElement addservicebtn;
	
	@FindBy(xpath="//img[@src='themes/images/services.gif']")
	private WebElement servicebtn;

     
	@FindBy(xpath="//img[@src='themes/images/down_layout.gif']")
	private WebElement downwrdsymbol;
	
	
	
	public WebElement getAddservicebtn() {
		return addservicebtn;
	}

	public WebElement getServicebtn() {
		return servicebtn;
	}
	
	public WebElement getDownwrdsymbol() {
		return downwrdsymbol;
	}
	
	
	

	public void clickaddservicebtn()
	{
		addservicebtn.click();
	}
	
	public void clickservicebtn()
	{
		servicebtn.click();
	}

	public void clickdownwrdsymbol()
	{
		downwrdsymbol.click();
	}
	
	
}
