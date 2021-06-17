package com.cybertek.tests.practice;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PhpMySQL {
    //1. Go to http://thedemosite.co.uk/login.php page, check the page whether opened or not
    //2. Check the following elements on login page;
    //a. Tab Title = 'Login example page to test the PHP MySQL online system'
    //b. Header = '4. Login'
    //c. Status Message = No login attempted
    //d. Info Message = 'Enter your login details you added on the previous page and test the login. The success or failure will be shown above.'
    //e. Username field
    //f. Password password field
    //g. Test Login button
    //3. Perform a successful login and check the status message change
    //4. Perform a failed login and check the status message change
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://thedemosite.co.uk/login.php");
    }
    @Test (priority = 1)
    public void loginWithValidCredentials(){
        String expectedTabTitle = "Login example page to test the PHP MySQL online system";
        String actualTabTitle = driver.getTitle();
        Assert.assertEquals(expectedTabTitle,actualTabTitle);
        String expectedHeader = "4. Login";
        String actualHeader = driver.findElement(By.xpath("//p[.='4. Login']")).getText();
        Assert.assertEquals(expectedHeader,actualHeader);
        String expectedMessageStatus = "**No login attempted**";
        String actualMessageStatus = driver.findElement(By.xpath("//big//blockquote")).getText();
        Assert.assertEquals(expectedMessageStatus,actualMessageStatus);
        String expInfoMessage = "Enter your login details you added on the previous page and test the login.\n" +
                "The success or failure will be shown above.";
        String actInfoMessage = driver.findElement(By.xpath("(//p[@align='center'])[6]")).getText();
        Assert.assertEquals(expInfoMessage,actInfoMessage);
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("budbunny");
        WebElement passwordBox = driver.findElement(By.name("password"));
        passwordBox.sendKeys("hola");
        BrowserUtils.sleep(2);
        WebElement logButton  = driver.findElement(By.name("FormsButton2"));
        logButton.click();
        String expectedMessageStatus2 = "**Successful Login**";
        String actualMessageStatus2 = driver.findElement(By.xpath("//big//blockquote//blockquote")).getText();
        Assert.assertEquals(expectedMessageStatus2,actualMessageStatus2);

    }
    @Test (priority = 2)
    public void loginWithInvalidCredentials(){
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("hellohellobom");
        WebElement passwordBox = driver.findElement(By.name("password"));
        passwordBox.sendKeys("hello");
        BrowserUtils.sleep(2);
        WebElement logButton  = driver.findElement(By.name("FormsButton2"));
        logButton.click();
        String expectedMessageStatus = "**Failed Login**";
        String actualMessageStatus = driver.findElement(By.xpath("//big//blockquote//blockquote")).getText();
        Assert.assertEquals(expectedMessageStatus,actualMessageStatus);

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
