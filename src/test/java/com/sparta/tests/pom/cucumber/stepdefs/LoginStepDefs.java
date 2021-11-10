package com.sparta.tests.pom.cucumber.stepdefs;

import com.sparta.tests.pom.cucumber.utl.POMUtil;
import com.sparta.tests.pom.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStepDefs {

    private WebDriver webDriver;
    private LoginPage loginPage;
    private ChromeDriverService service;

    @Before
    public void init() {
        service = POMUtil.getChromeDriverService("src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver(service);
        loginPage = new LoginPage(webDriver);
    }

    @Given("I am on the Inventory page")
    public void iAmOnTheInventoryPage() {
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

    @Then("I should be on the inventory page")
    public void iShouldBeOnTheInventoryPage() {
        assertEquals("https://www.saucedemo.com/inventory.html", webDriver.getCurrentUrl());
    }

    @After
    public void teardown() {
        webDriver.close();
        service.stop();
    }
}
