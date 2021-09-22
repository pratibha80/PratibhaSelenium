package TestYantraPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Set<String> ele = driver.getWindowHandles();
		
		for(String ele1:ele)
		{
			
			driver.switchTo().window(ele1);
			String actTittle = driver.getTitle();
			System.out.println(actTittle);
		}
		
		
	}

}
