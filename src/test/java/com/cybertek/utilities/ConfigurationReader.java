package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

        //#1 Create properties object
        private static Properties properties = new Properties();

        static {
            try {
                FileInputStream file = new FileInputStream("configuration.properties");
                properties.load(file);
                // close the file
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // use the above created logic to creat a reusable static method

    public static String getProperty(String keyWord){
            return properties.getProperty("keyword");
    }










}
