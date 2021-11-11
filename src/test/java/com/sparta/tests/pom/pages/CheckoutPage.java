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

    // Social buttons
    By twitterButton = new By.ByCssSelector("[href=\"https://twitter.com/saucelabs\"]");
    By facebookButton = new By.ByCssSelector("[href=\"https://www.facebook.com/saucelabs\"]");
    By linkedinButton = new By.ByCssSelector("[href=\"https://www.linkedin.com/company/sauce-labs/\"]");

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

    // Social buttons clicks
    public void clickTwitterButton() {
        webDriver.findElement(twitterButton).click();
    }

    public void clickFacebookButton() {
        webDriver.findElement(facebookButton).click();
    }

    public void clickLinkedinButton() {
        webDriver.findElement(linkedinButton).click();
    }
}
