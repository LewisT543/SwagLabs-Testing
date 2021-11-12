package com.sparta.tests.pom.cucumber.stepdefs.productpage;

import com.sparta.tests.pom.pages.ProductsPage;
import com.sparta.tests.pom.pages.YourCartPage;
import com.sparta.tests.pom.util.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AddProductStepDef {

    private WebDriver webDriver;
    private ProductsPage productsPage;
    private YourCartPage yourCartPage;

    @Before(order = 1)
    public void init() {
        webDriver = DriverFactory.getDriver();
        productsPage = new ProductsPage(webDriver);
        yourCartPage = new YourCartPage(webDriver);
    }

    @When("I click the Sauce Labs Backpack ADD TO CART button")
    public void iClickTheSauceLabsBackpackADDTOCARTButton() {
        productsPage.clickAddBackpackToCart();
    }

    @Then("The Sauce Labs Backpack ADD TO CART button should change to a REMOVE button")
    public void theSauceLabsBackpackADDTOCARTButtonShouldChangeToAREMOVEButton() {
        Assertions.assertTrue(productsPage.removeBackpackFromCartButtonIsPresent());
    }

    @When("I click the Sauce Labs Bolt T-Shirt ADD TO CART button")
    public void iClickTheSauceLabsBoltTShirtADDTOCARTButton() {
        productsPage.clickAddBoltTShirtToCartButton();
    }

    @Then("The Sauce Labs Bolt T-Shirt ADD TO CART button should change to a REMOVE button")
    public void theSauceLabsBoltTShirtADDTOCARTButtonShouldChangeToAREMOVEButton() {
        Assertions.assertTrue(productsPage.removeBoltTShirtFromCartButtonIsPresent());
    }

    @When("I click the Sauce Labs Onesie ADD TO CART button")
    public void iClickTheSauceLabsOnesieADDTOCARTButton() {
        productsPage.clickAddOnesieToCartButton();
    }

    @Then("The Sauce Labs Onesie ADD TO CART button should change to a REMOVE button")
    public void theSauceLabsOnesieADDTOCARTButtonShouldChangeToAREMOVEButton() {
        Assertions.assertTrue(productsPage.removeOnesieFromCartButtonIsPresent());
    }

    @When("I click the Sauce Labs Bike Light ADD TO CART button")
    public void iClickTheSauceLabsBikeLightADDTOCARTButton() {
        productsPage.clickAddBikeLightToCartButton();
    }

    @Then("The Sauce Labs Bike Light ADD TO CART button should change to a REMOVE button")
    public void theSauceLabsBikeLightADDTOCARTButtonShouldChangeToAREMOVEButton() {
        Assertions.assertTrue(productsPage.removeBikeLightFromCartButtonIsPresent());
    }

    @When("I click the Sauce Labs Fleece Jacket ADD TO CART button")
    public void iClickTheSauceLabsFleeceJacketADDTOCARTButton() {
        productsPage.clickAddFleeceJacketToCartButton();
    }

    @Then("The Sauce Labs Fleece Jacket ADD TO CART button should change to a REMOVE button")
    public void theSauceLabsFleeceJacketADDTOCARTButtonShouldChangeToAREMOVEButton() {
        Assertions.assertTrue(productsPage.removeFleeceJacketFromCartButtonIsPresent());
    }

    @When("I click the Test All The Things T-Shirt ADD TO CART button")
    public void iClickTheTestAllTheThingsTShirtADDTOCARTButton() {
        productsPage.clickAddRedTShirtToCartButton();
    }

    @Then("The Test All The Things T-Shirt ADD TO CART button should change to a REMOVE button")
    public void theTestAllTheThingsTShirtADDTOCARTButtonShouldChangeToAREMOVEButton() {
        Assertions.assertTrue(productsPage.removeRedTShirtFromCartButtonIsPresent());
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

    @Then("The cart icon should increment once")
    public void theCartIconShouldIncrementOnce() {
        Assertions.assertTrue(productsPage.getCartBadgeNumber() > 0);
    }

    @When("I click all the ADD TO CART buttons")
    public void iClickAllTheADDTOCARTButtons() {
        productsPage.clickAddBackpackToCart();
        productsPage.clickAddBoltTShirtToCartButton();
        productsPage.clickAddOnesieToCartButton();
        productsPage.clickAddBikeLightToCartButton();
        productsPage.clickAddFleeceJacketToCartButton();
        productsPage.clickAddRedTShirtToCartButton();
    }

    @Then("The cart badge should be six")
    public void theCartBadgeShouldBeSix() {
        Assertions.assertEquals(6, productsPage.getCartBadgeNumber());
    }
}
