package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        System.out.println("the user navigates to Marketing, Campaigns");
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

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tap, String module) {
        BrowserUtils.waitFor(4);
        new DashboardPage().navigateToModule(tap,module);

    }
    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedNumber) {
        BrowserUtils.waitFor(5);
        ContactsPage contactsPage=new ContactsPage();
       Integer actualNumber=Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedNumber,actualNumber);


    }

}
