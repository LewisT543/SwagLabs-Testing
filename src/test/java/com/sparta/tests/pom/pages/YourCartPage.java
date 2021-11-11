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

    // Item name links
    By backPackNameLink = new By.ById("item_4_title_link");
    By bikeLightNameLink = new By.ById("item_0_title_link");
    By boltTShirtNameLink = new By.ById("item_1_title_link");
    By fleeceJacketNameLink = new By.ById("item_5_title_link");
    By onesieNameLink = new By.ById("item_2_title_link");
    By redTShirtNameLink = new By.ById("item_3_title_link");

    // Remove item
    By removeBackpackFromCartButton = new By.ById("remove-sauce-labs-backpack");
    By removeBikeLightFromCartButton = new By.ById("remove-sauce-labs-bike-light");
    By removeBoltTShirtFromCartButton = new By.ById("remove-sauce-labs-bolt-t-shirt");
    By removeFleeceJacketFromCartButton = new By.ById("remove-sauce-labs-fleece-jacket");
    By removeOnesieFromCartButton = new By.ById("remove-sauce-labs-onesie");
    By removeRedTShirtFromCartButton = new By.ById("remove-test.allthethings()-t-shirt-(red)");

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
    public void clickRemoveBackpackFromCart() {
        webDriver.findElement(removeBackpackFromCartButton).click();
    }

    public void clickRemoveBikeLightFromCartButton() {
        webDriver.findElement(removeBikeLightFromCartButton).click();
    }

    public void clickRemoveBoltTShirtFromCartButton() {
        webDriver.findElement(removeBoltTShirtFromCartButton).click();
    }

    public void clickRemoveFleeceJacketFromCartButton() {
        webDriver.findElement(removeFleeceJacketFromCartButton).click();
    }

    public void clickRemoveOnesieFromCartButton() {
        webDriver.findElement(removeOnesieFromCartButton).click();
    }

    public void clickRemoveRedTShirtFromCartButton() {
        webDriver.findElement(removeRedTShirtFromCartButton).click();
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
}
