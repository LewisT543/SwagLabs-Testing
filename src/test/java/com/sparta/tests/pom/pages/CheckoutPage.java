package com.sparta.tests.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    // Error message
    By errorMessage = new By.ByCssSelector("[data-test=\"error\"]");
    By errorMessageExit = new By.ByClassName("error-button");

    // Error symbols
    By checkoutInfo = new By.ByClassName("checkout_info");

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

    // Error messages
    public String getErrorMessage() {
        return webDriver.findElement(errorMessage).getText();
    }

    public void clickErrorMessageExitButton() {
        webDriver.findElement(errorMessageExit).click();
    }

    // Get user input fields
    public String getFirstName() {
        return webDriver.findElement(firstNameField).getAttribute("value");
    }

    public String getLastName() {
        return webDriver.findElement(lastNameField).getAttribute("value");
    }

    public String getPostcode() {
        return webDriver.findElement(postalCodeField).getAttribute("value");
    }

    // Enter string into user input fields
    public void setFirstName(String fName) {
        webDriver.findElement(firstNameField).sendKeys(fName);
    }

    public void setLastName(String lName) {
        webDriver.findElement(lastNameField).sendKeys(lName);
    }

    public void setPostcode(String pCode) {
        webDriver.findElement(postalCodeField).sendKeys(pCode);
    }

    // User input error icons
    public List<WebElement> getFormGroupItems() {
        return webDriver.findElement(checkoutInfo).findElements(new By.ByClassName("form_group"));
    }

    public boolean firstNameHasErrorIcon() {
        return getFormGroupItems().get(0).findElements(new By.ByTagName("svg")).size() != 0;
    }

    public boolean lastNameHasErrorIcon() {
        return getFormGroupItems().get(1).findElements(new By.ByTagName("svg")).size() != 0;
    }

    public boolean postcodeHasErrorIcon() {
        return getFormGroupItems().get(2).findElements(new By.ByTagName("svg")).size() != 0;
    }
}
