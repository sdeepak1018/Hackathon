package Project;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetUp {

	public WebDriver SelectDriver() {
		WebDriver d = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser to execute \n1.Chrome\n2.Edge");
		int a=sc.nextInt();
		switch(a){
			case 1: d=new ChromeDriver();
			        break;
			case 2: d=new EdgeDriver();
	                break;
	        default: System.out.println("Wrong choice\n");         
		}
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		d.get("https://emicalculator.net/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return d;
}
}
