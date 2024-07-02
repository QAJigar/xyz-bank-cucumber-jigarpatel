package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class);


    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement searchCust;

    @CacheLookup
    @FindBy(id = "currency")
    WebElement selectCurr;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'process')]")
    WebElement process;

    public void selectCustomerFromList(){
        List<WebElement> options = new Select(searchCust).getOptions();
        for (WebElement opt :options){
            System.out.println(opt.getText());
        }

        log.info("select customer form list" + searchCust);
    }

    public void selectCurrency(String curr){
        selectByVisibleTextFromDropDown(selectCurr,curr);
        log.info("select currency from list" + selectCurr);
    }

    public void clickOnProcessButton(){
        clickOnElement(process);
        log.info("click on process button" + process);
    }

    public void clickOnPopUp(){
        acceptAlert();
    }

}
