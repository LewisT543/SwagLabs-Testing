package com.sparta.tests.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver webDriver;
    By loginButton = new By.ById("login-button");
    By usernameField = new By.ById("user-name");
    By passwordField = new By.ById("password");
    By errorField = new By.ByClassName("error-message-container error");

    public LoginPage (WebDriver webDriver){
        this.webDriver = webDriver;
        goToLoginPage();
    }

    public void goToLoginPage() {
        webDriver.get("https://www.saucedemo.com/");
    }

    // ---------------------------------------------------------- //

    public void clickSubmit() {
        webDriver.findElement(loginButton).click();
    }

    public void setUsername(String username) {
        webDriver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        webDriver.findElement(passwordField).sendKeys(password);
    }

    public String getErrorMessage() {
        return webDriver.findElement(errorField).getText();
    }
}
