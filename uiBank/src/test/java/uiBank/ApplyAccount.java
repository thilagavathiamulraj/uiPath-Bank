package uiBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplyAccount {

	WebDriver driver = DriverFactory.driver;

	By createAccount = By.xpath("//div[@class='btn btn-white card-header-item']");
	
	By nickName = By.xpath("//input[@id='accountNickname']");
	
	By accountType = By.xpath("//select[@id='typeOfAccount']");
	
	By clickApply = By.xpath("//button[text()='Apply']");
	
	By captureAccountId = By.id("accountId");

	
	public void applyforAccount() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(createAccount).click();

		driver.findElement(nickName).sendKeys("Test Account @123");

		driver.findElement(accountType).sendKeys("Checking");

		driver.findElement(clickApply).click();
		
		System.out.println(driver.findElement(captureAccountId).getText());
		
		driver.findElement(By.id("viewAccounts")).click();

	}

}
