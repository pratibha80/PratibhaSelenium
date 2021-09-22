package TestYantraPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Set<String> ele = driver.getWindowHandles();
		Iterator<String> tt = ele.iterator();
		while(tt.hasNext())
		{
			String actTitle = tt.next();
			String Title = driver.switchTo().window(actTitle).getTitle();
			if(Title.contains("Tech Mahindra"))
			{
				System.out.println(Title);
			}
			
		}

            driver.quit();

	}
}