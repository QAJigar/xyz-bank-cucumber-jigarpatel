package com.bank.steps;

import com.bank.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankTestStep {
    @Given("I am on HomePage")
    public void iAmOnHomePage() {
    }

    @When("click On Bank Manager Login Tab")
    public void clickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginTab();
    }

    @And("click On Add Customer Tab")
    public void clickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("click On Add Customer Button")
    public void clickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomer();
    }

    @And("popup display")
    public void popupDisplay() {
        new AddCustomerPage().switchToAlert();
    }

    @Then("verify message {string}")
    public void verifyMessage(String verifyMsg) {
        new AddCustomerPage().verifyMessageCustomerAddedSuccessfully(verifyMsg);
    }

    @And("click on ok button on popup")
    public void clickOnOkButtonOnPopup() {
        new AddCustomerPage().clickOnPopUpOkButton();
    }

    @And("click On Open Account Tab")
    public void clickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccountTab();
    }

    @And("Select currency {string}")
    public void selectCurrency(String curr) {
        new OpenAccountPage().selectCurrency(curr);

    }

    @And("click on process button")
    public void clickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @And("popup displayed")
    public void popupDisplayed() {
        new OpenAccountPage().clickOnPopUp();
    }

    @When("click on Customer Login Tab")
    public void clickOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLoginTab();
    }

    @And("search customer that you created")
    public void searchCustomerThatYouCreated() {
        new OpenAccountPage().selectCustomerFromList();
    }

    @And("click on Login Button")
    public void clickOnLoginButton() {
        new CustomerLoginPage().clickLoginBtn();
    }

    @Then("verify Logout Tab displayed")
    public void verifyLogoutTabDisplayed() {
        new AccountPage().getLogoutText();
    }

    @And("click on Logout")
    public void clickOnLogout() {
        new AccountPage().clickLogoutTab();
    }

    @Then("verify {string} text displayed")
    public void verifyTextDisplayed(String expectedMsg) {
        new AccountPage().getSuccessMessage();
    }

    @And("click on Deposit Tab")
    public void clickOnDepositTab() {
        new AccountPage().clickDepositTab();
    }

    @And("Enter amount {string}")
    public void enterAmount(String amt) {
        new AccountPage().enterAmount(amt);
    }

    @And("click on Deposit Button")
    public void clickOnDepositButton() {
        new AccountPage().clickDepositBtn();
    }

    @And("click on Withdrawl Tab")
    public void clickOnWithdrawlTab() {
        new AccountPage().clickWithdrawalTab();
    }

    @And("click on Withdraw Button")
    public void clickOnWithdrawButton() {
        new AccountPage().clickWithdrawBtn();
    }

    @And("enter First Name {string}")
    public void enterFirstName(String fNam) {
        new AddCustomerPage().enterFirstName(fNam);

    }

    @And("enter Last Name {string}")
    public void enterLastName(String lNam) {
        new AddCustomerPage().enterLastName(lNam);
    }

    @And("enter Post Code {string}")
    public void enterPostCode(String pCod) {
        new AddCustomerPage().enterPostCode(pCod);
    }

    @And("Search customer that created in first test {string}")
    public void searchCustomerThatCreatedInFirstTest(String selName) {
       new OpenAccountPage().selectCustomerFromList();
        new CustomersPage().selectCustomer(selName);

    }
}


