package com.crm.SeleniumProject.Assign2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreatePurchaseOrder2 {
	
	public CreatePurchaseOrder2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="subject")
	private WebElement subjectbox;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement vendorname;
	
	
	@FindBy(id="productName1")
	private WebElement itembox;
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	 private WebElement savebtn;


	public WebElement getSubjectbox() {
		return subjectbox;
	}


	public WebElement getVendorname() {
		return vendorname;
	}


	public WebElement getItembox() {
		return itembox;
	}


	public WebElement getSavebtn() {
		return savebtn;
	}
	
	
       public void clickOnsubject(String subject)
       {
    	   subjectbox.sendKeys(subject);
       }
       public void Createvendorname()
       {
    	   vendorname.click(); 
       }
	
	  public void itembox()
	  {
		  itembox.click();
	  }
	 
	  public void savebutton()
	  {
		  savebtn.click();
	  }
	
}