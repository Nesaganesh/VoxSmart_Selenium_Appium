package com.hooks;

import com.clients.DriverBase;
import com.clients.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class BaseTest extends DriverBase {

    public WebDriver Driver;
    public AndroidDriver AndroidDriver;

    @Before
    public void beforeScenario(){
        try {
            DriverFactory.instance.DriverSetup();

        }catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        Driver = driver();
    }

    @After
    public void afterScenario(){
        DriverFactory.instance.DriverKill();
    }
}
