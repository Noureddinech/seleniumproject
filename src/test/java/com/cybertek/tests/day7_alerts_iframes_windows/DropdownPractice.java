package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {

        WebDriver driver;

    @BeforeClass
    public void setUpClass(){
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void tc1_simple_dropdown_test(){
        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualTextOfCurrentOption = currentlySelectedOption.getText();
        String expectedText = "Please select an option";

        Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));


        //Doing everything in one line: get currently selected option, get the text and compare against expected
        //Assert.assertEquals(simpleDropdown.getFirstSelectedOption().getText(), "Please select an option");

        //4. Verify “State selection” default selected value is correct
        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        WebElement currentSelection = stateSelection.getFirstSelectedOption();
        String selectedText = currentSelection.getText();
        String expectedSelected = "Select a State" ;
        //Expected: “Select a State”
        Assert.assertTrue(selectedText.equals(expectedSelected));
    }
    @Test
    public void tc2_simple_test(){
        //3. Select Illinois
        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateSelection.selectByVisibleText("Illinois");
        //4. Select Virginia
        stateSelection.selectByVisibleText("Virginia");
        //5. Select California
        stateSelection.selectByVisibleText("California");
        // verify final selected option is California
        String expectedOptionText = "California";
        String actualOptionText = stateSelection.getFirstSelectedOption().getText();
        Assert.assertTrue(expectedOptionText.equals(actualOptionText));
    }
    @AfterClass
    public void teardownClass(){
        driver.close();
    }
}
