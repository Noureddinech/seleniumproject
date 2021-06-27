package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadPage {
    public DynamicLoadPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//strong")
    public WebElement doneMessage;
    @FindBy(xpath = "//img[@class='rounded mx-auto d-block']")
    public WebElement SpongeBobImage;
}
