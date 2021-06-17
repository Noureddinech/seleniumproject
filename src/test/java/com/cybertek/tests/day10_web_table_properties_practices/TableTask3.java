package com.cybertek.tests.day10_web_table_properties_practices;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.TableUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTask3 extends TestBase {

    @Test
    public void task3_return_tims_due_amount(){
        driver.get("http://practice.cybertekschool.com/tables#edit");
        String dueDate = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]")).getText();
        String expectedAmount = "$50.00";
        Assert.assertEquals(dueDate,expectedAmount);

    }
    @Test
    public void verify_method(){
        TableUtils.verifyOrder(driver,"Jason");
    }


}
