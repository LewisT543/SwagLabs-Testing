package com.sparta.tests.pom.cucumber.stepdefs.loginpage;

import com.sparta.tests.pom.util.DriverFactory;
import com.sparta.tests.pom.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStepDef {

    private WebDriver webDriver;
    private LoginPage loginPage;

    @Before(order = 0)
    public void init() {
        webDriver = DriverFactory.createDriver(DriverFactory.Browsers.CHROME).setHeadless().silentOutput().getDriver();
        webDriver.manage().deleteAllCookies();
        loginPage = new LoginPage(webDriver);
    }

    @Given("I am on the Product page")
    public void iAmOnTheProductPage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickSubmit();
    }

    @When("I enter the username {string}")
    public void iEnterTheUsername(String username) {
        loginPage.setUsername(username);
    }

    @When("I enter the password {string}")
    public void iEnterThePassword(String password) {
        loginPage.setPassword(password);
    }

    @When("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickSubmit();
    }

    @Then("I should see the error {string}")
    public void iShouldSeeTheError(String errorMessage) {
        assertEquals(errorMessage, loginPage.getErrorMessage());
    }

    @After
    public void teardown() {
        DriverFactory.stopDriver();
    }
}
