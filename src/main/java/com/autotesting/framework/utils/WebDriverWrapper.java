package com.autotesting.framework.utils;

import com.autotesting.framework.screens.IBBaseScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;

public class WebDriverWrapper extends ChromeDriver{

    private static final int TIMEOUT_FOR_ACTION_SECONDS = 15;
    private final Logger log = Logger.getLogger(IBBaseScreen.class);


    public void enterTextByXpath(String xpath, String text) {
        log.info(String.format("[ACTION]: Ввод текста '%s' в элемент: '%s'", text, xpath));
        waitForElementPresentAndVisible(xpath);
        findElement(By.xpath(xpath)).sendKeys(text);
    }

    private void waitForElementPresentAndVisible(String locator) {
        WebDriverWait wait = new WebDriverWait(this, WebDriverWrapper.TIMEOUT_FOR_ACTION_SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

}
