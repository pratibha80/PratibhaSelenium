package com.crm.SeleniumProject.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//rule1: create a seperate class for every webpages
	
	
	
	public LoginPage(WebDriver driver) // rule 4: create a constructor and use PageFactory class to initialize
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	// rule 2: identify all the webElements using @FindBy,@FindBys and @FindAll annotions
	
	@FindBy(name="user_name")
	 private WebElement userNmaeEdit;
	
	@FindBy(name="user_password")
	 private WebElement passwordEdit;

	
	@FindBy(id="submitButton")
	 private WebElement loginbtnEdit;


	
	
	
	// rule 3: Declare all the webElements as private and provide the gettters
	
	
	public WebElement getUserNmaeEdit() {
		return userNmaeEdit;
	}


	public WebElement getPasswordEdit() {
		return passwordEdit;
	}


	public WebElement getLoginbtnEdit() {
		return loginbtnEdit;
	}

	
	// rule 5: access the webelements using getters or business methods

	
	public void login(String username,String password) {
		
		userNmaeEdit.sendKeys(username);
		
		passwordEdit.sendKeys(password);
		loginbtnEdit.click();
		
		
		
		
		
		
		
		
		
	}


	public void setUserNmaeEdit(WebElement userNmaeEdit) {
		this.userNmaeEdit = userNmaeEdit;
	}


	public void setPasswordEdit(WebElement passwordEdit) {
		this.passwordEdit = passwordEdit;
	}


	public void setLoginbtnEdit(WebElement loginbtnEdit) {
		this.loginbtnEdit = loginbtnEdit;
	}
	
	
	
	
}
