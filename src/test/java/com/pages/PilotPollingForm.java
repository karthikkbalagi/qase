/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PilotPollingForm {
    WebDriver driver;
    private By Question1 = By.xpath("(//span[@class= 'Form__Element__Caption'])[1]/../div/label/span");
    private By Question2 = By.xpath("(//span[@class= 'Form__Element__Caption'])[2]/../div/label/span");
    private By Question3 = By.xpath("(//span[@class= 'Form__Element__Caption'])[3]/../div/label/span");
    private By Question4 = By.xpath("(//span[@class= 'Form__Element__Caption'])[4]/../div/label/span");
    private By Question5 = By.xpath("(//span[@class= 'Form__Element__Caption'])[5]/../div/label/span");
    private By Question6 = By.xpath("(//span[@class= 'Form__Element__Caption'])[6]/../div/label/span");
    private By Question7 = By.xpath("(//span[@class= 'Form__Element__Caption'])[7]/../div/label/span");
    private By Question8 = By.xpath("(//span[@class= 'Form__Element__Caption'])[8]/../div/label/span");
    private By Question9 = By.xpath("(//span[@class= 'Form__Element__Caption'])[9]/../div/label/span");
    private By Question10 = By.xpath("(//span[@class= 'Form__Element__Caption'])[10]/../div/label/span");
    private By Question11 = By.xpath("(//span[@class= 'Form__Element__Caption'])[11]/../div/label/span");
    private By SubmitButton = By.name("submit");
    private By messagelocator = By.xpath("//div[text () = 'Submit successful.']");

    public PilotPollingForm(WebDriver driver) {
        this.driver = driver;
    }

    public void selectQuestion1() throws InterruptedException {
        List<WebElement> q1 = this.driver.findElements(this.Question1);
        RandomSample getrandom = new RandomSample();
        WebElement radiobutton = q1.get(getrandom.randamValue(q1.size()));
        radiobutton.click();
    }

    public void selectQuestion2() throws InterruptedException {
        List<WebElement> q2 = this.driver.findElements(this.Question2);
        RandomSample getrandom = new RandomSample();
        WebElement radiobutton = q2.get(getrandom.randamValue(q2.size()));
        radiobutton.click();
    }

    public void selectQuestion3() throws InterruptedException {
        List<WebElement> q3 = this.driver.findElements(this.Question3);
        RandomSample getrandom = new RandomSample();
        WebElement radiobutton = q3.get(getrandom.randamValue(q3.size()));
        radiobutton.click();
    }

    public void selectQuestion4() throws InterruptedException {
        List<WebElement> q4 = this.driver.findElements(this.Question4);
        RandomSample getrandom = new RandomSample();
        WebElement radiobutton = q4.get(getrandom.randamValue(q4.size()));
        radiobutton.click();
    }

    public void selectQuestion5() throws InterruptedException {
        List<WebElement> q5 = this.driver.findElements(this.Question5);
        RandomSample getrandom = new RandomSample();
        WebElement radiobutton = q5.get(getrandom.randamValue(q5.size()));
        radiobutton.click();
    }

    public void selectQuestion6() throws InterruptedException {
        List<WebElement> q6 = this.driver.findElements(this.Question6);
        RandomSample getrandom = new RandomSample();
        WebElement radiobutton = q6.get(getrandom.randamValue(q6.size()));
        radiobutton.click();
    }

    public void selectQuestion7() throws InterruptedException {
        List<WebElement> q7 = this.driver.findElements(this.Question7);
        RandomSample getrandom = new RandomSample();
        WebElement radiobutton = q7.get(getrandom.randamValue(q7.size()));
        radiobutton.click();
    }

    public void selectQuestion8() throws InterruptedException {
        List<WebElement> q8 = this.driver.findElements(this.Question8);
        RandomSample getrandom = new RandomSample();
        WebElement radiobutton = q8.get(getrandom.randamValue(q8.size()));
        radiobutton.click();
    }

    public void selectQuestion9() throws InterruptedException {
        List<WebElement> q9 = this.driver.findElements(this.Question9);
        RandomSample getrandom = new RandomSample();
        WebElement radiobutton = q9.get(getrandom.randamValue(q9.size()));
        radiobutton.click();
    }

    public void selectQuestion10() throws InterruptedException {
        List<WebElement> q10 = this.driver.findElements(this.Question10);
        RandomSample getrandom = new RandomSample();
        WebElement radiobutton = q10.get(getrandom.randamValue(q10.size()));
        radiobutton.click();
    }

    public void selectQuestion11() throws InterruptedException {
        List<WebElement> q11 = this.driver.findElements(this.Question11);
        RandomSample getrandom = new RandomSample();
        WebElement radiobutton = q11.get(getrandom.randamValue(q11.size()));
        radiobutton.click();
    }

    public void SetSubmitButton() {
        this.driver.findElement(this.SubmitButton).click();
    }

    public void VerifyMessage() throws IOException {
        AssertionDemo soft = new AssertionDemo(this.driver);
        PropertiesFileDemo properties = new PropertiesFileDemo(this.driver);
        soft.VerifyText(this.messagelocator, properties.getDataFromPropertyFile("expectedText"));
    }
}

