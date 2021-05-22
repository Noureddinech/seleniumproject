package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {
        // open Chrome drive
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //go to website
        driver.get("http:/practice.cybertekschool.com/forgot_password");
        // locate all the WebElements on the page using xpath and or css locator only
        //a  "home link"
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //b "header"
        WebElement header = driver.findElement(By.tagName("h2"));
        //c "E mail" text
        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));
        //d "E mail" input box
        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));
        //e "Retrieve password" button
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']"));
        //f "Powered by Cybertek School" text
        WebElement poweredByText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        //g "Verified all text "
        System.out.println(homeLink.isDisplayed());
        System.out.println(header.isDisplayed());
        System.out.println(header.isDisplayed());
        System.out.println(emailLabel.isDisplayed());
        System.out.println(inputEmail.isDisplayed());
        System.out.println(retrievePassword.isDisplayed());
        System.out.println(poweredByText.isDisplayed());



    }
}
