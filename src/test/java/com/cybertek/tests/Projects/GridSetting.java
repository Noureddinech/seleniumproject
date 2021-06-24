package com.cybertek.tests.Projects;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Vytrack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GridSetting {
    @Test  (priority = 0)
    public void check_grid_setting_display(){
        Vytrack.logIn("User174","UserUser123");
        Vytrack.hoverOver("Fleet","//span[@class='title title-level-1'])[1]");
        WebElement vehiclesOption = Driver.getDriver().findElement(By.linkText("Vehicles"));
        vehiclesOption.click();
        BrowserUtils.sleep(2);
        WebElement gridSetting = Driver.getDriver().findElement(By.xpath("//i[@class='fa-cog hide-text']"));
        Assert.assertTrue(gridSetting.isDisplayed());
        gridSetting.click();
        Driver.closeDriver();

    }
    @Test (priority = 1)
    public void check_grid_dropdown_display(){
        Vytrack.logIn("User174","UserUser123");
        Vytrack.hoverOver("Fleet","//span[@class='title title-level-1'])[1]");
        BrowserUtils.sleep(2);
        WebElement vehiclesOption = Driver.getDriver().
                findElement(By.linkText("Vehicles"));
        vehiclesOption.click();
        BrowserUtils.sleep(2);
        WebElement exportGridSetting = Driver.getDriver().
                findElement(By.xpath("//div[@class='extra-actions-panel']"));
        exportGridSetting.click();
        WebElement csvOption= Driver.getDriver().
                findElement(By.xpath("//a[@title='CSV']"));
        Assert.assertTrue(csvOption.isDisplayed());
        Driver.closeDriver();
    }
}
