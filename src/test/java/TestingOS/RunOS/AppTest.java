package TestingOS.RunOS;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
 //Testing OS Connectivity
	@Test 
    public void testApp() throws Exception
    {
		// System.setProperty("webdriver.chrome.driver", "/Users/e5110782/Downloads/chromedriver");
	RemoteWebDriver ddriver;
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("browserName","chrome");
	caps.setCapability("platform", "MAC"); 
	ddriver = new RemoteWebDriver(new URL("http://10.233.105.45:5568/wd/hub"), caps);
	
	
	
		ddriver.get("https://www.google.com.au");
		ddriver.quit();
		
      
      
      
    }
}
