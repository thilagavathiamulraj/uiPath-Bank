package uiBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ApplyLoan {

	WebDriver driver = DriverFactory.driver;

	By applyForLoanLink = By.xpath("//a[@id='applyForLoan' and text()=' Apply For A Loan ']");

	By clickApplyLoanButton = By.xpath("//button[@class='btn btn-white btn-xl']");

	By requestorsEmail = By.xpath("//input[@id='email']");

	By loanAmount = By.xpath("//input[@id='amount']");

	By selectLoanTerm = By.xpath("//select[@id='term']");

	By yearlyIncome = By.xpath("//input[@id='income']");

	By age = By.xpath("//input[@id='age']");

	By clickSubmitButton = By.id("submitButton");

	By captureLoanId = By.xpath("//h4[@id='loanID']");

	By clickAccountTab = By.xpath("//a[text()='Accounts']");

	By clcickRetriveLoan = By.xpath("//button[contains(text(),'Retrieve')]");

	By clickLoanStatus = By.xpath("//a[text()=' Loan Status ']");

	By LoanAmountValue = By.id("amountValue");

	By interestRate = By.id("rateValue");

	By clickLogOut = By.xpath("//a[contains(text(),'Logout')]");

	public void applyForLoan() {

		driver.findElement(applyForLoanLink).click();

		driver.findElement(clickApplyLoanButton).click();

		driver.findElement(requestorsEmail).sendKeys("applyforloan@gmail.com");

		driver.findElement(loanAmount).sendKeys("10000");

		driver.findElement(selectLoanTerm).sendKeys("5");

		driver.findElement(yearlyIncome).sendKeys("100000");

		driver.findElement(age).sendKeys("30");

		WebElement element = driver.findElement(clickSubmitButton);

		Actions action = new Actions(driver);

		action.scrollToElement(element).click(element).perform();

		String loanIdText = driver.findElement(captureLoanId).getText();

		System.out.println("Your Loan ID is : " + loanIdText);

	}
	
	public void retriverLoanDetails() {
		
		String loanIdText= driver.findElement(captureLoanId).getText();
		
		driver.findElement(clickAccountTab).click();

		driver.findElement(clickLoanStatus).click();
		
		driver.findElement(By.id("quoteID")).sendKeys(loanIdText);

		driver.findElement(clcickRetriveLoan).click();

		String loanAmount = driver.findElement(LoanAmountValue).getText();

		System.out.println("Loan Amount: " + "$" + " " + loanAmount);

		String loanRate = driver.findElement(interestRate).getText();

		System.out.println("Loan Rate : " + " " + loanRate + "%");

		driver.findElement(clickLogOut).click();

		driver.quit();

		
	}

}
