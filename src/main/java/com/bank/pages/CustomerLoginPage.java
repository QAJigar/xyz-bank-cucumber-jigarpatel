package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class);

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginBtn;

    public void clickLoginBtn() {
        clickOnElement(loginBtn);
      //  Thread.sleep(1000);
        log.info("Click on Login button" + loginBtn.toString());
    }

}
