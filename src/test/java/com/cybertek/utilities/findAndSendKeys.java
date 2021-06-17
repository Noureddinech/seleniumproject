package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findAndSendKeys {
    public static void findElementAndSendKeys(WebDriver driver,String locator,String keys){
        WebElement element = driver.findElement(By.xpath(locator));
        element.sendKeys(keys);
    }

}
