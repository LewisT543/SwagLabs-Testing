package com.sparta.tests.pom.cucumber.stepdefs;

import com.sparta.tests.pom.pages.InventoryPage;
import com.sparta.tests.pom.pages.LoginPage;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class InventoryStepDefs {

    private WebDriver webDriver;
    private InventoryPage inventoryPage;
    private ChromeDriverService service;

    @Before
    public void init() {
        service = POMUtil.getChromeDriverService("src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver(service);
        inventoryPage = new InventoryPage(webDriver);
    }

    @When("I click on the Backpack ADD TO CART button")
    public void iClickOnTheBackpackADDTOCARTButton() {
        inventoryPage.clickAddBackpackToCart();
    }

    @When("I click on the Bolt T-Shirt ADD TO CART button")
    public void iClickOnTheBoltTShirtADDTOCARTButton() {
        inventoryPage.clickAddBoltTShirtToCartButton();
    }

    @When("I click on the Onesie ADD TO CART button")
    public void iClickOnTheOnesieADDTOCARTButton() {
        inventoryPage.clickAddOnesieToCartButton();
    }

    @When("I click on the Bike Light ADD TO CART button")
    public void iClickOnTheBikeLightADDTOCARTButton() {
        inventoryPage.clickAddBikeLightToCartButton();
    }

    @When("I click on the Fleece Jacket ADD TO CART button")
    public void iClickOnTheFleeceJacketADDTOCARTButton() {
        inventoryPage.clickAddFleeceJacketToCartButton();
    }

    @Then("The Backpack ADD TO CART button should change to REMOVE")
    public void theBackpackADDTOCARTButtonShouldChangeToREMOVE() {
    }

    @Then("The Bolt T-Shirt ADD TO CART button should change to REMOVE")
    public void theBoltTShirtADDTOCARTButtonShouldChangeToREMOVE() {
    }

    @Then("The Onsie ADD TO CART button should change to REMOVE")
    public void theOnsieADDTOCARTButtonShouldChangeToREMOVE() {
    }

    @Then("The Bike Light ADD TO CART button should change to REMOVE")
    public void theBikeLightADDTOCARTButtonShouldChangeToREMOVE() {
    }

    @Then("The Fleece Jacket ADD TO CART button should change to REMOVE")
    public void theFleeceJacketADDTOCARTButtonShouldChangeToREMOVE() {
    }

    @After
    public void teardown() {
        webDriver.close();
        service.stop();
    }
}
