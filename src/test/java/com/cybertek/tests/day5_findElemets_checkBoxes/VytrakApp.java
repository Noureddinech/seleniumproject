package com.cybertek.tests.day5_findElemets_checkBoxes;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrakApp {
    public static void main(String[] args) {
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        WebElement loginBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        loginBox.sendKeys("");

    }
}
