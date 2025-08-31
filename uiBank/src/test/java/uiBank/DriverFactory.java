package uiBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	static WebDriver driver;

	static WebDriver getEdgeDriver() {
		
		driver = new EdgeDriver();
		
		return driver;
	}

	static WebDriver getChromeDriver() {
		
		driver = new ChromeDriver();
		
		return driver;
	}

	static WebDriver getFirefoxDriver() {
		
		driver = new FirefoxDriver();
		
		return driver;
	}

}
