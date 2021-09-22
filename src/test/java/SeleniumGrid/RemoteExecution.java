package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteExecution {
	
	@Test
	
	public void remoteExecutionTest() throws MalformedURLException
	{
	     URL url=new URL("http://18.116.65.106:5555/wd/hub");
	     DesiredCapabilities cap=new DesiredCapabilities();
	     cap.setBrowserName("chrome");
	     cap.setPlatform(Platform.WINDOWS);
	     
	     RemoteWebDriver driver=new RemoteWebDriver(url, cap);
	     
	     driver.get("http://gmail.com");
	     System.out.println("browser launched successfully");
	}

}
