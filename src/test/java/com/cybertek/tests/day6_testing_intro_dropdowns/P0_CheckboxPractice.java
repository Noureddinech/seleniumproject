package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P0_CheckboxPractice {
    public static void main(String[] args) {
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement firstBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement secondBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        System.out.println("Is the first box selected by default = "+ firstBox.isSelected());
        System.out.println("Is the second box selected by default = "+ secondBox.isSelected());

        firstBox.click();
        secondBox.click();

        System.out.println("Is the first box selected by default = "+ firstBox.isSelected());
        System.out.println("Is the second box selected by default = "+ secondBox.isSelected());


    }
}
