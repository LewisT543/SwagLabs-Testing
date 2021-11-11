package com.sparta.tests.pom.cucumber.stepdefs.components;

import com.sparta.tests.pom.pages.LoginPage;
import com.sparta.tests.pom.pages.ProductsPage;
import com.sparta.tests.pom.pages.YourCartPage;
import com.sparta.tests.pom.util.POMUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SocialsStepDef {

    private WebDriver webDriver;
    private LoginPage loginPage;
    private ProductsPage productPage;
    private YourCartPage cartPage;

    @Before(order = 1)
    public void init() {
        webDriver = POMUtil.getWebDriver();
        loginPage = new LoginPage(webDriver);
        productPage = new ProductsPage(webDriver);
        cartPage = new YourCartPage(webDriver);
    }

    @When("I go to the bottom of the page")
    public void iGoToTheBottomOfThePage() {
    }

    @Then("I should see a twitter social button")
    public void iShouldSeeATwitterSocialButton() {
    }

    @Then("I should see a facebook social button")
    public void iShouldSeeAFacebookSocialButton() {
    }

    @Then("I should see a linkedin social button")
    public void iShouldSeeALinkedinSocialButton() {
    }

    @When("I click on the twitter social button")
    public void iClickOnTheTwitterSocialButton() {
    }

    @Then("I should be taken to twitter")
    public void iShouldBeTakenToTwitter() {
    }

    @When("I click on the facebook social button")
    public void iClickOnTheFacebookSocialButton() {
    }

    @Then("I should be taken to facebook")
    public void iShouldBeTakenToFacebook() {
    }

    @When("I click on the linkedin social button")
    public void iClickOnTheLinkedinSocialButton() {
    }

    @Then("I should be taken to linkedin")
    public void iShouldBeTakenToLinkedin() {
    }
}
