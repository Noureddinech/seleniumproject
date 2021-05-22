package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CountLinks {
    public static  void  getCount(String link) {
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(link);
        List<WebElement> ListOfLinks = driver.findElements(By.xpath("//html//body//a"));
        int hasTextCount = 0;
        int missingCount = 0;
        for (WebElement each : ListOfLinks) {
            System.out.println(each.getText());
            if (each.getText().isEmpty()) {
                missingCount++;
            } else {
                hasTextCount++;
                //no
            }

        }
        System.out.println("List of links  = " + ListOfLinks.size());
        System.out.println("Missing text count = " + missingCount);
        System.out.println("has text count = " + hasTextCount);

    }
}
