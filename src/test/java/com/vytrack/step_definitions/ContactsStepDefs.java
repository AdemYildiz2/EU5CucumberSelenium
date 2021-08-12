package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Given("the user logged in as a {string}")
    public void the_user_logged_in_as_a(String userType){
        //go to login page
      Driver.get().get(ConfigurationReader.get("url"));

      //based on input/userType enter that user information
        String username="null";
        String password="null";

        if(userType.equals("driver")){
            username=ConfigurationReader.get("driver_username");
            password=ConfigurationReader.get("driver_password");
        }else if(userType.equals("sales manager")){
            username=ConfigurationReader.get("sales_manager_username");
            password=ConfigurationReader.get("sales_manager_password");
        }else  if(userType.equals("store manager")){
            username=ConfigurationReader.get("store_manager_username");
            password=ConfigurationReader.get("store_manager_password");
        }
        //send username,password and log in
        new LoginPage().login(username,password);
    }

    @Then("the should see following options")
    public void the_should_see_following_options(List<String> menuOptions) {

        System.out.println(menuOptions.size());
        System.out.println(menuOptions);

        //get the list of webElement and convert them to list of string and assert
        //new DashboardPage().menuOptions-->gets list of webElements from page
        //BrowserUtils.getElementsText();--.converts the webElements to string

        List<String> actualOptions=BrowserUtils.getElementsText(new DashboardPage().menuOptions);
        Assert.assertEquals(actualOptions,menuOptions);

    }
    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userInfo) {
        System.out.println(userInfo);
        //use map information to login and also verify firstname and last name
        //1-login with map info
        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));

        //verify first name and last name
        String expectedFullName=userInfo.get("firstname")+" "+userInfo.get("lastname");
        String actualFullName=new DashboardPage().getUserName();

        Assert.assertEquals(actualFullName,expectedFullName);

        System.out.println("actualFullName = " + actualFullName);
        System.out.println("expectedFullName = " + expectedFullName);

    }

}
