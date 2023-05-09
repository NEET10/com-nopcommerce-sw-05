package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Computers")
    public
    WebElement computerLink;
    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement dropDownLink;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']")
    WebElement listLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorLink;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement RAMLink;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hddRadio;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osLink;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement checkboxLink;
    @CacheLookup
    @FindBy(id = "price-value-1")
    WebElement priceLink;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement successMessageLink;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeLink;
    @CacheLookup
            @FindBy(xpath = "//span[@class='cart-label']")
            WebElement shoppingCartLink;
     @CacheLookup
             @FindBy(xpath = "(//button[normalize-space()='Go to cart'])[1]")
             WebElement goToCartLink;


    public void mouseHover(By link) {
        mouseHoverToElement(link);
    }

    public void selectFromDropDown(String value) {
        selectByVisibleTextFromDropDown(dropDownLink, value);
    }

    public List getList() {

        List<WebElement> list = driver.findElements(By.xpath( "//h2[@class='product-title']"));
        List<String> orignalList = new ArrayList<>();
        for (WebElement e : list) {
            orignalList.add(e.getText());
        }
        return orignalList;
    }

    public void addToCart() {
        clickOnElement(addToCartButton);
    }

    public void selectProcessor(String value) {
        selectByValueFromDropDown(processorLink, value);
    }

    public void selectRAM(String value) {
        selectByVisibleTextFromDropDown(RAMLink, value);
    }

    public void selectHddRadio() {
        clickOnElement(hddRadio);
    }

    public void selectOs() {
        clickOnElement(osLink);
    }

    public void selectCheckBox() {
        clickOnElement(checkboxLink);
    }

    public String getPrice() {
        return getTextFromElement(priceLink);
    }

    public String getSuccessMessage() {
        return getTextFromElement(successMessageLink);
    }

    public void closeMessage() {
        clickOnElement(closeLink);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCartLink);
    }


    public void clickOnGoToCart() {
        clickOnElement(goToCartLink);
    }
}