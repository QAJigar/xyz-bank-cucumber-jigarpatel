package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class);


    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement selectCust;

    public void selectCustomer(String selctNam){
        selectByVisibleTextFromDropDown(selectCust,selctNam);
        log.info("select customer from list" + selectCust);
    }
}
