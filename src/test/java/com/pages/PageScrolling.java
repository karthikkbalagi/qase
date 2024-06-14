/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageScrolling {
    WebDriver driver;
    JavascriptExecutor scroll;

    public PageScrolling(WebDriver driver) {
        this.driver = driver;
        this.scroll = (JavascriptExecutor)((Object)driver);
    }

    public void setScroll600() {
        this.scroll.executeScript("window.scrollTo(0,600)", new Object[0]);
    }

    public void setScrollToEnd() {
        this.scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)", new Object[0]);
    }

    public void setScroll300() {
        this.scroll.executeScript("window.scrollTo(0,300)", new Object[0]);
    }

    public void scrollToTop() {
        this.scroll.executeScript("window.scrollTo(0, 0)", new Object[0]);
    }
}

