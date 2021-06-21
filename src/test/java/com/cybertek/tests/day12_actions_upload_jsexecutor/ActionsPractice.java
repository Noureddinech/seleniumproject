package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractice {
    // //TC #15: Hover Test
    //        //1. Go to http://practice.cybertekschool.com/hovers
    //        //2. Hover over to first image
    //        //3. Assert:
    //        //a. “name: user1” is displayed 4. Hover over to second image
    //        //5. Assert:
    //        //a. “name: user2” is displayed 6. Hover over to third image
    //        //7. Confirm:
    //        //a. “name: user3” is displayed
    @Test
    public void tc15_actions_hover(){
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        WebElement firstImage = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement secondImage = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement thirdImage = Driver.getDriver().findElement(By.xpath("(//img)[3]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(firstImage).perform();
        WebElement expectedText1 = Driver.getDriver().findElement(By.xpath("(//h5)[1]"));
        WebElement expectedText2 = Driver.getDriver().findElement(By.xpath("(//h5)[2]"));
        WebElement expectedText3 = Driver.getDriver().findElement(By.xpath("(//h5)[3]"));
        Assert.assertTrue(expectedText1.isDisplayed());

        actions.moveToElement(secondImage).perform();
        Assert.assertTrue(expectedText2.isDisplayed());

        actions.moveToElement(thirdImage).perform();
        Assert.assertTrue(expectedText3.isDisplayed());





    }

    @Test
    public void scrolling_test(){
        //go to practice http://practice.cybertekschool.com/
        Driver.getDriver().get("http://practice.cybertekschool.com/");

        // Scroll down to "Powered By cybertek school
        Actions actions = new Actions(Driver.getDriver());

        // locate "Powered By Cybertek School"
        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));

        //Scroll using actions object
        actions.moveToElement(cybertekSchoolLink).perform();

        //Scrolling up using keys.Page_UP button
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

    }
}
