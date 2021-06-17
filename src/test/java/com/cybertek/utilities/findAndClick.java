package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findAndClick {
    public static void findElementAndClick(WebDriver driver, String locator){
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
    }
}
