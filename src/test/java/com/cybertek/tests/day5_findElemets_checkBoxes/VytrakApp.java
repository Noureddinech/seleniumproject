package com.cybertek.tests.day5_findElemets_checkBoxes;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrakApp {
    public static void main(String[] args) throws InterruptedException {
        //Go to Vytrack Login page
        //enter Sales Manager valid username
        //enter Sales Manager valid password
        //click login button
        //We should be logged into Vytrack Store Manager’s Account
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        Thread.sleep(3000);
        WebElement loginBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));

        loginBox.sendKeys("user174");
        Thread.sleep(3000);
        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        Thread.sleep(3000);
        passwordBox.sendKeys("UserUser123" + Keys.ENTER);
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED !!!");
        }
        driver.findElements(By.xpath("//i[@class='fa-asterisk menu-icon']"));
        driver.findElements(By.xpath("(//a[@href=entity/Extend_Entity_Carreservation"));



    }
}
