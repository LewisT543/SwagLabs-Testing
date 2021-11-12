package com.sparta.tests.pom.cucumber.stepdefs.productpage;

import com.sparta.tests.pom.pages.ProductsPage;
import com.sparta.tests.pom.util.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class SortProductsStepDef {

    private WebDriver webDriver;
    private ProductsPage productsPage;

    @Before(order = 1)
    public void init() {
        webDriver = DriverFactory.getDriver();
        productsPage = new ProductsPage(webDriver);
    }

    @Given("The SORT drop down list is expanded")
    public void theSORTDropDownListIsExpanded() {
        productsPage.clickProductSortButton();
    }

    @When("I click Name A TO Z")
    public void iClickNameATOZ() {
        productsPage.clickProductSortNameAZ();
    }

    @Then("The items will be ordered in ascending alphabetical order")
    public void theItemsWillBeOrderedInAscendingAlphabeticalOrder() {
        Assertions.assertTrue(productsPage.itemsAreSortedNameAZ());
    }

    @When("I click Name Z to A")
    public void iClickNameZToA() {
        productsPage.clickProductSortNameZA();
    }

    @Then("The items will be ordered in descending alphabetical order")
    public void theItemsWillBeOrderedInDescendingAlphabeticalOrder() {
        Assertions.assertTrue(productsPage.itemsAreSortedNameZA());
    }

    @When("I click Price low to high")
    public void iClickPriceLowToHigh() {
        productsPage.clickProductSortPriceLH();
    }

    @Then("The items will be ordered in ascending price order")
    public void theItemsWillBeOrderedInAscendingPriceOrder() {
        Assertions.assertTrue(productsPage.itemsAreSortedPriceLH());
    }

    @When("I click Price high to low")
    public void iClickPriceHighToLow() {
        productsPage.clickProductSortPriceHL();
    }

    @Then("The items will be ordered in descending price order")
    public void theItemsWillBeOrderedInDescendingPriceOrder() {
        Assertions.assertTrue(productsPage.itemsAreSortedPriceHL());
    }
}
