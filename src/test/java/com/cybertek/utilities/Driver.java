package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /*
    Creating private constructor so this class ibject
    is not reachable from outside
     */
    private Driver(){}
    /*
    Making our driver instance driver private so that it is not reachable
    from outside of the class.
    We make it static because we want it to run before everything else, and
    we will use it in a static method.
     */
    private static WebDriver driver;
    /*
    Creating reusable utility method that will return same driver instance everytime we call it
     */
    public static WebDriver getDriver(){
        if(driver==null){
            /*
            We read our browser type from configuration.properties file
            using .getProperty method we creating in ConfigurationReader class
             */
            String browserType = ConfigurationReader.getProperty("browser");
            switch(browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
                case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "internet explorer":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        return driver;
    }
}
