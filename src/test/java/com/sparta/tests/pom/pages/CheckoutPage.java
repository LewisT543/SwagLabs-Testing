package com.sparta.tests.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private final WebDriver webDriver;
    public CheckoutPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    // CheckoutStepOne footer buttons
    By cancelButton = new By.ById("cancel");
    By continueButton = new By.ById("continue");

    // Cart button
    By cartButton = new By.ById("shopping_cart_container");

    // User input fields
    By firstNameField = new By.ById("first-name");
    By lastNameField = new By.ById("last-name");
    By postalCodeField = new By.ById("postal-code");

    // Checkout footer button clicks
    public void clickCancelButton() {
        webDriver.findElement(cancelButton).click();
    }

    public void clickContinueButton() {
        webDriver.findElement(continueButton).click();
    }

    // Cart button click
    public void clickCartButton() {
        webDriver.findElement(cartButton).click();
    }

    // Get user input fields
    public String getFirstName() {
        return webDriver.findElement(firstNameField).getText();
    }

    public String getLastName() {
        return webDriver.findElement(lastNameField).getText();
    }

    public String getPostCode() {
        return webDriver.findElement(postalCodeField).getText();
    }


    // Enter string into user input fields
    public void setFirstName(String fName) {
        webDriver.findElement(firstNameField).sendKeys(fName);
    }

    public void setLastName(String lName) {
        webDriver.findElement(lastNameField).sendKeys(lName);
    }

    public void setPostCode(String pCode) {
        webDriver.findElement(postalCodeField).sendKeys(pCode);
    }
}
