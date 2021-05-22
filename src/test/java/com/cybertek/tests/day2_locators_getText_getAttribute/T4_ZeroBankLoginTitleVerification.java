package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_ZeroBankLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        Thread.sleep(2000);
        driver.findElement(By.id("user_login")).sendKeys("username");
        Thread.sleep(2000);
        driver.findElement(By.id(("user_password"))).
                sendKeys("password"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("account_activity_tab")).click();
        Thread.sleep(2000);
        String expectedTitle = "Zero - Account Activity";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title test verification PASSED");
        }else{
            System.out.println("Title test verification FAILED");
        }

        driver.findElement(By.id("transfer_funds_tab")).click();
        Thread.sleep(2000);
        String expectedTitle1 = "Zero - Transfer Funds";
        String actualTitle1 = driver.getTitle();
        if(expectedTitle1.equals(actualTitle1)){
            System.out.println("Title test verification PASSED");
        }else{
            System.out.println("Title test verification FAILED");
        }

        driver.findElement(By.id("pay_bills_tab")).click();
        Thread.sleep(2000);
        String expectedTitle2 = "Zero - Pay Bills";
        String actualTitle2 = driver.getTitle();
        if(expectedTitle2.equals(actualTitle2)){
            System.out.println("Title test verification PASSED");
        }else{
            System.out.println("Title test verification FAILED");
        }

        driver.findElement(By.id("money_map_tab")).click();
        Thread.sleep(2000);
        String expectedTitle3 = "Zero - My Money Map";
        String actualTitle3 = driver.getTitle();
        if(expectedTitle3.equals(actualTitle3)){
            System.out.println("Title test verification PASSED");
        }else{
            System.out.println("Title test verification FAILED");
        }

        driver.findElement(By.id("online_statements_tab")).click();
        Thread.sleep(2000);
        String expectedTitle4 = "Zero - Online Statements";
        String actualTitle4 = driver.getTitle();
        if(expectedTitle4.equals(actualTitle4)){
            System.out.println("Title test verification PASSED");
        }else{
            System.out.println("Title test verification FAILED");
        }
        driver.close();
        


    }
}
