package com.crm.SeleniumProject.POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SeleniumProject_Maven.GenericsLib.WebDriverUtility;

public class HomePage  extends WebDriverUtility{
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Organizations")
	private WebElement organizationlnk;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorimg;
	
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoiutlnk;
	
	
	@FindBy(linkText="Contacts")
	private WebElement contactslnk;
	
	@FindBy(linkText="Products")
	private WebElement productslnk;
	
	@FindBy(linkText="Email")
	private WebElement emaillnk;

	@FindBy(linkText="Opportunities")
	private WebElement opportunitieslnk;

	@FindBy(linkText="Leads")
	private WebElement leadslnk;
	
	
	//generate getter

	public WebElement getOrganizationlnk() {
		return organizationlnk;
	}

	public WebElement getAdministratorimg() {
		return administratorimg;
	}

	public WebElement getSignoiutlnk() {
		return signoiutlnk;
	}

	public WebElement getContactslnk() {
		return contactslnk;
	}

	public WebElement getProductslnk() {
		return productslnk;
	}

	public WebElement getEmaillnk() {
		return emaillnk;
	}

	public WebElement getOpportunitieslnk() {
		return opportunitieslnk;
	}

	public WebElement getLeadslnk() {
		return leadslnk;
	}
	
	public void clickonOrganization()
	{
		organizationlnk.click();
	}
	
	public void clickoncontact()
	{
		contactslnk.click();
	}
	
	public void signout()
	{
		mouseOver(driver, administratorimg);
		signoiutlnk.click();
	}
	
	public void clickOnLeads()
	{
		leadslnk.click();
	}
	
	
	
	
}
