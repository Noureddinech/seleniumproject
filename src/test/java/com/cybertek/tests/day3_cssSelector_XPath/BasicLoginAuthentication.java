package com.cybertek.tests.day3_cssSelector_XPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLoginAuthentication {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 2- Go to:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // 3- Verify title equals:
        //Expected: Web Orders Login
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Login page title verification PASSED!");
        }else {
            System.out.println("Login page title verification FAILED!!!");
        }
        // 4- Enter username: Tester
        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");

        // 5- Enter password: test
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");
        inputPassword.sendKeys("test" + Keys.ENTER);

        // 6- Click “Sign In” button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
        //loginButton.click();

        // 7- Verify title equals:
        //Expected: Web Orders
        String expectedHomePageTitle = "Web Orders";
        String actualHomePageTitle = driver.getTitle();
        if (actualHomePageTitle.equals(expectedHomePageTitle)){
            System.out.println("Home page title verification PASSED!");
        }else{
            System.out.println("Home page title verification FAILED!!!");
        }




    }
}
