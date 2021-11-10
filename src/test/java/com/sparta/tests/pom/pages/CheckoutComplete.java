package com.sparta.tests.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutComplete {
    private WebDriver webDriver;
    public CheckoutComplete(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    // Checkout Complete footer
    By backHomeButton = new By.ById("back-to-products");

    // backHome Button click
    public void clickBackToHomeButton() {
        webDriver.findElement(backHomeButton).click();
    }
}
