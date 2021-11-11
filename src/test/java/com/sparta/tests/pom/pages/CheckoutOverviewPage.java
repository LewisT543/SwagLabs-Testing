package com.sparta.tests.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
    private final WebDriver webDriver;
    public CheckoutOverviewPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    // CheckoutOverview footer buttons
    By cancelButton = new By.ById("cancel");
    By finishButton = new By.ById("finish");

    // Item name links
    By backPackNameLink = new By.ById("item_4_title_link");
    By bikeLightNameLink = new By.ById("item_0_title_link");
    By boltTShirtNameLink = new By.ById("item_1_title_link");
    By fleeceJacketNameLink = new By.ById("item_5_title_link");
    By onesieNameLink = new By.ById("item_2_title_link");
    By redTShirtNameLink = new By.ById("item_3_title_link");

    // Social buttons
    By twitterButton = new By.ByCssSelector("[href=\"https://twitter.com/saucelabs\"]");
    By facebookButton = new By.ByCssSelector("[href=\"https://www.facebook.com/saucelabs\"]");
    By linkedinButton = new By.ByCssSelector("[href=\"https://www.linkedin.com/company/sauce-labs/\"]");

    // Tax figures
    By itemTotalFigure = new By.ByClassName("summary_subtotal_label");
    By taxFigure = new By.ByClassName("summary_tax_label");
    By totalFigure = new By.ByClassName("summary_total_label");

    // CheckoutStepTwo footer buttons clicks
    public void clickCancelButton() {
        webDriver.findElement(cancelButton).click();
    }

    public void clickFinishButton() {
        webDriver.findElement(finishButton).click();
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

    // Tax is correct
    public boolean totalCostIsTaxPlusTotal() {
        float itemTotal = Float.parseFloat(webDriver.findElement(itemTotalFigure).getText().substring(13));
        float tax = Float.parseFloat(webDriver.findElement(taxFigure).getText().substring(6));
        float total = Float.parseFloat(webDriver.findElement(totalFigure).getText().substring(8));
        return (itemTotal + tax) == total;
    }

    public boolean taxIsEightPercent() {
        float itemTotal = Float.parseFloat(webDriver.findElement(itemTotalFigure).getText().substring(13));
        float tax = Float.parseFloat(webDriver.findElement(taxFigure).getText().substring(6));
        float taxPercent = (tax / itemTotal) * 100;
        return taxPercent < 8.01 && taxPercent > 7.99;
    }
}
