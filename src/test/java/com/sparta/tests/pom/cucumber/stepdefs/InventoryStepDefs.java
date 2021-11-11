package com.sparta.tests.pom.cucumber.stepdefs;

import com.sparta.tests.pom.pages.ProductsPage;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InventoryStepDefs {

    private WebDriver webDriver;
    private ProductsPage productsPage;

    @Before(order = 1)
    public void init() {
        webDriver = POMUtil.getWebDriver();
        productsPage = new ProductsPage(webDriver);
    }

    @When("I click on the Backpack ADD TO CART button")
    public void iClickOnTheBackpackADDTOCARTButton() {
        productsPage.clickAddBackpackToCart();
    }

    @When("I click on the Bolt T-Shirt ADD TO CART button")
    public void iClickOnTheBoltTShirtADDTOCARTButton() {
        productsPage.clickAddBoltTShirtToCartButton();
    }

    @When("I click on the Onesie ADD TO CART button")
    public void iClickOnTheOnesieADDTOCARTButton() {
        productsPage.clickAddOnesieToCartButton();
    }

    @When("I click on the Bike Light ADD TO CART button")
    public void iClickOnTheBikeLightADDTOCARTButton() {
        productsPage.clickAddBikeLightToCartButton();
    }

    @When("I click on the Fleece Jacket ADD TO CART button")
    public void iClickOnTheFleeceJacketADDTOCARTButton() {
        productsPage.clickAddFleeceJacketToCartButton();
    }

    @When("I click on the test all things T-Shirt ADD TO CART button")
    public void iClickOnTheTestAllThingsTShirtADDTOCARTButton() {
        productsPage.clickAddRedTShirtToCartButton();
    }

    @Then("The Backpack ADD TO CART button should change to REMOVE")
    public void theBackpackADDTOCARTButtonShouldChangeToREMOVE() {
        assertTrue(productsPage.removeBackpackFromCartButtonIsPresent());
    }

    @Then("The Bolt T-Shirt ADD TO CART button should change to REMOVE")
    public void theBoltTShirtADDTOCARTButtonShouldChangeToREMOVE() {
        assertTrue(productsPage.removeBoltTShirtFromCartButtonIsPresent());
    }

    @Then("The Onsie ADD TO CART button should change to REMOVE")
    public void theOnsieADDTOCARTButtonShouldChangeToREMOVE() {
        assertTrue(productsPage.removeOnesieFromCartButtonIsPresent());
    }

    @Then("The Bike Light ADD TO CART button should change to REMOVE")
    public void theBikeLightADDTOCARTButtonShouldChangeToREMOVE() {
        assertTrue(productsPage.removeBikeLightFromCartButtonIsPresent());
    }

    @Then("The Fleece Jacket ADD TO CART button should change to REMOVE")
    public void theFleeceJacketADDTOCARTButtonShouldChangeToREMOVE() {
        assertTrue(productsPage.removeFleeceJacketFromCartButtonIsPresent());
    }

    @Then("The test all things T-Shirt ADD TO CART button should change to REMOVE")
    public void theTestAllThingsTShirtADDTOCARTButtonShouldChangeToREMOVE() {
        assertTrue(productsPage.removeRedTShirtFromCartButtonIsPresent());
    }

    @Then("The CART counter should be {int}")
    public void theCARTCounterShouldBe(int amount) {
        assertEquals(amount, productsPage.getCartBadgeNumber());
    }
}
