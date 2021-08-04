package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
    }

    @After
    public void tearDown(){
        System.out.println("\tthis is coming from AFTER");
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
