package com.sparta.tests.pom.cucumber.stepdefs;

import com.sparta.tests.pom.pages.InventoryPage;
import com.sparta.tests.pom.pages.LoginPage;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InventoryStepDefs {

    private WebDriver webDriver;
    private InventoryPage inventoryPage;

    @Before(order = 1)
    public void init() {
        webDriver = POMUtil.getWebDriver();
        inventoryPage = new InventoryPage(webDriver);
    }

    @When("I click on the Backpack ADD TO CART button")
    public void iClickOnTheBackpackADDTOCARTButton() {
        inventoryPage.clickAddBackpackToCart();
    }

    @When("I click on the Bolt T-Shirt ADD TO CART button")
    public void iClickOnTheBoltTShirtADDTOCARTButton() {
        inventoryPage.clickAddBoltTShirtToCartButton();
    }

    @When("I click on the Onesie ADD TO CART button")
    public void iClickOnTheOnesieADDTOCARTButton() {
        inventoryPage.clickAddOnesieToCartButton();
    }

    @When("I click on the Bike Light ADD TO CART button")
    public void iClickOnTheBikeLightADDTOCARTButton() {
        inventoryPage.clickAddBikeLightToCartButton();
    }

    @When("I click on the Fleece Jacket ADD TO CART button")
    public void iClickOnTheFleeceJacketADDTOCARTButton() {
        inventoryPage.clickAddFleeceJacketToCartButton();
    }

    @When("I click on the test all things T-Shirt ADD TO CART button")
    public void iClickOnTheTestAllThingsTShirtADDTOCARTButton() {
        inventoryPage.clickAddRedTShirtToCartButton();
    }

    @Then("The Backpack ADD TO CART button should change to REMOVE")
    public void theBackpackADDTOCARTButtonShouldChangeToREMOVE() {
        assertTrue(inventoryPage.removeBackpackToCartButtonIsPresent());
    }

    @Then("The Bolt T-Shirt ADD TO CART button should change to REMOVE")
    public void theBoltTShirtADDTOCARTButtonShouldChangeToREMOVE() {
        assertTrue(inventoryPage.removeBoltTShirtToCartButtonIsPresent());
    }

    @Then("The Onsie ADD TO CART button should change to REMOVE")
    public void theOnsieADDTOCARTButtonShouldChangeToREMOVE() {
        assertTrue(inventoryPage.removeOnesieToCartButtonIsPresent());
    }

    @Then("The Bike Light ADD TO CART button should change to REMOVE")
    public void theBikeLightADDTOCARTButtonShouldChangeToREMOVE() {
        assertTrue(inventoryPage.removeBikeLightToCartButtonIsPresent());
    }

    @Then("The Fleece Jacket ADD TO CART button should change to REMOVE")
    public void theFleeceJacketADDTOCARTButtonShouldChangeToREMOVE() {
        assertTrue(inventoryPage.removeFleeceJacketToCartButtonIsPresent());
    }

    @Then("The test all things T-Shirt ADD TO CART button should change to REMOVE")
    public void theTestAllThingsTShirtADDTOCARTButtonShouldChangeToREMOVE() {
        assertTrue(inventoryPage.removeRedTShirtToCartButtonIsPresent());
    }
}
