# uiPath-Bank

This project contains autation testScripts for the Login, ApplyForNewAccount, FundTransfer, ApplyForALoan and LoanStatusRetrival pages of a demo uiPath Bank webSite. The tests are implemented using Page Object Model(POM) design pattern, Selenium WebDriver, Maven and Java.

**Getting Started**

**To get Started with this project, follow the instruction below**

**Prerequisites**

Java JDK installed
Maven Build tool installed
Edge browser installed 

Clone this repository to your local machine using the following command: https://github.com/thilagavathiamulraj/uiPath-Bank.git


**Configuration**

1. Open the project in your preferred IDE
2. Register dummy user using your original email ID in https://uibank.uipath.com/welcome
3. Check for activation email
4. Update the necessary testData in Login.java, ApplyAccount.java, FundTransfer.java and ApplyLoan.java files
   
**Test Structure**

The tests are organized using the simple Page Object Model (POM) design pattern, which separates the test logic from the page-specific operations.

The test classes are located in the src/test/java/uiBank directory. The test classes are as follows:

1. DriverFactory.Java - contains static webDriver variable and getdriver methods declaration
2. Login.Java - contains the testscript for instansiating the driver, launching the browser using URL - https://uibank.uipath.com/welcome and login to the URL
3. ApplyAccount.java - contains testscrpts for creating new account and getting new account ID
4. Fundtransfer.java - contains the testscripts for transfering the amount from created account to another account
5. ApplyAccount.Java - contais the testScripts for applying for loan and retriving the loan status and printing the Loan details in the console.
6. Runner.java - contains the testscripts to execute all the ablove specified .java files and methods of those classes

**Test Reports**

After running the Runner.java file, a test report will be generated in the test-output  directory. The report provides detailed information about the test execution, including pass/fail status, test duration,and any error messages.
   


