package uiBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FundTransfer {

	WebDriver driver = DriverFactory.driver;

	By transferFundLink = By.xpath("//a[text()=' Transfer Funds ']");
	
	By fromAccount = By.xpath("//select[@id='fromAccount']");
	
	By toAccount =By.xpath("//select[@id='toAccount']");
	
	By amount = By.id("amountTransferred");
	
	By clickReview =By.xpath("//button[text()='Review']");
	
	By confirmTransfer =By.xpath("//button[text()='Confirm Transfer ']");
	
	By successfulText = By.xpath("//h1[contains(text(),'successful!')]");
	
	By clickAccount = By.xpath("//a[contains(@href,'/accounts') and text()='Accounts']");
	
	public void transferFund() {
		
		driver.findElement(transferFundLink).click();
		
		WebElement selectAccountFrom = driver.findElement(fromAccount);
		
		Select accountFrom = new Select(selectAccountFrom);
		
		accountFrom.selectByContainsVisibleText("68b237ad006b721d32e82ea5");
		

		WebElement selectAccountTo = driver.findElement(toAccount);
		
		Select accountTo = new Select(selectAccountTo);
		
		accountTo.selectByContainsVisibleText("68b23901006b721d32e82ea8");

		driver.findElement(amount).sendKeys("20");

		driver.findElement(clickReview).click();

		driver.findElement(confirmTransfer).click();
		
		System.out.println(driver.findElement(successfulText).getText());
		
		driver.findElement(clickAccount).click();
		
	}
}
