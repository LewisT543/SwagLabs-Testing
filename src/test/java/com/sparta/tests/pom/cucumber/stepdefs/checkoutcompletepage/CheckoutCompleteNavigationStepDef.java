package com.sparta.tests.pom.cucumber.stepdefs.checkoutcompletepage;

import com.sparta.tests.pom.pages.*;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CheckoutCompleteNavigationStepDef {
    private WebDriver webDriver;
    private YourCartPage yourCartPage;
    private ProductsPage productsPage;
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;
    private CheckoutOverviewPage checkoutOverviewPage;
    private CheckoutCompletePage checkoutCompletePage;

    @Before(order = 1)
    public void init() {
        webDriver = POMUtil.getWebDriver();
        yourCartPage = new YourCartPage(webDriver);
        productsPage = new ProductsPage(webDriver);
        loginPage = new LoginPage(webDriver);
        checkoutPage = new CheckoutPage(webDriver);
        checkoutOverviewPage = new CheckoutOverviewPage(webDriver);
        checkoutCompletePage = new CheckoutCompletePage(webDriver);
    }
    @Given("I am on the Checkout Complete page")
    public void iAmOnTheCheckoutCompletePage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickSubmit();

        productsPage.clickCartButton();
        yourCartPage.clickCheckoutButton();

        checkoutPage.setFirstName("a");
        checkoutPage.setLastName("a");
        checkoutPage.setPostcode("a");

        checkoutPage.clickContinueButton();
        checkoutOverviewPage.clickFinishButton();
    }

    @When("I click on the BACK HOME button")
    public void iClickOnTheBACKHOMEButton() {
        checkoutCompletePage.clickBackToHomeButton();
    }
}
