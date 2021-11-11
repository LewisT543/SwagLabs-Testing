package com.sparta.tests.pom.cucumber.stepdefs.checkoutoverviewpage;

import com.sparta.tests.pom.pages.*;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutOverviewStepDef {

    private WebDriver webDriver;
    private LoginPage loginPage;
    private ProductsPage productPage;
    private YourCartPage cartPage;
    private CheckoutPage checkoutPage;
    private CheckoutOverviewPage overviewPage;

    @Before(order = 1)
    public void init() {
        webDriver = POMUtil.getWebDriver();
        loginPage = new LoginPage(webDriver);
        productPage = new ProductsPage(webDriver);
        cartPage = new YourCartPage(webDriver);
        checkoutPage = new CheckoutPage(webDriver);
        overviewPage = new CheckoutOverviewPage(webDriver);
    }

    @Given("I am on the Overview page")
    public void iAmOnTheOverviewPage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickSubmit();
        productPage.clickCartButton();
        cartPage.clickCheckoutButton();
        checkoutPage.setFirstName("firstname");
        checkoutPage.setLastName("lastname");
        checkoutPage.setPostcode("postcode");
        checkoutPage.clickContinueButton();
    }

    @Given("I am on the Overview page with all items in cart")
    public void iAmOnTheOverviewPageWithAllItemsInCart() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickSubmit();

        productPage.clickAddBackpackToCart();
        productPage.clickAddBikeLightToCartButton();
        productPage.clickAddBoltTShirtToCartButton();
        productPage.clickAddFleeceJacketToCartButton();
        productPage.clickAddOnesieToCartButton();
        productPage.clickAddRedTShirtToCartButton();

        productPage.clickCartButton();
        cartPage.clickCheckoutButton();

        checkoutPage.setFirstName("firstname");
        checkoutPage.setLastName("lastname");
        checkoutPage.setPostcode("postcode");
        checkoutPage.clickContinueButton();
    }

    @When("I click on the FINISH button")
    public void iClickOnTheFINISHButton() {
        overviewPage.clickFinishButton();
    }

    @Then("I will go the Complete page")
    public void iWillGoTheCompletePage() {
        assertEquals("https://www.saucedemo.com/checkout-complete.html", webDriver.getCurrentUrl());
    }

    @Then("The tax will be eight percent")
    public void theTaxWillBeEightPercent() {
        assertTrue(overviewPage.taxIsEightPercent());
    }

    @Then("The item total will be tax plus item total")
    public void theItemTotalWillBeTaxPlusItemTotal() {
        assertTrue(overviewPage.totalCostIsTaxPlusTotal());
    }
}
