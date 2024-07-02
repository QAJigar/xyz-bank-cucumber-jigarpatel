package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class);

    @CacheLookup @FindBy(xpath = "//button[@ng-show='logout']")
    WebElement logoutTab;

    @CacheLookup @FindBy(xpath = "//button[@ng-click='deposit()']")
    WebElement depositTab;

    @CacheLookup @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    WebElement withdrawalTab;

    @CacheLookup @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amount;

    @CacheLookup @FindBy(xpath = "//button[contains(text(),'Deposit')][@type='submit']")
    WebElement depositBtn;

    @CacheLookup @FindBy(xpath = "//button[contains(text(),'Withdraw')][@type='submit']")
    WebElement withdrawBtn;

    @CacheLookup @FindBy(xpath = "//span[@ng-show='message']")
    WebElement depositSuccessMsgText;

    public String getLogoutText() {
        log.info("Get Logout text " + logoutTab.getText());
        return getTextFromElement(logoutTab);
    }

    public void clickLogoutTab() {
        clickOnElement(logoutTab);
        log.info("Click on Logout tab" + logoutTab.toString());
    }

    public void clickDepositTab() {
        clickOnElement(depositTab);
        log.info("Click on deposit tab" + depositTab.toString());
    }

    public void clickWithdrawalTab() {
        clickOnElement(withdrawalTab);
        log.info("Click on withdrawal tab" + withdrawalTab.toString());
    }

    public void enterAmount(String amountValue) {
        sendTextToElement(amount, amountValue);
        log.info("Enter amount " + amount + amount.toString());
    }

    public void clickDepositBtn() {
        clickOnElement(depositBtn);
        log.info("Click on deposit button" + depositBtn.toString());
    }

    public void clickWithdrawBtn() {
        clickOnElement(withdrawBtn);
        log.info("Click on withdraw button" + withdrawBtn.toString());
    }

    public String getSuccessMessage() {
        log.info("Get Success Message text " + depositSuccessMsgText.getText());
        return getTextFromElement(depositSuccessMsgText);
    }

}
