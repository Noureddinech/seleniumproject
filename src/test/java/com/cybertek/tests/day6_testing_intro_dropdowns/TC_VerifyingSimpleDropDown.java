package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC_VerifyingSimpleDropDown {
    public static void main(String[] args) {
        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        // 1.Open Chrome browser
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        // 3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option"
        WebElement firstBox = driver.findElement(By.xpath("//option[@selected='selected']"));
        String expectedText = "Please select an option";
        System.out.println(expectedText);
        System.out.println(firstBox);
        if(expectedText.equals(firstBox.getText())){
            System.out.println("Test verification PASSED!");
        }else{
            System.out.println("Test verification FAILED!!!");
        }
        // 4.Verify“State selection” default selected value is correctExpected: “Select a State
        WebElement selection = driver.findElement(By.xpath("//select[@id='state']"));
        String expectedSelect = "State selection";
        System.out.println(expectedSelect);

        if(expectedSelect.equals(selection.getText())){
            System.out.println("Test verification PASSED!");
        }else{
            System.out.println("Test verification FAILED!!!");
        }


   driver.close();
    }
}
