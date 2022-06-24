package com.pageobjects;

import com.helper.WaitHelper;
import com.hooks.BaseTest;
import com.pageobjects.helpers.TradeHomePageHelpers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class TradingHomePage {

    private TradeHomePageHelpers tradeHomePageHelpers;
    private WebDriver driver;

    private static String Tree_List_Selector = "[data-qa=\"tree-list__container\"] a";
    private static String Trade_Selector = "li[data-tour='homeScreen'] a";
    private static String Welcome_Seclector = "welcomeText";


//    @FindBy(how = How.CSS, using  ="a.hp-demo-acc-btn")
//    private WebElement TryDemoElement;

    public TradingHomePage(BaseTest baseTest) {
        this.driver = baseTest.Driver;
    }

    public void goToHomePage(String url) throws InterruptedException {
        driver.navigate().to(url);
        // TODO not able to wait until the page loads
        Thread.sleep(5000);
        WaitHelper.waitForElementToBeVisible(driver, By.id(Welcome_Seclector));
        String verifyText = "Access your account dashboard";
        WebElement element =driver.findElement(By.id(Welcome_Seclector));
        System.out.println(element.getText().trim());
        Assert.assertTrue("Text not displayed ", verifyText.trim().equals(element.getText().trim()));

    }

    public void login() throws InterruptedException {
        tradeHomePageHelpers = new TradeHomePageHelpers(driver);
        tradeHomePageHelpers.registerUserAndLogin();
        tradeHomePageHelpers.skipAllTutorials();
    }

    public boolean IsTradeTabEnabled() {

        WebElement tradeElement = driver.findElement(By.cssSelector(Trade_Selector));
        if(tradeElement.getAttribute("class").contains("active")){
            return true;
        }
        return false;
    }

    public boolean isCryptoSelected() {
        AtomicBoolean isSelected = new AtomicBoolean(false);
        WaitHelper.waitForElementToBeVisible(driver, By.cssSelector(Tree_List_Selector));
        List<WebElement> webElements = driver.findElements(By.cssSelector(Tree_List_Selector));
        webElements.forEach((n) -> {
            if(n.getText().equals("Crypto")){
                n.click();
                isSelected.set(true);
            }
        });

        return isSelected.get();
    }
}
