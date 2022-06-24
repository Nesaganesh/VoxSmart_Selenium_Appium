package com.clients;

import org.openqa.selenium.WebDriver;

public abstract class DriverBase {

    protected WebDriver driver() {
        return DriverFactory.instance.driver;
    }
}