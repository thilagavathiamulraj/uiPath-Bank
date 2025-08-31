package uiBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	String browserName = "Edge";

	WebDriver driver;

	String URL = "https://uibank.uipath.com/welcome";

	By userName = By.xpath("//input[@id='username']");
	
	By passWord = By.xpath("//input[@id='password']");
	
	By login = By.xpath("//button[text()='Sign In']");
	
	By clickAgreeButton = By.xpath("//button[text()='I agree to the Privacy Policy ']");

	void launch() {

		if (browserName.equalsIgnoreCase("Edge")) {

			driver = DriverFactory.getEdgeDriver();

		} else if (browserName.equalsIgnoreCase("Chrome")) {
			
			driver = DriverFactory.getChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox"))

		{
			driver = DriverFactory.getFirefoxDriver();

		} else {
			
			System.out.println("Driver not found");
		}
		driver.get(URL);
	}

	void login() {
		
		driver.findElement(userName).sendKeys("ThilagaNinjaTest");
		
		driver.manage().window().maximize();
		
		driver.findElement(passWord).sendKeys("Thilaga@123");
		
		driver.findElement(login).click();
		
		driver.findElement(clickAgreeButton).click();
	}

}
