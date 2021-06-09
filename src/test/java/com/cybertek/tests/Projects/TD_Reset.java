package com.cybertek.tests.Projects;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TD_Reset {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");


    }
    @Test
    public void TD_ResetSetting()  {
        WebElement usernameBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        usernameBox.sendKeys("User174");
        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordBox.sendKeys("UserUser123");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        BrowserUtils.sleep(2);
        // Hover over Fleet
        Actions action = new Actions(driver);
        WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        action.moveToElement(fleet).perform();
        // click on vehicles option
        WebElement vehiclesOption = driver.findElement(By.linkText("Vehicles"));
        vehiclesOption.click();
        BrowserUtils.sleep(2);

        //click on grid setting
      //  WebElement gridSetting = driver.findElement(By.xpath("//i[@class='fa-cog hide-text']"));
     //   gridSetting.click();
     //   BrowserUtils.sleep(2);
       // check Id
      //  WebElement idCheck = driver.findElement(By.xpath("//input[@id='column-c111']"));
      //  Assert.assertFalse(idCheck.isSelected());
        // Is is selected now
       // idCheck.click();
       // Assert.assertTrue(idCheck.isSelected());

        // table

        List<WebElement> tableList = new ArrayList<>(driver.findElements
                (By.xpath("//table/tbody/tr/td")));



//       for(int i =0 ; i < tableList.size() ; i++){
//           WebElement carBox = driver.findElement(By.xpath("//tbody/tr["+(i+1)+"]"));
//         //  carBox.click();
//         //  BrowserUtils.sleep(2);
//         //  driver.navigate().back();
//
//
//
//       }

       for(int i = 0; i < tableList.size(); i++) {
           if ((tableList.get(i).getText()).equals("A")) {
               tableList.get(i).click();
           }
       }


        // close grid setting window
      //  WebElement close = driver.findElement(By.xpath("//span[@class='close']"));
     //   close.click();
        // reset setting
        WebElement resetButton = driver.findElement(By.xpath("//a[@title='Reset']"));
        resetButton.click();
         //  check if Id checked
       // gridSetting.click();
       // Assert.assertFalse(idCheck.isSelected());
      //  close.click();
    }
/**
    @Test
    public void Add_Event() throws InterruptedException {
        WebElement usernameBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        usernameBox.sendKeys("User174");
        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordBox.sendKeys("UserUser123");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        // Hover over Fleet
        Actions action = new Actions(driver);
        WebElement fleet = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span"));
        action.moveToElement(fleet).perform();

        // click on vehicles option
        WebElement vehiclesOption = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span"));
        vehiclesOption.click();
        // click on cars
        Thread.sleep(2000);

        WebElement cybertek123 = driver.findElement(By.xpath("(//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-LicensePlate'])[1]"));
        cybertek123.click();
        // add events

        WebElement addEvents = driver.findElement(By.xpath("//a[@data-id='94']"));
        addEvents.click();
        // add title

        WebElement titleBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        titleBox.sendKeys("BugKillers were here!!!");
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Event 1 created");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    }
    @AfterClass
    public void teardownClass(){
      // driver.close();
    }
*/
   /** @Test
    public void scenario (){
    WebElement usernameBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
    usernameBox.sendKeys("User174");
    WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
    passwordBox.sendKeys("UserUser123");
    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
    loginButton.click();
    BrowserUtils.sleep(2);
    // Hover over Fleet
    Actions action = new Actions(driver);
    WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
    action.moveToElement(fleet).perform();
    // click on vehicles option
    WebElement vehiclesOption = driver.findElement(By.linkText("Vehicles"));
    vehiclesOption.click();
    BrowserUtils.sleep(2);
    List<WebElement> carsList = new ArrayList<>(driver.findElements(By.xpath("//table/tbody/tr")));
    for(WebElement each : carsList){
        each.click();
        BrowserUtils.sleep(2);
        driver.navigate().back();
        BrowserUtils.sleep(2);

    }

}
   */
}
