package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class BillingPage extends Utility {
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameLink;
    @CacheLookup
    @FindBy(id="BillingNewAddress_LastName")
    WebElement lastNameLink;
    @CacheLookup
    @FindBy(id="BillingNewAddress_Email")
    WebElement emailLink;
    @CacheLookup
   @FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
   WebElement countryLink;
    @CacheLookup
   @FindBy(id = "BillingNewAddress_City")
    WebElement cityLink;
    @CacheLookup
   @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressLink;
    @CacheLookup
   @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postCodeLink;
    @CacheLookup
    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement phoneNumberLink;
    @CacheLookup
   @FindBy(xpath ="//button[@onclick='Billing.save()']")
    WebElement continueLink;
    @CacheLookup
    @FindBy(id="shippingoption_1")
    WebElement shippingLink;
    @CacheLookup
    @FindBy(id="shippingoption_2")
    WebElement shippingLink2;
    @CacheLookup
    @FindBy(id="paymentmethod_1")
    WebElement creditCardLink;
    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentMethodLink;
    @CacheLookup
    @FindBy(xpath="//select[@id='CreditCardType']")
    WebElement cardLink;
    @CacheLookup
    @FindBy(id="CardholderName")
    WebElement cardHolderNameLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement cardMonthLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear")
   WebElement cardYearLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode")
     WebElement cardCVVLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']" )
            WebElement creditCardTextLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
            WebElement shippingMethodText;
    @CacheLookup
            @FindBy(xpath = "//span[@class='value-summary']//strong[starts-with(text(),'$')]")
            WebElement totalText;
    @CacheLookup
            @FindBy(xpath = "//button[normalize-space()='Confirm']")
            WebElement confirmButton;
    @CacheLookup
            @FindBy(xpath = "//div[@class='page-title']//h1[text()='Thank you']")
            WebElement headText;
    @CacheLookup
            @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
            WebElement successText;
    @CacheLookup
            @FindBy(xpath = "//button[normalize-space()='Continue']")
            WebElement continueButton;
    @CacheLookup
            @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
            WebElement nextStep;
    @CacheLookup
            @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
            WebElement paymentNextStep;
    @CacheLookup
            @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
            WebElement paymentInfoNextLink;
    public void enterFirstname(String name){
        sendTextToElement(firstNameLink,name);
    }
    public void enterLastname(String name){
        sendTextToElement(lastNameLink,name);
    }
    public void enterEmail(String email){
        sendTextToElement(emailLink,email);
    }
    public void selectCountry(String country){
        selectByVisibleTextFromDropDown(countryLink,country);
    }
    public void enterCity(String city){
        sendTextToElement(cityLink,city);
    }
    public void enterAddress(String address){
        sendTextToElement(addressLink,address);
    }
    public void enterPostcode(String postcode){
        sendTextToElement(postCodeLink,postcode);
    }
    public void enterPhoneNumber(String number){
        sendTextToElement(phoneNumberLink,number);
    }
    public void clickContinue(){
        clickOnElement(continueLink);
    }
    public void selectShipping(){
        clickOnElement(shippingLink);
    }
    public void clickCreditCard(){
        clickOnElement(creditCardLink);
    }
    public void selectPaymentMethod(){
        clickOnElement(paymentMethodLink);
    }
    public void selectCard(int index){
        selectByIndexFromDropDown(cardLink,index);
    }
    public void enterCardHolderName(String name){
        sendTextToElement(cardHolderNameLink,name);
    }
    public void enterCardNumber(String number){
        sendTextToElement(cardNumberLink,number);
    }
    public void selectExpiryMonth(int month){
        selectByIndexFromDropDown(cardMonthLink,month);
    }
    public void selectExpiryYear(int year){
        selectByIndexFromDropDown(cardYearLink,year);
    }
    public void enterCVV(String cvv){
        sendTextToElement(cardCVVLink,cvv);
    }
    public String getPaymentText(){
        return getTextFromElement(creditCardTextLink);
    }
    public String getShippingText(){
        return getTextFromElement(shippingMethodText);
    }
    public String getPriceText(){
        return getTextFromElement(totalText);
    }
    public void clickConfirm(){
        clickOnElement(confirmButton);
    }
    public String getHeadText(){
        return getTextFromElement(headText);
    }
    public String getSuccessText(){
        return getTextFromElement(successText);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnContinue(){
        clickOnElement(nextStep);
    }
    public void clickPaymentContinue(){
        clickOnElement(paymentNextStep);
    }
    public void clickOnPaymentContinue(){
        clickOnElement(paymentInfoNextLink);
    }
    public void selectShipping2(){
        clickOnElement(shippingLink2);
    }

}

