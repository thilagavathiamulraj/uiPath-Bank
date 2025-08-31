package uiBank;

import org.testng.annotations.Test;

public class Runner {

	@Test
	void login() {
		
		Login login = new Login();
		
		login.launch();
		
		login.login();
		
		ApplyAccount applyAccount = new ApplyAccount();
		
		applyAccount.applyforAccount();
		
		FundTransfer transfer = new FundTransfer();
		
		transfer.transferFund();
		
		ApplyLoan applyLoan =new ApplyLoan();
		
		applyLoan.applyForLoan();
		
		applyLoan.retriverLoanDetails();
		
	}
	
}
