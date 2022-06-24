package com.pageobjects;

import com.helper.WaitHelper;
import com.hooks.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomeScreen {

    private WebDriver driver;
    private AndroidDriver androidDriver;

    private static String Accept_Selector = "com.whatsapp:id/eula_accept";
    private static String Country_Selector = "com.whatsapp:id/registration_country";
    private static String Country_Name_Selector = "com.whatsapp:id/country_first_name";
    private static String Phone_Selector = "com.whatsapp:id/registration_phone";
    private static String Submit_Selector = "com.whatsapp:id/registration_submit";
    private static String Ok_Selector = "android:id/button1";


    public HomeScreen(BaseTest baseTest) {
        this.driver = baseTest.Driver;
        this.androidDriver = baseTest.AndroidDriver;
    }

    // Launch home screen from android apk, close all the allerts
    // accept the terms and condition
    public void launchAppAndSetup() throws InterruptedException{

        Thread.sleep(3000); // only for Emulator
        driver.switchTo().alert().accept();

        By acceptEleBy = By.id(Accept_Selector);
        WaitHelper.waitForElementToBeVisible(driver, acceptEleBy);
        driver.findElement(acceptEleBy).click();

        setupNumber();
    }

    // below method will setup a neew number in whats app on Android device
    private void setupNumber() throws InterruptedException {
        By by = By.id(Country_Selector);
        WaitHelper.waitForElementToBeVisible(driver, by);
        driver.findElement(by).click();

        By countryEleBy = By.id(Country_Name_Selector);
        WaitHelper.waitForElementToBeVisible(driver, countryEleBy);
        List<WebElement> countryElements = driver.findElements(countryEleBy);
        System.out.println(countryElements.size());
        for (WebElement element:countryElements) {

            if(element.getText().equals("United Kingdom")){
                element.click();
                break;
            }
        }

        By phoneEleBy = By.id(Phone_Selector);
        WaitHelper.waitForElementToBeVisible(driver, phoneEleBy);
        driver.findElement(phoneEleBy).sendKeys("7741843819");

        By submitEleBy = By.id(Submit_Selector);
        WaitHelper.waitForElementToBeVisible(driver, submitEleBy);
        driver.findElement(submitEleBy).click();

        By okbutEleBy = By.id(Ok_Selector);
        WaitHelper.waitForElementToBeVisible(driver, okbutEleBy);
        driver.findElement(okbutEleBy).click();

        Thread.sleep(3000); // Just for demo
    }
}
