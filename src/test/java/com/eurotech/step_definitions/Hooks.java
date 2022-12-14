package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("\tThis is coming from Before method");
    }

    @After
    public void tearDown(){

        System.out.println("\tThis is coming from After Method");
        //Driver.closeDriver();
    }

    @Before("@db")
    public void setupDb(){
        System.out.println("\tConnecting DB");
    }

    @After("@db")
    public void CloseDB(){
        System.out.println("\t Disconnecting DB");
    }
}
