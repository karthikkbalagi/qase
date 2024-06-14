/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private By mainLogin = By.linkText("Log in");
    private By UserNamefield = By.id("signInName");
    private By Passwordfield = By.id("password");
    private By Logininbutton = By.id("next");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickMainLogin() {
        this.driver.findElement(this.mainLogin).click();
    }

    public void setUsername(String username) {
        this.driver.findElement(this.UserNamefield).sendKeys(username);
    }

    public void setPassword(String password) {
        this.driver.findElement(this.Passwordfield).sendKeys(password);
    }

    public void ClickLoginbutton() {
        this.driver.findElement(this.Logininbutton).click();
    }
}

