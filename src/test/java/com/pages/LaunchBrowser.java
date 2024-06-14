/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LaunchBrowser {
    public WebDriver driver;
    public PropertiesFileDemo properties;

    public LaunchBrowser() throws FileNotFoundException {
        this.properties = new PropertiesFileDemo(this.driver);
    }

    @BeforeClass
    public void OpenBrowser() throws IOException {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
        driver.get("https://qa.swapa.org");
        //this.driver.get(this.properties.getDataFromPropertyFile("url"));
    }

    @AfterClass
    public void CloseBrowser() throws InterruptedException {
        Thread.sleep(5000L);
        driver.quit();
    }
}

