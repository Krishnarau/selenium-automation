package com.example.selenium_automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    public static void loadProperties() throws IOException {

        String path = System.getProperty("user.dir")
                + "/src/test/resources/config.properties";

        FileInputStream fis = new FileInputStream(path);

        properties = new Properties();
        properties.load(fis);

        fis.close();
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}