package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TableUtils {

   public static void verifyOrder(WebDriver driver , String name){
       List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));
       for(WebElement each : names ){
           if(each.getText().equals(name)){
               Assert.assertTrue(true);
           }
       }
}
}
