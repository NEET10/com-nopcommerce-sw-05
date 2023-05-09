package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class TopMenuPage extends Utility {
    @CacheLookup
            @FindBy(xpath = "//h1")
            WebElement headingText;

    public void selectMenu(String menu){
        List<WebElement> list=driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//a"));
        for(WebElement e:list){
            if(e.getText().equalsIgnoreCase(menu)){
                e.click();
                break;
            }
        }
    }
    public String getHeadingText(){
        return getTextFromElement(headingText);
    }
}
