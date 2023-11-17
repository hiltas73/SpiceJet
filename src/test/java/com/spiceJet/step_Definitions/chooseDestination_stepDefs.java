package com.spiceJet.step_Definitions;

import com.spiceJet.pages.BasePage;
import com.spiceJet.utilities.ConfigurationReader;
import com.spiceJet.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class chooseDestination_stepDefs {

    BasePage basePage = new BasePage();

    @Given("the user navigates to the URL")
    public void the_user_navigates_to_the_url() {
        System.out.println("the user navigates to the URL...");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user selects from {string}")
    public void the_user_selects_from(String locationFrom) {
        basePage.selectFrom(locationFrom);
    }
    @When("the user selects to {string}")
    public void the_user_selects_to(String locationTo) {
        basePage.selectTo(locationTo);
    }
    @When("click on Search Flight")
    public void click_on_search_flight() {
        basePage.calendarFirstDate.click();
        basePage.searchFlightButton.click();
    }
    @Then("the user should see all the flights")
    public void the_user_should_see_all_the_flights() {
        System.out.println("Search Results...");
    }


}
