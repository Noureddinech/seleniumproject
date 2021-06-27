package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PagesObjectsModelPatterns {
    @Test
    public void negative_login_to_library_test(){
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.inputEmail.sendKeys("Hello@gmail.cm");
        libraryLoginPage.inputPassword.sendKeys("holla");
        libraryLoginPage.signInButton.click();
        Assert.assertTrue(libraryLoginPage.incorrectEmailOrPasswordError.isDisplayed());
        Driver.closeDriver();
    }
}
