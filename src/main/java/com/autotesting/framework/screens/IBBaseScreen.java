package com.autotesting.framework.screens;

import com.autotesting.framework.utils.WebDriverRunner;
import com.autotesting.framework.utils.WebDriverWrapper;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;

import static com.autotesting.framework.utils.PropertiesReader.getPropertiesReader;

public class IBBaseScreen {

    static final Logger log = Logger.getLogger(WebDriver.class);
    WebDriverWrapper driver = new WebDriverRunner().getDriver();



    public void openPageScreen() {
        try {
            log.info(String.format("Открываем в браузере страницу логина по адресу %s", getPropertiesReader().getCurrentURL()));
            driver.get(getPropertiesReader().getCurrentURL());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mailCloseBrowser()
    {
        WebDriverRunner.closeBrowser();
    }
}

