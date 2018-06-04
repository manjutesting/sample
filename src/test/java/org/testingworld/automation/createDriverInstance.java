package org.testingworld.automation;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class createDriverInstance {
public WebDriver generateDriverInstance() {
	WebDriver driver = null;
	ResourceBundle  config=ResourceBundle.getBundle("config");
	if(config.getString("browser").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
	     }
	else if(config.getString("browser").equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	else if(config.getString("browser").equalsIgnoreCase("FF")) {
		driver=new FirefoxDriver();
	}
		
		driver.get(config.getString("applicationURL"));
		return driver;
	}
public void closeDriverInstance(WebDriver driver) {
	driver.quit();
}
}
