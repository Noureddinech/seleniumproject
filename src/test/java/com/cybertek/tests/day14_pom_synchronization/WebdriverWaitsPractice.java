package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.pages.DynamicLoadPage;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebdriverWaitsPractice {
    /*
    TC#40 : Dynamically Loaded Page Elements 7
1. Go to http://practice.cybertekschool.com/dynamic_loading/7
2. Wait until title is “Dynamic title”
3. Assert : Message “Done” is displayed.
4. Assert : Image is displayed.
Note: Follow POM
     */
    @Test
    public void wait_time_practice(){
        //1. Go to http://practice.cybertekschool.com/dynamic_loading/7
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");
        //2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        //3. Assert : Message “Done” is displayed.
        DynamicLoadPage dynamicLoadPage = new DynamicLoadPage();
        Assert.assertTrue(dynamicLoadPage.doneMessage.isDisplayed());
        //4. Assert : Image is displayed.
        Assert.assertTrue(dynamicLoadPage.SpongeBobImage.isDisplayed());
        Driver.closeDriver();



    }
}
