package com.crm.SeleniumProject.Assign5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreatePurchaseOrder5 {
	
	public CreatePurchaseOrder5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="subject")
	private WebElement subjectbox;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement vendorname;

	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	 private WebElement savebtn;

	
	@FindBy(id="qty1")
	private WebElement qtybox;
	

	@FindBy(id="listPrice1")
	
		private WebElement listpricrbx;
	
	
	
	public WebElement getSubjectbox() {
		return subjectbox;
	}


	public WebElement getVendorname() {
		return vendorname;
	}

	

	public WebElement getQtybox() {
		return qtybox;
	}
	
	public WebElement getListpricrbx() {
		return listpricrbx;
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

	  
	  public void quantitybox()
	  {
		  qtybox.click();
	  }
	 
	  public void listPricebox(String ListPrice)
	  {
		  listpricrbx.sendKeys(ListPrice);  
	  }
	  
	  
	  public void savebutton()
	  {
		  savebtn.click();
	  }


			
	}
	
