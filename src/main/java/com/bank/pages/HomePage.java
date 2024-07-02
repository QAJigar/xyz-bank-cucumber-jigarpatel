package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class);


    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='manager()']")
    WebElement managerBtn;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='customer()']")
    WebElement customerBtn;

    public void clickOnBankManagerLoginTab(){
        clickOnElement(managerBtn);
        log.info("click on bank manager login tab" + managerBtn);
    }

    public void clickOnCustomerLoginTab(){
        clickOnElement(customerBtn);
        log.info("click on customer login tab" + customerBtn);
    }


}
