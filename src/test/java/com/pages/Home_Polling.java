/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Polling {
    WebDriver driver;
    private By resources = By.xpath("(//a[contains(@data-toggle, 'dropdown')])[5]");
    private By SRCForms = By.xpath("(//a[contains(text(),'SRC')])[1]");
    private By PilotPollingForm = By.xpath("(//a[contains(text(),'Pilot')])[3]");

    public Home_Polling(WebDriver driver) {
        this.driver = driver;
    }

    public void clickResources() {
        this.driver.findElement(this.resources).click();
    }

    public void clickSRC_Forms() {
        this.driver.findElement(this.SRCForms).click();
    }

    public void clickPilotPollingForm() {
        this.driver.findElement(this.PilotPollingForm).click();
    }
}

