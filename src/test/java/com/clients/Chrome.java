package com.clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome  {

    public static Chrome instance = new Chrome();
    private WebDriver driver;

    public WebDriver getWebDriver() {
        driver = new ChromeDriver();
        return driver;
    }
}
