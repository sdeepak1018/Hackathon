package step_defenition;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
 
public class hooks {
	static WebDriver driver;
		@BeforeAll
	    public static void before_or_after_all() throws IOException, InterruptedException{
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://emicalculator.net/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();
	}
		@AfterStep
	    public void addScreenshot(Scenario scenario) {
	    if(!scenario.isFailed()) {
	       TakesScreenshot ts=(TakesScreenshot) driver;
	       byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
	       scenario.attach(screenshot, "image/png",scenario.getName());
	        }
		}
		@AfterAll
		public static void before_or_after_all1() {
			driver.quit();
			String reportFilePath = "C:\\Users\\2303965\\eclipse-workspace\\Hackathon_Project\\reports\\CucumberReports.html";
	        File htmlFile = new File(reportFilePath);
	        try {
				Desktop.getDesktop().browse(htmlFile.toURI());
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	}
