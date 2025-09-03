package uiBank;

import org.testng.annotations.Test;

public class Runner {

	@Test(priority=1)
	void login() {

		Login login = new Login();

		login.launch();

		login.login();

	}
	@Test(priority=2)
	void ApplyForAnAccount() {

		ApplyAccount applyAccount = new ApplyAccount();

		applyAccount.applyforAccount();

	}

	@Test(priority=3)
	void fundTransferToAnotherAccount() {

		FundTransfer transfer = new FundTransfer();

		transfer.transferFund();
	}

	@Test(priority=4)
	void applyForALoan() throws Exception {

		ApplyLoan applyLoan = new ApplyLoan();

		applyLoan.applyForLoan();

		applyLoan.retriverLoanDetails();

	}

}
