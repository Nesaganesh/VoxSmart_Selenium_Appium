package com.stepdefinitions;

import com.pageobjects.TradingHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TradingSteps {

    private TradingHomePage homePage;
    private String HomePageUrl = "https://myvip.avatrade.com/?wtrelogin=1";

    public TradingSteps(TradingHomePage homePage) {
        this.homePage = homePage;
    }

    @Given("I navigate to avatrade website")
    public void i_navigate_to_avatrade_website() throws InterruptedException {
        this.homePage.goToHomePage(HomePageUrl);
    }

    @When("Logged in as a registered customer")
    public void logged_in_as_a_registered_customer() throws InterruptedException {
        homePage.login();
    }

    @Then("Select Trade tab on left side")
    public void select_trade_tab_on_left_side() {
        boolean tradeTab = homePage.IsTradeTabEnabled();
        Assert.assertTrue("Trade Tab i not enabled", tradeTab);
    }

    @Given("Scroll down for categories list and select crypto")
    public void scroll_down_for_categories_list_and_select_crypto() {
        Assert.assertTrue("Crypto not Selected", homePage.isCryptoSelected());
    }

    @Then("Select {int} random cryptocurrencies")
    public void select_random_cryptocurrencies(Integer int1) throws Exception {
        throw new Exception("Not implemented");
    }

    @Then("Select the favourites from Trade drop down")
    public void select_the_favourites_from_trade_drop_down() throws Exception {
        throw new Exception("Not implemented");
    }


    @Then("verify the values displayed from the favourites tab")
    public void verify_the_values_displayed_from_the_favourites_tab() throws Exception {
        throw new Exception("Not implemented");
    }

}
