package com.stepdefinitions;

import com.pageobjects.HomeScreen;
import io.cucumber.java.en.Given;

public class WhatsAppSteps {

    private HomeScreen homeScreen;

    public WhatsAppSteps(HomeScreen homeScreen) {
        this.homeScreen = homeScreen;
    }

    @Given("I launch whatsapp from a device or emulator")
    public void i_launch_whatsapp_from_a_device_or_emulator() throws InterruptedException {
       homeScreen.launchAppAndSetup();
    }


}
