package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractice {

    @Test
    public void p2_double_click_test(){
        // 1.Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        // 2.Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");
        // 3.Double click on the text “Double-click me to change my text color.”
        WebElement text = Driver.getDriver().findElement(By.id("demo"));
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(text).perform();
        // 4.Assert: Text’s “style” attribute value contains “red
        String expectedInStyle = "red";
        String actual = text.getAttribute("style");

        Assert.assertTrue(actual.contains(expectedInStyle));
        Driver.closeDriver();

    }
    /*
    TC #16: Hover Test1.Go to https://demos.telerik.com/kendo-ui/dragdrop/index
    2.Drag and drop the small circle to bigger circle.
    3.Assert: -Text in big circle changedto: “You did great!”
     */
    @Test
    public void tp2_drag_and_drop_test(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement cookies = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();
        BrowserUtils.sleep(2);
        Actions actions = new Actions(Driver.getDriver());
        WebElement draggable = Driver.getDriver().findElement(By.id("draggable"));
        BrowserUtils.sleep(3);
        WebElement target = Driver.getDriver().findElement(By.id("droptarget"));
       // actions.clickAndHold(draggable).moveToElement(target).release().perform();
        actions.dragAndDrop(draggable,target).perform();
        String expectedText = "You did great!";
        Assert.assertEquals(expectedText,target.getText());
        Driver.closeDriver();
    }
    @Test
    public void tp3_context_test(){
        /*
        TC #17: Context Click –HOMEWORK1.Go to https://the-internet.herokuapp.com/context_menu
        2.Right click to the box.
        3.Alert will open.
        4.Accept alert No assertion needed for this practice.
         */
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        WebElement box = Driver.getDriver().findElement(By.id("hot-spot"));
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(box).perform();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        Driver.closeDriver();
        //hot-spot

    }
}
