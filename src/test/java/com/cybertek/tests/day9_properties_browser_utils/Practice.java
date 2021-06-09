package com.cybertek.tests.day9_properties_browser_utils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Practice {
    DriverLogin driver;
   @BeforeMethod
    public void setDriver(){
       driver = new DriverLogin();
       driver.url = "https://www.facebook.com/";
       driver.setDriver(10);

   }
   @Test
    public void loginTest() throws IOException {
       Properties properties = new Properties();
       FileInputStream file = new FileInputStream("configuration.properties");
       properties.load(file);
       driver.usernameLocator = "email";
       driver.passwordLocator = "pass";
       driver.loginButtonLocator = "//button[@name='login']";
       driver.passwordText = properties.getProperty("password");
       driver.usernameText = properties.getProperty("username");
       driver.logInTo();

   }

}
