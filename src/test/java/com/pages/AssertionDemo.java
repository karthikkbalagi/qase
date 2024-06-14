package com.pages;/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */

;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
    WebDriver driver;
    SoftAssert soft;

    public AssertionDemo(WebDriver driver) {
        this.driver = driver;
        this.soft = new SoftAssert();
    }

    public void VerifyText(By locater, String expectedText) {
        String actualText = this.driver.findElement(locater).getText();
        this.soft.assertEquals(actualText, expectedText, "Text Mismatch!");
        this.soft.assertAll();
    }
}

