package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Vytrack {
    public static void logIn(String username, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        WebElement usernameBox = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        usernameBox.sendKeys(username);
        WebElement passwordBox = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
        passwordBox.sendKeys(password);
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        BrowserUtils.sleep(2);
    }
    public static void hoverOver(String element ,String locator){
        Actions action = new Actions(Driver.getDriver());
        WebElement fleet = Driver.getDriver().findElement(By.xpath(locator));
        action.moveToElement(fleet).perform();
    }
}
