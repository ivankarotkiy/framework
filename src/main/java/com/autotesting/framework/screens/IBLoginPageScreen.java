package com.autotesting.framework.screens;

import com.autotesting.framework.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class IBLoginPageScreen extends IBBaseScreen {

    private static final String BUTTON_LOGIN_XPATH = "//main//a";

    private static final String LOGIN_PAGE_HEADLINE_XPATH = "//*[@id='signin']//h2";
    private static final String LOGIN_PAGE_ERROR_TEXT_XPATH = "//*[@id='signin']/div/div/div";
    private static final String LOGIN_FIELD_XPATH = "//*[@id='login_id']";
    private static final String PASSWORD_FIELD_XPATH = "//*[@id='pass']";
    private static final String CODE_IMAGE_XPATH = "//*[@id='captcha']";
    private static final String BUTTON_UPDATE_XPATH = "//*[@id='signin']//a/img";
    private static final String IMAGE_CODE_FIELD_XPATH = "//*[@id='keystr_id']";
    private static final String IMAGE_CODE_FIELD_MESSAGE_ERROR_XPATH = "//*[@id='signin']//div[3]//div[2]/span";
    private static final String LOGIN_PAGE_BUTTON_LOGIN_XPATH = "//*[@id='signin']/div/div/div/div/input";
    private static final String LOGIN_PAGE_BUTTON_FORGOT_PASSWORD_XPATH = "//*[@id='signin']//a";
    private static final String LOGIN_PAGE_BUTTON_REGISTRATION_XPATH = "//*[@id='signin']//a[2]";
    private static final String LOGIN_PAGE_BUTTON_REGISTRATION_ACP_XPATH = "//div/div/div/section/div";
    private static final String LOGIN_PAGE_BUTTON_LOGIN_MSI_XPATH = "//section[3]/div";

    private static final String PASSWORD_RECOVERY_PAGE_HEADLINE_XPATH = "//*[@id='recoverForm']//h2";

    private static final String REGISTRATION_PAGE_HEADLINE_XPATH = "//*[@id='step-ver']//h2";

    private static final String FINAL_PAGE_USER_TEXT_XPATH = "//div[3]/div/span";


    public void clickLoginButton() {
        log.info("Клик по кнопке 'ВОЙТИ' на главной странице");
        driver.findElement(By.xpath(BUTTON_LOGIN_XPATH)).click();
    }

    public void clickForgotPasswordButton() {
        log.info("Клик по кнопке 'ЗАБЫЛИ ПАРОЛЬ?' на странице 'Вход по логину и паролю'");
        driver.findElement(By.xpath(LOGIN_PAGE_BUTTON_FORGOT_PASSWORD_XPATH)).click();
    }

    public void clickRegistrationButton() {
        log.info("Клик по кнопке 'РЕГИСТРАЦИЯ' на странице 'Вход по логину и паролю'");
        driver.findElement(By.xpath(LOGIN_PAGE_BUTTON_REGISTRATION_XPATH)).click();
    }

    public void clickRegistrationACPButton() {
        log.info("Клик по кнопке 'Авторизация через ЭЦП' на странице 'Вход по логину и паролю'");
        driver.findElement(By.xpath(LOGIN_PAGE_BUTTON_REGISTRATION_ACP_XPATH)).click();
    }

    public void clickLoginMSIButton() {
        log.info("Клик по кнопке 'Вход по МСИ' на странице 'Вход по логину и паролю'");
        driver.findElement(By.xpath(LOGIN_PAGE_BUTTON_LOGIN_MSI_XPATH)).click();
    }

    public void clickButtonLogin() {
        log.info("Клик по кнопке 'ВОЙТИ' на странице 'Вход по логину и паролю'");
        driver.findElement(By.xpath(LOGIN_PAGE_BUTTON_LOGIN_XPATH)).click();
    }

    public void clickUpdateButton() {
        log.info("Клик по кнопке 'Обновить' на странице 'Вход по логину и паролю'");
        driver.findElement(By.xpath(BUTTON_UPDATE_XPATH)).click();
    }

    public String getHeadlineText() {
        log.info("Получить заголовок на странице 'Вход по логину и паролю'");
        return driver.findElement(By.xpath(LOGIN_PAGE_HEADLINE_XPATH)).getText();
    }

    public String getHeadlinePasswordRecoveryText() {
        log.info("Получить заголовок на странице 'Восстановление пароля'");
        return driver.findElement(By.xpath(PASSWORD_RECOVERY_PAGE_HEADLINE_XPATH)).getText();
    }

    public String getHeadlineRegistrationText() {
        log.info("Получить заголовок на странице 'Регистрация. Выбор версии'");
        return driver.findElement(By.xpath(REGISTRATION_PAGE_HEADLINE_XPATH)).getText();
    }

    public String getUserText() {
        log.info("Получить имя пользователя на финальной странице");
        return driver.findElement(By.xpath(FINAL_PAGE_USER_TEXT_XPATH)).getText();
    }

    public String getErrorText() {
        log.info("Получить сообщение об ошибке на странице 'Вход по логину и паролю'");
        return driver.findElement(By.xpath(LOGIN_PAGE_ERROR_TEXT_XPATH)).getText();
    }

    public String getImageCodeErrorText() {
        log.info("Получить сообщение об ошибке под полем для ввода кода с картинки странице 'Вход по логину и паролю'");
        return driver.findElement(By.xpath(IMAGE_CODE_FIELD_MESSAGE_ERROR_XPATH)).getText();
    }

    public void inputLogin() {
        log.info("Ввод логина");
        driver.enterTextByXpath(LOGIN_FIELD_XPATH, PropertiesReader.getLogin());
    }

    public void inputWrongLogin() {
        log.info("Ввод неправильного логина");
        driver.enterTextByXpath(LOGIN_FIELD_XPATH, PropertiesReader.getWrongLogin());
    }

    public void inputPassword() {
        log.info("Ввод пароля");
        driver.enterTextByXpath(PASSWORD_FIELD_XPATH, PropertiesReader.getPassword());
    }

    public void inputWrongPassword() {
        log.info("Ввод неправильного пароля");
        driver.enterTextByXpath(PASSWORD_FIELD_XPATH, PropertiesReader.getWrongPassword());
    }

    public void inputLetters() {
        log.info("Ввод букв в поле для кода с картинки");
        driver.enterTextByXpath(IMAGE_CODE_FIELD_XPATH, "qwerty");
    }

    public boolean codeImageIsVisible() {
        log.info("Проверка наличия изображения с кодом");
        return driver.findElements(By.xpath(CODE_IMAGE_XPATH)).size() > 0;
    }

    public String getCodeImageText() {
        log.info("Получить src изображения'");
        return ((JavascriptExecutor)driver).executeScript("return arguments[0].attributes['src'].value;", driver.findElement(By.xpath(CODE_IMAGE_XPATH))).toString();
    }

    public boolean headlineRegistrationACPTIsVisible() {
        log.info("Проверка наличия заголовка на странице 'Авторизация через ЭЦП'");
        return driver.findElements(By.xpath(LOGIN_PAGE_BUTTON_REGISTRATION_ACP_XPATH)).size() > 0;
    }

    public boolean headlineLoginMSIIsVisible() {
        log.info("Проверка наличия заголовка на странице 'Вход по МСИ'");
        return driver.findElements(By.xpath(LOGIN_PAGE_BUTTON_LOGIN_MSI_XPATH)).size() > 0;
    }
}