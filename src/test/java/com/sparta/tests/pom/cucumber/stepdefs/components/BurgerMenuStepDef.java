package com.sparta.tests.pom.cucumber.stepdefs.components;

import com.sparta.tests.pom.pages.components.BurgerMenuComponent;
import com.sparta.tests.pom.util.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BurgerMenuStepDef {

    private WebDriver webDriver;
    private BurgerMenuComponent burgerMenuComponent;

    @Before(order = 1)
    public void init() {
        webDriver = DriverFactory.getDriver();
        burgerMenuComponent = new BurgerMenuComponent(webDriver);
    }

    @Then("I should see a burger menu")
    public void iShouldSeeABurgerMenu() {
        Assertions.assertTrue(burgerMenuComponent.burgerMenuIsPresent());
    }

    @When("I click on the burger menu button")
    public void iClickOnTheBurgerMenuButton() {
        burgerMenuComponent.clickMenuButton();
    }

    @Then("I should see a burger menu all items button")
    public void iShouldSeeABurgerMenuAllItemsButton() {
        Assertions.assertTrue(burgerMenuComponent.burgerMenuInventoryButtonIsPresent());
    }

    @Then("I should see a burger menu about button")
    public void iShouldSeeABurgerMenuAboutButton() {
        Assertions.assertTrue(burgerMenuComponent.burgerMenuAboutButtonIsPresent());
    }

    @Then("I should see a burger menu logout button")
    public void iShouldSeeABurgerMenuLogoutButton() {
        Assertions.assertTrue(burgerMenuComponent.burgerMenuLogoutButtonIsPresent());
    }

    @Then("I should see a burger menu exit button")
    public void iShouldSeeABurgerMenuExitButton() {
        Assertions.assertTrue(burgerMenuComponent.burgerMenuExitButtonIsPresent());
    }

    @And("I click on the burger menu all items button")
    public void iClickOnTheBurgerMenuAllItemsButton() {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 3);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(burgerMenuComponent.getInventorySidebarButton()));
        burgerMenuComponent.clickInventoryButton();
    }

    @Then("I should be redirected to the products page")
    public void iShouldBeRedirectedToTheProductsPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", webDriver.getCurrentUrl());
    }

    @And("I click on the burger menu about button")
    public void iClickOnTheBurgerMenuAboutButton() {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 3);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(burgerMenuComponent.getAboutSidebarButton()));
        burgerMenuComponent.clickAboutButton();
    }

    @Then("I should be redirected to the about page")
    public void iShouldBeRedirectedToTheAboutPage() {
        Assertions.assertEquals("https://saucelabs.com/", webDriver.getCurrentUrl());
    }

    @And("I click on the burger menu logout button")
    public void iClickOnTheBurgerMenuLogoutButton() {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 3);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(burgerMenuComponent.getLogoutSidebarButton()));
        burgerMenuComponent.clickLogoutButton();
    }

    @Then("I should be redirected to the login page")
    public void iShouldBeRedirectedToTheLoginPage() {
        Assertions.assertEquals("https://www.saucedemo.com/", webDriver.getCurrentUrl());
    }

    @And("I click on the burger menu exit button")
    public void iClickOnTheBurgerMenuExitButton() {
        burgerMenuComponent.clickCloseMenuButton();
    }
}
