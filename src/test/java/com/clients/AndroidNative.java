package com.clients;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidNative  {

    // TODO If want to execute in BrowserStack
    //private String App_From_BrowserStack_Path = "bs://6da2ba522d795b91b3e3cbc40b035ab31c62f309";
    //private static String Grid_Url = "https://XXXX:XXXX@hub-cloud.browserstack.com/wd/hub/";


    private String App_From_Local_Path = "/Users/nesag/Documents/Working/VoxSmartTest/WhatsApp.apk";
    private static String Grid_Url = "http://192.168.0.12:4724/wd/hub";

    public static AndroidNative instance = new AndroidNative();
    private WebDriver driver;
    public AndroidDriver AndroidDriver;

    public AndroidNative() {
    }

    public WebDriver getWebDriver() {

        try {

            URL remoteAddress = new URL(Grid_Url);

            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("appiumVersion", "1.22.0");
            capabilities.setCapability("realMobile", true);
            capabilities.setCapability("deviceOrientation", "portrait");
            capabilities.setCapability("acceptInsecureCerts", true);
            capabilities.setCapability("osVersion", "11.0");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("appPackage", "com.whatsapp");
            capabilities.setCapability("appActivity","com.whatsapp.Main");
            capabilities.setCapability("autoAcceptAlerts", true);

            // TODO If want to execute in BrowserStack
            //capabilities.setCapability("deviceName", "Google Pixel 4");
            //capabilities.setCapability("app",App_From_BrowserStack_Path);

            capabilities.setCapability("deviceName", "emulator-555");
            capabilities.setCapability("app",App_From_Local_Path);

            driver = AndroidDriver = new AndroidDriver(remoteAddress, capabilities);

        }
        catch (MalformedURLException exception) {
            exception.getMessage();
        }
        return driver;
    }
}
