package com.sparta.tests.pom.cucumber.stepdefs.productpage;

import com.sparta.tests.pom.pages.ProductsPage;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class ProductRemoveStepDef {

    private WebDriver webDriver;
    private ProductsPage productsPage;

    @Before(order = 1)
    public void init() {
        webDriver = POMUtil.getWebDriver();
        productsPage = new ProductsPage(webDriver);
    }

    @Given("The cart is full")
    public void theCartIsFull() {
        productsPage.clickAddBackpackToCart();
        productsPage.clickAddBoltTShirtToCartButton();
        productsPage.clickAddOnesieToCartButton();
        productsPage.clickAddBikeLightToCartButton();
        productsPage.clickAddFleeceJacketToCartButton();
        productsPage.clickAddRedTShirtToCartButton();
    }

    @When("I click a REMOVE button")
    public void iClickAREMOVEButton() {
        Random rand = new Random();
        int n = rand.nextInt(5) + 1;
        switch (n) {
            case 1 -> productsPage.clickRemoveBackpackFromCart();
            case 2 -> productsPage.clickRemoveBoltTShirtFromCart();
            case 3 -> productsPage.clickRemoveOnesieFromCart();
            case 4 -> productsPage.clickRemoveBikeLightFromCart();
            case 5 -> productsPage.clickRemoveFleeceJacketFromCart();
            case 6 -> productsPage.clickRemoveRedTShirtFromCart();
        }
    }

    @Then("The cart badge should be five")
    public void theCartBadgeShouldBeFive() {
        Assertions.assertEquals(5,productsPage.getCartBadgeNumber());
    }

    @When("I click the Sauce Labs Backpack REMOVE button")
    public void iClickTheSauceLabsBackpackREMOVEButton() {
        productsPage.clickRemoveBackpackFromCart();
    }

    @Then("The Sauce Labs Backpack REMOVE button should change to a ADD TO CART button")
    public void theSauceLabsBackpackREMOVEButtonShouldChangeToAADDTOCARTButton() {
        Assertions.assertTrue(productsPage.addBackpackToCartButtonIsPresent());
    }
}
