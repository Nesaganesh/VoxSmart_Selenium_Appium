package com.clients;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public enum Clients {
        CHROME,
        ANDROID,
        IOS
    }

    // TODO: Move this in config file, change this to ANDROID to run on android emulator
    public static Clients client = Clients.ANDROID;

    public static DriverFactory instance = new DriverFactory();
    public WebDriver driver;

    public void DriverSetup() throws Exception {
        if (driver != null) {
            return;
        }

        // Either we cam do in Switch loop or in if else
        if(client == Clients.CHROME) {

            driver = Chrome.instance.getWebDriver();
            driver.manage().window().maximize();
        }

        else if(client == Clients.ANDROID) {
            driver = AndroidNative.instance.getWebDriver();
        }

        else if(client == Clients.IOS) {
            // TODO: write caps and create driver
        }
        else {
            throw new Exception("Client not able to define ");
        }
    }

    public void DriverKill() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
