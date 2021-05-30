package com.cybertek.tests.day6_testing_intro_dropdowns;

import org.testng.annotations.*;

public class TestNG_Intro {
    @BeforeClass
    public void setupClass(){
        System.out.println("---> Before class is running");
    }

    @AfterClass
    public void teardownClass(){
        System.out.println("---> after class is running...");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("---> Before method is running...");
    }
    @AfterMethod
    public void teardownMethod(){
        System.out.println("---> after method is running...");
    }

    @Test
    public void test1(){
        System.out.println("Running test 1...");
    }

    @Test
    public void test2(){
        System.out.println("Running test 2...");
    }
}
