package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {
    @When("the user navigates to Fleet, Vehicle")
    public void the_user_navigates_to_Fleet_Vehicle() {
        // selenium code
        System.out.println("the user navigates to Fleet, Vehicle");
    }

    @Then("title should be Vehicles")
    public void title_should_be_Vehicles() {
        System.out.println("title should be Vehicles");
    }

    @When("the user navigates to Marketin, Campaigns")
    public void the_user_navigates_to_Marketin_Campaigns() {
        System.out.println("the user navigates to Marketin, Campaigns");
    }

    @Then("title should be Campaigns")
    public void title_should_be_Campaigns() {
        System.out.println("title should be Campaigns");
    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("the user navigates to Activities, Calendar Events");
    }

    @Then("title should be Calendars")
    public void title_should_be_Calendars() {
        System.out.println("title should be Calendars");
    }

}
