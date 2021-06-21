package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilPractice {
    @Test
    public void simple_google_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        String searchValue = ConfigurationReader.getProperty("searchValue");
        searchBox.sendKeys(searchValue+ Keys.ENTER);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = searchValue;
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        Driver.closeDriver();
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.closeDriver();
    }
}
