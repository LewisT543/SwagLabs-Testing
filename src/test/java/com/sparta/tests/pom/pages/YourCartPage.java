package com.sparta.tests.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {
    private final WebDriver webDriver;
    public YourCartPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    // YourCart footer buttons
    By continueShoppingButton = new By.ById("continue-shopping");
    By checkoutButton = new By.ById("checkout");

    // Social buttons
    By twitterButton = new By.ByCssSelector("[href=\"https://twitter.com/saucelabs\"]");
    By facebookButton = new By.ByCssSelector("[href=\"https://www.facebook.com/saucelabs\"]");
    By linkedinButton = new By.ByCssSelector("[href=\"https://www.linkedin.com/company/sauce-labs/\"]");

    // Item name links
    By backPackNameLink = new By.ById("item_4_title_link");
    By bikeLightNameLink = new By.ById("item_0_title_link");
    By boltTShirtNameLink = new By.ById("item_1_title_link");
    By fleeceJacketNameLink = new By.ById("item_5_title_link");
    By onesieNameLink = new By.ById("item_2_title_link");
    By redTShirtNameLink = new By.ById("item_3_title_link");

    // Remove item
    By removeBackpackToCartButton = new By.ById("remove-to-cart-sauce-labs-backpack");
    By removeBikeLightToCartButton = new By.ById("remove-to-cart-sauce-labs-bike-light");
    By removeBoltTShirtToCartButton = new By.ById("remove-to-cart-sauce-labs-bolt-t-shirt");
    By removeFleeceJacketToCartButton = new By.ById("remove-to-cart-sauce-labs-fleece-jacket");
    By removeOnesieToCartButton = new By.ById("remove-to-cart-sauce-labs-onesie");
    By removeRedTShirtToCartButton = new By.ById("remove-to-cart-test.allthethings()-t-shirt-(red)");

    // Checkout footer button clicks
    public void clickContinueShoppingButton() {
        webDriver.findElement(continueShoppingButton).click();
    }

    public void clickCheckoutButton() {
        webDriver.findElement(checkoutButton).click();
    }

    // Item nameLink clicks
    public void clickBackPackNameLink() {
        webDriver.findElement(backPackNameLink).click();
    }

    public void clickBikeLightNameLink() {
        webDriver.findElement(bikeLightNameLink).click();
    }

    public void clickBoltTShirtNameLink() {
        webDriver.findElement(boltTShirtNameLink).click();
    }

    public void clickFleeceJacketNameLink() {
        webDriver.findElement(fleeceJacketNameLink).click();
    }

    public void clickOnesieNameLink() {
        webDriver.findElement(onesieNameLink).click();
    }

    public void clickRedTShirtNameLink() {
        webDriver.findElement(redTShirtNameLink).click();
    }

    // Remove items from cart clicks
    public void clickRemoveBackpackToCart() {
        webDriver.findElement(removeBackpackToCartButton).click();
    }

    public void clickRemoveBikeLightToCartButton() {
        webDriver.findElement(removeBikeLightToCartButton).click();
    }

    public void clickRemoveBoltTShirtToCartButton() {
        webDriver.findElement(removeBoltTShirtToCartButton).click();
    }

    public void clickRemoveFleeceJacketToCartButton() {
        webDriver.findElement(removeFleeceJacketToCartButton).click();
    }

    public void clickRemoveOnesieToCartButton() {
        webDriver.findElement(removeOnesieToCartButton).click();
    }

    public void clickRemoveRedTShirtToCartButton() {
        webDriver.findElement(removeRedTShirtToCartButton).click();
    }

    // Item is present
    public boolean backPackIsInCart() {
        return webDriver.findElements(backPackNameLink).size() != 0;
    }

    public boolean bikeLightIsInCart() {
        return webDriver.findElements(bikeLightNameLink).size() != 0;
    }

    public boolean boltTShirtIsInCart() {
        return webDriver.findElements(boltTShirtNameLink).size() != 0;
    }

    public boolean fleeceJacketIsInCart() {
        return webDriver.findElements(fleeceJacketNameLink).size() != 0;
    }

    public boolean onesieIsInCart() {
        return webDriver.findElements(onesieNameLink).size() != 0;
    }

    public boolean redTShirtIsInCart() {
        return webDriver.findElements(redTShirtNameLink).size() != 0;
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
