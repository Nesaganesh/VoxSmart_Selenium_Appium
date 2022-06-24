package com.pageobjects.helpers;

import com.helper.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class TradeHomePageHelpers {

    private WebDriver driver;

    public TradeHomePageHelpers(WebDriver driver) {
        this.driver = driver;
    }

    private static String Tree_List_Selector = "[data-qa='iframe__wrapper'] iframe";

    private static String Green_Btn_Wait_Selector = "div.overflow-y-auto [id='mainWrapper'] button.btn-green";
    private static String Green_Btn_Selector = "[id='mainWrapper']  button.btn-green";

    private static String Popup_Seclector = "*[data-key='tourPopupButtonSkip']";

    private static String TryDemo_Selector = "a.hp-demo-acc-btn";
    private static String Name_Selector = "name";
    private static String LastName_Selector = "lastName";
    private static String Email_Selector = "email";
    private static String Phone_Selector = "phoneInput";
    private static String Accept_Selector = "label.imglabel[for='GDPR']";
    private static String Ceate_Acc_Selector = "avaWidgetSubmit";

    public void skipAllTutorials() {
        try{

            WaitHelper.waitForElementToBeVisible(driver, By.cssSelector(Tree_List_Selector));
            WebElement frameElement = driver.findElement(By.cssSelector(Tree_List_Selector));
            driver.switchTo().frame(frameElement);

            WaitHelper.waitForElementToBeVisible(driver, By.cssSelector(Green_Btn_Wait_Selector));
            WebElement closeFrame = driver.findElement(By.cssSelector(Green_Btn_Selector));
            closeFrame.click();
            driver.switchTo().defaultContent();


            WaitHelper.waitForElementToBeVisible(driver, By.cssSelector(Popup_Seclector));
            WebElement tutorial = driver.findElement(By.cssSelector(Popup_Seclector));
            tutorial.click();

        }catch(Exception exception){
            System.out.println("Tutorial element not able to close");
        }
    }

    public void registerUserAndLogin() throws InterruptedException {

        WaitHelper.waitForElementToBeVisible(driver, By.cssSelector(TryDemo_Selector));
        WebElement tryDemo = driver.findElement(By.cssSelector(TryDemo_Selector));
        tryDemo.click();

        WaitHelper.waitForElementToBeVisible(driver, By.id(Name_Selector));
        WebElement firstName = driver.findElement(By.id(Name_Selector));
        firstName.sendKeys("Test 1");

        WebElement lastName = driver.findElement(By.id(LastName_Selector));
        lastName.sendKeys("Last 1");

        WebElement email = driver.findElement(By.id(Email_Selector));
        Random rand = new Random();
        int randomNumber = rand.nextInt(50);
        email.sendKeys("nesaTest"+randomNumber+"@gmail.com");

        WebElement phoneNumber = driver.findElement(By.id(Phone_Selector));
        phoneNumber.sendKeys("7741843819");

        WebElement accept2 = driver.findElement(By.cssSelector(Accept_Selector));accept2.click();

        //TODO: PRESS AND HOLD button enables wihtout this wait
        Thread.sleep(70000);

        WebElement createAccBtn = driver.findElement(By.id(Ceate_Acc_Selector));createAccBtn.click();
    }
}
