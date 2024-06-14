/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

public class PropertiesFileDemo {
    WebDriver driver;

    public PropertiesFileDemo(WebDriver driver) {
        this.driver = driver;
    }

    public String getDataFromPropertyFile(String key) throws IOException {
        Properties file = new Properties();
        FileInputStream Path = new FileInputStream("/Users/dilipkumar/Desktop/Testproject/src/main/resources/Properties");

        file.load(Path);
        String KeyValue = file.getProperty(key);
        return KeyValue;
    }
}

