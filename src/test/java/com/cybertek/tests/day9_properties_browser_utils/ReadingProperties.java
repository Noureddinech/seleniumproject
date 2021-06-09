package com.cybertek.tests.day9_properties_browser_utils;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test
    public void reading_from_properties() throws IOException {
       //#1 Create object of properties class (coming from java library)
        Properties properties = new Properties();

        //#2 Open the file using FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        // #3 load the properties object with our file

        properties.load(file);

        // READING FROM CONFIGURATION.PROPERTIES
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("System.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));


    }
}
