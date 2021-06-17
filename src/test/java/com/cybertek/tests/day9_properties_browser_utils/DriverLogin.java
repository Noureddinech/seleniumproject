package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class DriverLogin {
    public String url;
        public String usernameLocator;
    public String passwordLocator;
    public String usernameText;
    public String passwordText;
    public String loginButtonLocator;
    public  WebDriver driver;

        public void setDriver(int time ){
            driver = WebdriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
            driver.get(url);

        }


    public void logInTo(){
        WebElement username = driver.findElement(By.id(usernameLocator));
        username.sendKeys(usernameText);
        WebElement password = driver.findElement(By.id(passwordLocator));
        password.sendKeys(passwordText);
        WebElement logIn = driver.findElement(By.xpath(loginButtonLocator));
        logIn.click();
    }

}
