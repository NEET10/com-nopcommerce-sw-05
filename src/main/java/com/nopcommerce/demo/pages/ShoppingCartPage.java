package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class ShoppingCartPage extends Utility {
    @CacheLookup
            @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantityLink;
    @CacheLookup
            @FindBy(id = "updatecart")
            WebElement updateCartLink;
    @CacheLookup
            @FindBy(xpath = "//span[@class='product-subtotal']")
            WebElement priceLink;
    @CacheLookup
            @FindBy(id = "termsofservice")
            WebElement termsAndConditionLink;
    @CacheLookup
            @FindBy(id = "checkout")
            WebElement checkoutLink;
    @CacheLookup
            @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']" )
            WebElement checkoutGuestLink;
    @CacheLookup
            @FindBy(xpath = "//a[starts-with(text(),'Reg')]")
            WebElement registerLink;

    public void changeQuantity(String quantity){

           /* Reporter.log("changeQuantity" +quantity+ changeQuantity.toString());
            sendTextToElement(changeQuantity,quantity);*/

        driver.findElement(By.xpath("//input[@class='qty-input']")).sendKeys(Keys.BACK_SPACE);
        sendTextToElement(quantityLink,quantity);
    }
    public void updateCart(){
        clickOnElement(updateCartLink);
    }
    public String getPrice(){
        return getTextFromElement(priceLink);
    }
    public void termsAndCondition(){
        clickOnElement(termsAndConditionLink);
    }
    public void goCheckout(){
        clickOnElement(checkoutLink);
    }
    public void clickCheckoutAsGuest(){
        clickOnElement(checkoutGuestLink);
    }
    public void clickOnRegister(){
        clickOnElement(registerLink);
    }

}
