package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customListeners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class ElectronicPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Electronics")
    public
    WebElement electronicLink;
    @CacheLookup
    @FindBy(xpath = "//a[@title='List']")
    WebElement listViewLink;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement phoneLink;
    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement headText;
    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement priceText;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantityLink;
    @CacheLookup
    @FindBy(xpath = "(//input[@value])[2]")
    WebElement getQuantity;
    @CacheLookup
    @FindBy(css = "#add-to-cart-button-20")
    WebElement addToCartNokiaLumia;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement verifyShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateCart ;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement getWelcomeText;

    public String verifyWelcomeText() {
        CustomListeners.test.log(Status.PASS, "Get text Welcome");
        Reporter.log("Get text Welcome" + getWelcomeText.toString());
        return getTextFromElement(getWelcomeText);}



    public void setAddToCartNokiaLumiaPhone(){
        clickOnElement(addToCartNokiaLumia);
    }
    public void selectListView() {
        clickOnElement(listViewLink);
    }
    public void selectPhone() {
        clickOnElement(phoneLink);
    }
    public String getHeading() {
        return getTextFromElement(headText);
    }
    public String  getShoppingCartText(){
        return getTextFromElement(verifyShoppingCart);

    }
    public String getPrice() {
        return getTextFromElement(priceText);
    }
    public void changeQuantity() {
        clickOnElement(quantityLink);
        driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
        sendTextToElement(quantityLink,"2");
       // clickOnElement(updateCart);
        CustomListeners.test.log(Status.PASS,"change the quantity");
        Reporter.log("change the quantity" + quantityLink.toString());

        }

       /* findElement(quantityLink).sendKeys

        driver.findElement(By.id("product_enteredQuantity_20")).sendKeys(Keys.BACK_SPACE);
        sendTextToElement(quantityLink, quantity);*/

    public String getQuantity() {
        return driver.findElement(By.xpath("//input[@class='qty-input']")).getAttribute("value");
    }
}
