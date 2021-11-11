package com.sparta.tests.pom.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SocialButtonsComponent {
    private final WebDriver webDriver;
    public SocialButtonsComponent(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    // Social buttons
    By twitterButton = new By.ByCssSelector("[href=\"https://twitter.com/saucelabs\"]");
    By facebookButton = new By.ByCssSelector("[href=\"https://www.facebook.com/saucelabs\"]");
    By linkedinButton = new By.ByCssSelector("[href=\"https://www.linkedin.com/company/sauce-labs/\"]");

    // IsPresent checks for social buttons
    public boolean twitterButtonIsPresent() {
        return webDriver.findElements(twitterButton).size() != 0;
    }

    public boolean facebookButtonIsPresent() {
        return webDriver.findElements(facebookButton).size() != 0;
    }

    public boolean linkedinButtonIsPresent() {
        return webDriver.findElements(linkedinButton).size() != 0;
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
