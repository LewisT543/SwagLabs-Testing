package com.sparta.tests.pom.cucumber.stepdefs.productpage;

import com.sparta.tests.pom.pages.InventoryPage;
import com.sparta.tests.pom.pages.YourCartPage;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ProductNavigationStepDef {

    private WebDriver webDriver;
    private InventoryPage inventoryPage;

    @Before(order = 1)
    public void init() {
        webDriver = POMUtil.getWebDriver();
        inventoryPage = new InventoryPage(webDriver);
    }

    @When("I click the Backpack link")
    public void iClickTheBackpackLink() {
        inventoryPage.clickBackPackNameLink();
    }

    @Then("I will go the Backpack page")
    public void iWillGoTheBackpackPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory-item.html?id=4", webDriver.getCurrentUrl());
    }

    @When("I click the Bolt T-Shirt link")
    public void iClickTheBoltTShirtLink() {
        inventoryPage.clickBoltTShirtNameLink();
    }

    @Then("I will go the Bolt T-Shirt page")
    public void iWillGoTheBoltTShirtPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory-item.html?id=1", webDriver.getCurrentUrl());
    }

    @When("I click the Onesie link")
    public void iClickTheOnesieLink() {
        inventoryPage.clickOnesieNameLink();
    }

    @Then("I will go the Onesie page")
    public void iWillGoTheOnesiePage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory-item.html?id=2", webDriver.getCurrentUrl());
    }

    @When("I click the Bike Light link")
    public void iClickTheBikeLightLink() {
        inventoryPage.clickBikeLightNameLink();
    }

    @Then("I will go the Bike Light page")
    public void iWillGoTheBikeLightPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory-item.html?id=0", webDriver.getCurrentUrl());
    }

    @When("I click the Fleece Jacket link")
    public void iClickTheFleeceJacketLink() {
        inventoryPage.clickFleeceJacketNameLink();
    }

    @Then("I will go the Fleece Jacket page")
    public void iWillGoTheFleeceJacketPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory-item.html?id=5", webDriver.getCurrentUrl());
    }

    @When("I click the Test All The Things T-Shirt link")
    public void iClickTheTestAllTheThingsTShirtLink() {
        inventoryPage.clickRedTShirtNameLink();
    }

    @Then("I will go the Test All The Things T-Shirt page")
    public void iWillGoTheTestAllTheThingsTShirtPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory-item.html?id=3", webDriver.getCurrentUrl());
    }

    @When("I click the Backpack image")
    public void iClickTheBackpackImage() {
        inventoryPage.clickBackPackImage();
    }

    @When("I click the Bolt T-Shirt image")
    public void iClickTheBoltTShirtImage() {
        inventoryPage.clickBoltTShirtImage();
    }

    @When("I click the Onesie image")
    public void iClickTheOnesieImage() {
        inventoryPage.clickOnesieImage();
    }

    @When("I click the Bike Light image")
    public void iClickTheBikeLightImage() {
        inventoryPage.clickBikeLightImage();
    }

    @When("I click the Fleece Jacket image")
    public void iClickTheFleeceJacketImage() {
        inventoryPage.clickFleeceJacketImage();
    }

    @When("I click the Test All The Things T-Shirt image")
    public void iClickTheTestAllTheThingsTShirtImage() {
        inventoryPage.clickRedTShirtImage();
    }

    @When("I click the cart icon")
    public void iClickTheCartIcon() {
        inventoryPage.clickCartButton();
    }

    @Then("I will go to the Cart page")
    public void iWillGoToTheCartPage() {
        Assertions.assertEquals("https://www.saucedemo.com/cart.html", webDriver.getCurrentUrl());
    }
}
