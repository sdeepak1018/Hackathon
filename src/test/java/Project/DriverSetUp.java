package Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class DriverSetUp {
 
	String huburl = "http://10.229.14.141:4444";
 
	public WebDriver SelectDriver() throws MalformedURLException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		   d.get("https://emicalculator.net/");
	       d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			DesiredCapabilities ds = new DesiredCapabilities();
			//ds.setCapability("browserName", "chrome");
//			ds.setBrowserName("chrome");
//			ds.setBrowserName("MicrosoftEdge");
 
//			d = new RemoteWebDriver(new URL(huburl), ds);

		return d;
	}
	
 
}
