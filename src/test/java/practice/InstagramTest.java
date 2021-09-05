package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InstagramTest {
        @Test
        public void Demo1() {
        	System.out.println("execute test");
        	String URL=System.getProperty("url");
        	String USERNAME=System.getProperty("username");
        	String PASSWORD=System.getProperty("password");
        	String BROWSER=System.getProperty("browsername");
        	
        	System.out.println(URL);
        	System.out.println(USERNAME);
        	System.out.println(PASSWORD);
        	System.out.println(BROWSER);
        	
        	WebDriver driver=null;
        	
        	if(BROWSER.equals("chrome"))
        	{
        		driver=new ChromeDriver();
        	}
        	else if(BROWSER.equals("firefox"))
        	{
        		driver=new FirefoxDriver();
        	}
        	else
        	{
        		System.out.println("invalid input");
        	}
        	
        	driver.get(URL);
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	driver.findElement(By.name("username")).sendKeys(USERNAME);
        	driver.findElement(By.name("password")).sendKeys(PASSWORD);
        	driver.findElement(By.xpath("//div[text()='Log In']")).click();
        	
        	
        	
        }
}
