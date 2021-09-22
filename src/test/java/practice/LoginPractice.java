package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.SeleniumProject.POMRepository.LoginPage;
import com.crm.SeleniumProject_Maven.GenericsLib.ExcelFileUtility;
import com.crm.SeleniumProject_Maven.GenericsLib.JavaUtility;
import com.crm.SeleniumProject_Maven.GenericsLib.WebDriverUtility;
import com.crm.genericUnit.JSONFileUtilty;

public class LoginPractice {

	WebDriver driver;
	/**
	 * 
	 * @throws Throwable
	 * @throws Throwable
	 */
	
	@Test
	public void creatContactWithOrganizatio() throws Throwable
	{
		//read all the necessary data
		JSONFileUtilty jsonLib=new JSONFileUtilty();
		JavaUtility jLib=new JavaUtility();
		WebDriverUtility wLib=new WebDriverUtility(); 
		ExcelFileUtility Lib=new ExcelFileUtility();
		String URL = jsonLib.readDataFromJSON("url");
		String BROWSER = jsonLib.readDataFromJSON("browser");
		String USERNAME = jsonLib.readDataFromJSON("username");
		String PASSWORD = jsonLib.readDataFromJSON("password");
		String contactName = Lib.getExcelData("Sheet1", 1, 2);
		String OrgName = Lib.getExcelData("Sheet1", 1, 3);
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");		}
		driver.get(URL);
		wLib.waitForPageLoad(driver);
		wLib.maximizeWindow(driver);

	LoginPage lp=new LoginPage(driver);
	lp.login(USERNAME, PASSWORD);
	
}
}