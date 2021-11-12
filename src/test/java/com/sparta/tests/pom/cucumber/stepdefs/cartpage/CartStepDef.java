package com.sparta.tests.pom.cucumber.stepdefs.cartpage;

import com.sparta.tests.pom.pages.LoginPage;
import com.sparta.tests.pom.pages.ProductsPage;
import com.sparta.tests.pom.pages.YourCartPage;
import com.sparta.tests.pom.util.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CartStepDef {
    private WebDriver webDriver;
    private YourCartPage yourCartPage;
    private ProductsPage productsPage;
    private LoginPage loginPage;

    @Before(order = 1)
    public void init() {
        webDriver = DriverFactory.getDriver();
        yourCartPage = new YourCartPage(webDriver);
        productsPage = new ProductsPage(webDriver);
        loginPage = new LoginPage(webDriver);
    }

    @And("All the products have been added to the cart")
    public void allTheProductsHaveBeenAddedToTheCart() {
        productsPage.clickAddBackpackToCart();
        productsPage.clickAddBikeLightToCartButton();
        productsPage.clickAddBoltTShirtToCartButton();
        productsPage.clickAddFleeceJacketToCartButton();
        productsPage.clickAddOnesieToCartButton();
        productsPage.clickAddRedTShirtToCartButton();

        productsPage.clickCartButton();
    }

    @When("I click on the Backpack REMOVE button")
    public void iClickOnTheBackpackREMOVEButton() {
        yourCartPage.clickRemoveBackpackToCart();
    }

    @Then("The Backpack should be removed from the CART")
    public void theBackpackShouldBeRemovedFromTheCART() {
        Assertions.assertFalse(yourCartPage.backPackIsInCart());
    }

    @When("I click on the Bolt T-Shirt REMOVE button")
    public void iClickOnTheBoltTShirtREMOVEButton() {
        yourCartPage.clickRemoveBoltTShirtToCartButton();
    }

    @Then("The Bolt T-Shirt ADD TO CART should be removed from the CART")
    public void theBoltTShirtADDTOCARTShouldBeRemovedFromTheCART() {
        Assertions.assertFalse(yourCartPage.boltTShirtIsInCart());
    }

    @When("I click on the Onesie REMOVE button")
    public void iClickOnTheOnesieREMOVEButton() {
        yourCartPage.clickRemoveOnesieToCartButton();
    }

    @Then("The Onesie should be removed from the CART")
    public void theOnesieShouldBeRemovedFromTheCART() {
        Assertions.assertFalse(yourCartPage.onesieIsInCart());
    }

    @When("I click on the Bike Light REMOVE button")
    public void iClickOnTheBikeLightREMOVEButton() {
        yourCartPage.clickRemoveBikeLightToCartButton();
    }

    @Then("The Bike Light should be removed from the CART")
    public void theBikeLightShouldBeRemovedFromTheCART() {
        Assertions.assertFalse(yourCartPage.bikeLightIsInCart());
    }

    @When("I click on the Fleece Jacket REMOVE button")
    public void iClickOnTheFleeceJacketREMOVEButton() {
        yourCartPage.clickRemoveFleeceJacketToCartButton();
    }

    @Then("The Fleece Jacket should be removed from the CART")
    public void theFleeceJacketShouldBeRemovedFromTheCART() {
        Assertions.assertFalse(yourCartPage.fleeceJacketIsInCart());
    }

    @When("I click on the test all things T-Shirt REMOVE button")
    public void iClickOnTheTestAllThingsTShirtREMOVEButton() {
        yourCartPage.clickRemoveRedTShirtToCartButton();
    }

    @Then("The test all things T-Shirt should be removed from the CART")
    public void theTestAllThingsTShirtShouldBeRemovedFromTheCART() {
        Assertions.assertFalse(yourCartPage.redTShirtIsInCart());
    }
}
