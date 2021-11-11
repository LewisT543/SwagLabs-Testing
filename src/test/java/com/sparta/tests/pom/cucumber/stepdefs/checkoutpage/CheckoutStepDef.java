package com.sparta.tests.pom.cucumber.stepdefs.checkoutpage;

import com.sparta.tests.pom.pages.CheckoutPage;
import com.sparta.tests.pom.pages.LoginPage;
import com.sparta.tests.pom.pages.ProductsPage;
import com.sparta.tests.pom.pages.YourCartPage;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        checkoutPage.setPostcode("postcode");
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
        checkoutPage.setPostcode(postcode);
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

    @When("I enter the firstname {string}")
    public void iEnterTheFirstname(String firstname) {
        checkoutPage.setFirstName(firstname);
    }

    @When("I enter the lastname {string}")
    public void iEnterTheLastname(String lastname) {
        checkoutPage.setLastName(lastname);
    }

    @When("I enter the postcode {string}")
    public void iEnterThePostcode(String postcode) {
        checkoutPage.setPostcode(postcode);
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

    @Then("I should get an error message {string}")
    public void iShouldGetAnErrorMessage(String message) {
        assertEquals(message, checkoutPage.getErrorMessage());
    }

    @Then("I should see an error icon next to the First Name field")
    public void iShouldSeeAnErrorIconNextToTheFirstNameField() {
        assertTrue(checkoutPage.firstNameHasErrorIcon());
    }

    @Then("I should see an error icon next to the Last Name field")
    public void iShouldSeeAnErrorIconNextToTheLastNameField() {
        assertTrue(checkoutPage.lastNameHasErrorIcon());
    }

    @Then("I should see an error icon next to the Postcode field")
    public void iShouldSeeAnErrorIconNextToThePostcodeField() {
        assertTrue(checkoutPage.postcodeHasErrorIcon());
    }
}
