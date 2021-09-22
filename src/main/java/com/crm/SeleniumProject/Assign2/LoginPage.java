package com.crm.SeleniumProject.Assign2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	@FindBy(name="user_name")
	 private WebElement userNmaeEdit;
	
	@FindBy(name="user_password")
	 private WebElement passwordEdit;

	
	@FindBy(id="submitButton")
	 private WebElement loginbtnEdit;


	public WebElement getUserNmaeEdit() {
		return userNmaeEdit;
	}


	public WebElement getPasswordEdit() {
		return passwordEdit;
	}


	public WebElement getLoginbtnEdit() {
		return loginbtnEdit;
	}
	
	public void login(String username,String password)
	{
		userNmaeEdit.sendKeys(username);
		passwordEdit.sendKeys(password);
		loginbtnEdit.click();
		
	}

	
	
	
	
	
	

}
