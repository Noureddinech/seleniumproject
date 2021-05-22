package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_xpath_MultipleButtons {
    public static void main(String[] args) throws InterruptedException {

        //1. Open Chrome browser
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //3. Click on Button 1
        Thread.sleep(2000);
        WebElement button1=  driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();
        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        String expectedText = "Clicked on button one!";
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        String actualText = resultText.getText();
        if(actualText.equals(expectedText)){
            System.out.println("text verification PASSED!");
        }else{
            System.out.println("text verification FAILED !!!");

        }



    }
}
