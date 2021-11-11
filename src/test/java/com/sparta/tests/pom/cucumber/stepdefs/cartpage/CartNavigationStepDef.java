package com.sparta.tests.pom.cucumber.stepdefs.cartpage;

import com.sparta.tests.pom.pages.LoginPage;
import com.sparta.tests.pom.pages.ProductsPage;
import com.sparta.tests.pom.pages.YourCartPage;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CartNavigationStepDef {
    private WebDriver webDriver;
    private YourCartPage yourCartPage;
    private ProductsPage productsPage;
    private LoginPage loginPage;

    @Before(order = 1)
    public void init() {
        webDriver = POMUtil.getWebDriver();
        yourCartPage = new YourCartPage(webDriver);
        productsPage = new ProductsPage(webDriver);
        loginPage = new LoginPage(webDriver);
    }

    @Given("I am on the cart page")
    public void iAmOnTheCartPage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickSubmit();

        productsPage.clickCartButton();
    }

    @When("I click on the CONTINUE SHOPPING button")
    public void iClickOnTheCONTINUESHOPPINGButton() {
        yourCartPage.clickContinueShoppingButton();
    }

    @Then("I will go to the Products page")
    public void iWillGoToTheProductsPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", webDriver.getCurrentUrl());
    }

    @When("I click on the CHECKOUT button")
    public void iClickOnTheCHECKOUTButton() {
        yourCartPage.clickCheckoutButton();
    }

    @Then("I will go to the Checkout page")
    public void iWillGoToTheCheckoutPage() {
        Assertions.assertEquals("https://www.saucedemo.com/checkout-step-one.html", webDriver.getCurrentUrl());
    }
}
