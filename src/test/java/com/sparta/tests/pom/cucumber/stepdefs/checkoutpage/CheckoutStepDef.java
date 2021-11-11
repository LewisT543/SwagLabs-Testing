package com.sparta.tests.pom.cucumber.stepdefs.checkoutpage;

import com.sparta.tests.pom.pages.CheckoutPage;
import com.sparta.tests.pom.pages.LoginPage;
import com.sparta.tests.pom.pages.ProductsPage;
import com.sparta.tests.pom.pages.YourCartPage;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutStepDef {

    private WebDriver webDriver;
    private LoginPage loginPage;
    private ProductsPage productPage;
    private YourCartPage cartPage;
    private CheckoutPage checkoutPage;

    @Before(order = 1)
    public void init() {
        webDriver = POMUtil.getWebDriver();
        loginPage = new LoginPage(webDriver);
        productPage = new ProductsPage(webDriver);
        cartPage = new YourCartPage(webDriver);
        checkoutPage = new CheckoutPage(webDriver);
    }


    @Given("I am on the Checkout page")
    public void iAmOnTheCheckoutPage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickSubmit();
        productPage.clickCartButton();
        cartPage.clickCheckoutButton();
    }

    @Given("I have inputted the correct details")
    public void iHaveInputtedTheCorrectDetails() {
        checkoutPage.setFirstName("firstname");
        checkoutPage.setLastName("lastname");
        checkoutPage.setPostCode("postcode");
    }

    @When("I input {string} into the First Name field")
    public void iInputIntoTheFirstNameField(String firstName) {
        checkoutPage.setFirstName(firstName);
    }

    @When("I input {string} into the Last Name field")
    public void iInputIntoTheLastNameField(String lastName) {
        checkoutPage.setLastName(lastName);
    }

    @When("I input {string} into the Postcode field")
    public void iInputIntoThePostcodeField(String postcode) {
        checkoutPage.setPostCode(postcode);
    }

    @When("I click on the CANCEL button")
    public void iClickOnTheCANCELButton() {
        checkoutPage.clickCancelButton();
    }

    @When("I click on the CONTINUE button")
    public void iClickOnTheCONTINUEButton() {
        checkoutPage.clickContinueButton();
    }

    @When("I click on the cart icon")
    public void iClickOnTheCartIcon() {
        checkoutPage.clickCartButton();
    }

    @Then("I should see {string} in the First Name field")
    public void iShouldSeeInTheFirstNameField(String firstName) {
        assertEquals(firstName, checkoutPage.getFirstName());
    }

    @Then("I should see {string} in the Last Name field")
    public void iShouldSeeInTheLastNameField(String lastName) {
        assertEquals(lastName, checkoutPage.getLastName());
    }

    @Then("I should see {string} in the Postcode field")
    public void iShouldSeeInThePostcodeField(String postcode) {
        assertEquals(postcode, checkoutPage.getPostcode());
    }

    @Then("I will go the Overview page")
    public void iWillGoTheOverviewPage() {
        assertEquals("https://www.saucedemo.com/checkout-step-two.html", webDriver.getCurrentUrl());
    }

    @Then("I will go to the Cart page")
    public void iWillGoToTheCartPage() {
        assertEquals("https://www.saucedemo.com/cart.html", webDriver.getCurrentUrl());
    }
}
