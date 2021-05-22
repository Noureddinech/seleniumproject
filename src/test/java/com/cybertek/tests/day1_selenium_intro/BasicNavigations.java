package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        // set up the browser driver
        WebDriverManager.chromedriver().setup();

        // create instance of selenium web driver and open empty browser
        WebDriver driver = new ChromeDriver();

        // get the page for Tesla.com
        driver.get("http:/www.tesla.com");


        // Going back using navigations
        Thread.sleep(3000); // this line is just to slow the code for 3 seconds
        driver.navigate().back();

        // Going forward using navigations
        Thread.sleep(3000); // this line is just to slow the code for 3 seconds
        driver.navigate().forward();


        // refreshing the page using navigations
        Thread.sleep(3000); // this line is just to slow the code for 3 seconds
        driver.navigate().refresh();

        // going to another url
        Thread.sleep(3000); // this line is just to slow the code for 3 seconds
        driver.navigate().to("http:/www.facebook.com");

        //get the title
        Thread.sleep(3000); // this line is just to slow the code for 3 seconds
        System.out.println("Current title : "+ driver.getTitle());

        // get current Url
        System.out.println("Current Url : "+driver.getCurrentUrl());
        // or
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl); //  since we created a string and we stored the method in it .

        // this line will maximize the browser size
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        // this will close the currently focused page ot tab
        driver.close();
    }
}
