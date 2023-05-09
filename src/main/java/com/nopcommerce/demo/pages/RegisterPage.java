package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement maleRadio;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordLink;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueLink;
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    public void selectGender() {
        clickOnElement(maleRadio);
    }

    public void enterFirstname(String name) {
        sendTextToElement(firstNameLink, name);
    }

    public void enterLastname(String name) {
        sendTextToElement(lastNameLink, name);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailLink, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordLink, password);
    }

    public void enterConfirmPassword(String password) {
        sendTextToElement(confirmPasswordLink, password);
    }

    public void clickOnRegister() {
        clickOnElement(registerButton);
    }

    public String getRegisterMessage() {
        return getTextFromElement(registerMessage);
    }

    public void clickOnContinue() {
        clickOnElement(continueLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }
}

