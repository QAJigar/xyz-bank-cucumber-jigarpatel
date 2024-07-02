package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class);

    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='addCust()']")
    WebElement addCust;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='openAccount()']")
    WebElement openAcc;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='showCust()']")
    WebElement showCust;

    public void clickOnAddCustomerTab(){
        clickOnElement(addCust);
        log.info("click on add customer tab" + addCust);
    }

    public void clickOnOpenAccountTab(){
        clickOnElement(openAcc);
        log.info("click on open account tab" + openAcc);
    }

    public void clickOnCustomerTab(){
        clickOnElement(showCust);
        log.info("click on customer tab" + showCust);
    }

}
