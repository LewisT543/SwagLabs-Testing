package com.sparta.tests.pom.cucumber.stepdefs.productpage;

import com.sparta.tests.pom.pages.InventoryPage;
import com.sparta.tests.pom.pages.YourCartPage;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AddProductStepDef {

    private WebDriver webDriver;
    private InventoryPage inventoryPage;
    private YourCartPage yourCartPage;

    @Before(order = 1)
    public void init() {
        webDriver = POMUtil.getWebDriver();
        inventoryPage = new InventoryPage(webDriver);
        yourCartPage = new YourCartPage(webDriver);
    }

    @When("I click the Sauce Labs Backpack ADD TO CART button")
    public void iClickTheSauceLabsBackpackADDTOCARTButton() {
        inventoryPage.clickAddBackpackToCart();
    }

    @Then("The Sauce Labs Backpack ADD TO CART button should change to a REMOVE button")
    public void theSauceLabsBackpackADDTOCARTButtonShouldChangeToAREMOVEButton() {
        Assertions.assertTrue(inventoryPage.removeBackpackToCartButtonIsPresent());
    }

    @When("I click the Sauce Labs Bolt T-Shirt ADD TO CART button")
    public void iClickTheSauceLabsBoltTShirtADDTOCARTButton() {
        inventoryPage.clickAddBoltTShirtToCartButton();
    }

    @Then("The Sauce Labs Bolt T-Shirt ADD TO CART button should change to a REMOVE button")
    public void theSauceLabsBoltTShirtADDTOCARTButtonShouldChangeToAREMOVEButton() {
        Assertions.assertTrue(inventoryPage.removeBoltTShirtToCartButtonIsPresent());
    }

    @When("I click the Sauce Labs Onesie ADD TO CART button")
    public void iClickTheSauceLabsOnesieADDTOCARTButton() {
        inventoryPage.clickAddOnesieToCartButton();
    }

    @Then("The Sauce Labs Onesie ADD TO CART button should change to a REMOVE button")
    public void theSauceLabsOnesieADDTOCARTButtonShouldChangeToAREMOVEButton() {
        Assertions.assertTrue(inventoryPage.removeOnesieToCartButtonIsPresent());
    }

    @When("I click the Sauce Labs Bike Light ADD TO CART button")
    public void iClickTheSauceLabsBikeLightADDTOCARTButton() {
        inventoryPage.clickAddBikeLightToCartButton();
    }

    @Then("The Sauce Labs Bike Light ADD TO CART button should change to a REMOVE button")
    public void theSauceLabsBikeLightADDTOCARTButtonShouldChangeToAREMOVEButton() {
        Assertions.assertTrue(inventoryPage.removeBikeLightToCartButtonIsPresent());
    }

    @When("I click the Sauce Labs Fleece Jacket ADD TO CART button")
    public void iClickTheSauceLabsFleeceJacketADDTOCARTButton() {
        inventoryPage.clickAddFleeceJacketToCartButton();
    }

    @Then("The Sauce Labs Fleece Jacket ADD TO CART button should change to a REMOVE button")
    public void theSauceLabsFleeceJacketADDTOCARTButtonShouldChangeToAREMOVEButton() {
        Assertions.assertTrue(inventoryPage.removeFleeceJacketToCartButtonIsPresent());
    }

    @When("I click the Test All The Things T-Shirt ADD TO CART button")
    public void iClickTheTestAllTheThingsTShirtADDTOCARTButton() {
        inventoryPage.clickAddRedTShirtToCartButton();
    }

    @Then("The Test All The Things T-Shirt ADD TO CART button should change to a REMOVE button")
    public void theTestAllTheThingsTShirtADDTOCARTButtonShouldChangeToAREMOVEButton() {
        Assertions.assertTrue(inventoryPage.removeRedTShirtToCartButtonIsPresent());
    }

    @Then("The Sauce Labs Backpack QTY and Description should be added to the cart")
    public void theSauceLabsBackpackQTYAndDescriptionShouldBeAddedToTheCart() {
        Assertions.assertTrue(yourCartPage.backPackIsInCart());
    }

    @Then("The Sauce Bolt T-Shirt QTY and Description should be added to the cart")
    public void theSauceBoltTShirtQTYAndDescriptionShouldBeAddedToTheCart() {
        Assertions.assertTrue(yourCartPage.boltTShirtIsInCart());
    }

    @Then("The Sauce Onesie QTY and Description should be added to the cart")
    public void theSauceOnesieQTYAndDescriptionShouldBeAddedToTheCart() {
        Assertions.assertTrue(yourCartPage.onesieIsInCart());
    }

    @Then("The Sauce Bike Light QTY and Description should be added to the cart")
    public void theSauceBikeLightQTYAndDescriptionShouldBeAddedToTheCart() {
        Assertions.assertTrue(yourCartPage.bikeLightIsInCart());
    }

    @Then("The Sauce Fleece Jacket QTY and Description should be added to the cart")
    public void theSauceFleeceJacketQTYAndDescriptionShouldBeAddedToTheCart() {
        Assertions.assertTrue(yourCartPage.fleeceJacketIsInCart());
    }

    @Then("The Test All The Things T-Shirt QTY and Description should be added to the cart")
    public void theTestAllTheThingsTShirtQTYAndDescriptionShouldBeAddedToTheCart() {
        Assertions.assertTrue(yourCartPage.redTShirtIsInCart());
    }
}
