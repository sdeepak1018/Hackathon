package Project;

import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class DriverSetUp {
 
	String huburl = "http://10.229.14.141:4444";
 
	public WebDriver SelectDriver() throws MalformedURLException {
		WebDriver d = null;
			DesiredCapabilities ds = new DesiredCapabilities();
			//ds.setCapability("browserName", "chrome");
//			ds.setBrowserName("chrome");
			ds.setBrowserName("MicrosoftEdge");
 
			d = new RemoteWebDriver(new URL(huburl), ds);

		return d;
	}
	
 
}
