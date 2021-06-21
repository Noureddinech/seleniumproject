package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JsExecutorPractice {
    @Test
    public void scroll_using_jsexecutor_test(){
        //Get the page: http://practice.cybertekschool.com/infinite_scroll

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
        BrowserUtils.sleep(3);
        //((JavascriptExecutor) Driver.getDriver()).executeScript("")

        // Down casting our driver type to JavascriptExecutor so we can reach methods in this interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //using js we reach executeScript method so we are allowed to pass JavaScript functions.
        //this method is capable of accepting JavaScript functions and apply that into our Java+Selenium code
        js.executeScript("window.scrollBy(0, 750)");

    }
}
