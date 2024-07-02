package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class);


    @CacheLookup
    @FindBy(xpath = "//input[@ng-model='fName']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@ng-model='lName']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@ng-model='postCd']")
    WebElement postCode;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitBtn;

    public void enterFirstName(String fName){
        sendTextToElement(firstName,fName);
    }

    public void enterLastName(String lName){
        sendTextToElement(lastName,lName);
    }

    public void enterPostCode(String pCod){
        sendTextToElement(postCode,pCod);
    }

    public void clickOnAddCustomer(){
        clickOnElement(submitBtn);
    }


    public void moveToPopUp(){
        switchToAlert();
    }

    public void clickOnPopUpOkButton(){
        acceptAlert();
    }

    public void verifyMessageCustomerAddedSuccessfully(String expected){
        Assert.assertTrue(getTextFromAlert().contains(expected),"Customer added text not match");
    }
}

