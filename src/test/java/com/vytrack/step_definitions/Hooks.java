package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();
    }


    //CUSTOM HOOKS
    //it is related to database for specific scenario that is tagged same annotation, it runs before normal one
    @Before("@db")
    public void setUpDb(){
        System.out.println("\tconnecting to database");
    }


    //it is related to database for specific scenario that is tagged same annotation, it runs after normal one
    @After("@db")
    public void tearDownDb(){
        System.out.println("\tdisconnecting to database");
    }
}
