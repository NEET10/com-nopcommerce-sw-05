package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Utility {
    @CacheLookup
            @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
            @FindBy(id = "Email")
            WebElement emailField;
    @CacheLookup
            @FindBy(name = "Password")
            WebElement passwordField;
    @CacheLookup
            @FindBy(xpath = "//button[contains(text(),'Log in')]")
   WebElement loginButton;
    @CacheLookup
            @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
            WebElement errorMessage;
    @CacheLookup
            @FindBy(xpath = "//a[contains(text(),'Log out')]")
            WebElement logOutLink;
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
    public void clickOnLogout(){
        clickOnElement(logOutLink);
    }
}
