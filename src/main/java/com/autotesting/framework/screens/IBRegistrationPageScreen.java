package com.autotesting.framework.screens;

import com.autotesting.framework.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class IBRegistrationPageScreen extends IBBaseScreen {

    private static final String BUTTON_REGISTRATION_XPATH = "/html//a/span";

    private static final String LOGIN_PAGE_HEADLINE_XPATH = "//*[@id='signin']//h2";

    private static final String REGISTRATION_PAGE_HEADLINE_XPATH = "//*[@id='step-ver']//h2";
    private static final String REGISTRATION_PAGE_RADIOBUTTON_XPATH = "//*[@id='step-ver']//label[2]/span";
    private static final String REGISTRATION_PAGE_BUTTON_BACK_XPATH = "//*[@id='step-ver']//a";
    private static final String REGISTRATION_PAGE_BUTTON_NEXT_XPATH = "//*[@id='step-ver']//div/input";

    private static final String PAGE_STEP1_HEADLINE_XPATH = "//*[@id='step1']//h2";
    private static final String PAGE_STEP1_BUTTON_BACK_XPATH = "//*[@id='step1']//a";
    private static final String PAGE_STEP1_BUTTON_NEXT_XPATH = "//*[@id='step1']//input";

    private static final String PAGE_STEP2_HEADLINE_XPATH = "//*[//*[@id='step2']//h2";
    private static final String PAGE_STEP2_BUTTON_BACK_XPATH = "//*[@id='step2']//a";
    private static final String PAGE_STEP2_BUTTON_NEXT_XPATH = "//*[@id='step2']//input";

    private static final String PAGE_STEP3_HEADLINE_XPATH = "//*[@id='step3']//h2";
    private static final String PAGE_STEP3_BUTTON_BACK_XPATH = "//*[@id='step3']//a";
    private static final String PAGE_STEP3_BUTTON_NEXT_XPATH = "//*[@id='step3']//input";

    private static final String PAGE_STEP4_HEADLINE_XPATH = "//*[@id='loginForm']//h2";
    private static final String PAGE_STEP4_USERNAME_FIELD_XPATH = "//*[@id='login_id']";
    private static final String PAGE_STEP4_TEXT_ERROR_XPATH = "//*[@id='loginForm']//div[2]/span";
    private static final String PAGE_STEP4_EMPTY_CODE_TEXT_ERROR_XPATH = "//*[@id='loginForm']/div/div/div/div/div/div/div/div[2]/span";
    private static final String PAGE_STEP4_BUTTON_UPDATE_XPATH = "//*[@id='loginForm']//a/img";
    private static final String PAGE_STEP4_IMAGE_XPATH = "//*[@id='captcha']";
    private static final String PAGE_STEP4_BUTTON_CONTINUE_XPATH = "//*[@id='loginForm']/div/div/div/div/input";


    public void clickRegistrationButton() {
        log.info("Клик по кнопке 'РЕГИСТРАЦИЯ'");
        driver.findElement(By.xpath(BUTTON_REGISTRATION_XPATH)).click();
    }

    public void clickRegistrationRadioButton() {
        log.info("Клик по radiobutton на странице 'Регистрация. Выбор версии'");
        driver.findElement(By.xpath(REGISTRATION_PAGE_RADIOBUTTON_XPATH)).click();
    }

    public void clickRegistrationButtonBack() {
        log.info("Клик по кнопке 'НАЗАД' на странице 'Регистрация. Выбор версии'");
        driver.findElement(By.xpath(REGISTRATION_PAGE_BUTTON_BACK_XPATH)).click();
    }

    public void clickRegistrationButtonNext() {
        log.info("Клик по кнопке 'ДАЛЕЕ' на странице 'Регистрация. Выбор версии'");
        driver.findElement(By.xpath(REGISTRATION_PAGE_BUTTON_NEXT_XPATH)).click();
    }

    public void clickRegistrationStep1ButtonBack() {
        log.info("Клик по кнопке 'Я НЕ СОГЛАСЕН (-А)' на странице 'Регистрация. Шаг 1 | Договор'");
        driver.findElement(By.xpath(PAGE_STEP1_BUTTON_BACK_XPATH)).click();
    }

    public void clickRegistrationStep1ButtonNext() {
        log.info("Клик по кнопке 'Я СОГЛАСЕН' на странице 'Регистрация. Шаг 1 | Договор'");
        driver.findElement(By.xpath(PAGE_STEP1_BUTTON_NEXT_XPATH)).click();
    }

    public void clickRegistrationStep2ButtonBack() {
        log.info("Клик по кнопке 'ВЕРНУТЬСЯ' на странице 'Регистрация. Шаг 2 | Безопасность'");
        driver.findElement(By.xpath(PAGE_STEP2_BUTTON_BACK_XPATH)).click();
    }

    public void clickRegistrationStep2ButtonNext() {
        log.info("Клик по кнопке 'Я ОЗНАКОМИЛСЯ (-ЛАСЬ)' на странице 'Регистрация. Шаг 2 | Безопасность'");
        driver.findElement(By.xpath(PAGE_STEP2_BUTTON_NEXT_XPATH)).click();
    }

    public void clickRegistrationStep3ButtonBack() {
        log.info("Клик по кнопке 'ВЕРНУТЬСЯ' на странице 'Регистрация. Шаг 3'");
        driver.findElement(By.xpath(PAGE_STEP3_BUTTON_BACK_XPATH)).click();
    }

    public void clickRegistrationStep3ButtonNext() {
        log.info("Клик по кнопке 'Я ОЗНАКОМИЛСЯ (-ЛАСЬ)' на странице 'Регистрация. Шаг 3'");
        driver.findElement(By.xpath(PAGE_STEP3_BUTTON_NEXT_XPATH)).click();
    }

    public void clickRegistrationStep4ButtonUpdate() {
        log.info("Клик по кнопке 'Обновить' на странице 'Регистрация. Шаг 4 | Выбор имени пользователя'");
        driver.findElement(By.xpath(PAGE_STEP4_BUTTON_UPDATE_XPATH)).click();
    }


    public void clickRegistrationButtonContinue() {
        log.info("Клик по кнопке 'ПРОДОЛЖИТЬ' на странице 'Регистрация. Шаг 4 | Выбор имени пользователя'");
        driver.findElement(By.xpath(PAGE_STEP4_BUTTON_CONTINUE_XPATH)).click();
    }

    public String getHeadlineText() {
        log.info("Получить заголовок на странице 'Регистрация. Выбор версии'");
        return driver.findElement(By.xpath(REGISTRATION_PAGE_HEADLINE_XPATH)).getText();
    }

    public String getHeadlineLoginText() {
        log.info("Получить заголовок на странице 'Вход по логину и паролю'");
        return driver.findElement(By.xpath(LOGIN_PAGE_HEADLINE_XPATH)).getText();
    }

    public boolean getRadioButtonState() {
        log.info("Получить состояние radio button на странице 'Регистрация. Выбор версии'");
        return driver.findElement(By.xpath(REGISTRATION_PAGE_RADIOBUTTON_XPATH)).isEnabled();
    }

    public String getHeadlineStep1Text() {
        log.info("Получить заголовок на странице 'Регистрация. Шаг 1 | Договор'");
        return driver.findElement(By.xpath(PAGE_STEP1_HEADLINE_XPATH)).getText();
    }

    public String getHeadlineStep2Text() {
        log.info("Получить заголовок на странице 'Регистрация. Шаг 2 | Безопасность'");
        return driver.findElement(By.xpath(PAGE_STEP2_HEADLINE_XPATH)).getText();
    }

    public String getHeadlineStep3Text() {
        log.info("Получить заголовок на странице 'Регистрация. Шаг 3'");
        return driver.findElement(By.xpath(PAGE_STEP3_HEADLINE_XPATH)).getText();
    }

    public String getHeadlineStep4Text() {
        log.info("Получить заголовок на странице 'Регистрация. Шаг 4 | Выбор имени пользователя'");
        return driver.findElement(By.xpath(PAGE_STEP4_HEADLINE_XPATH)).getText();
    }

    public String getTextError() {
        log.info("Получить текст ошибки под полем 'Имя пользователя'");
        return driver.findElement(By.xpath(PAGE_STEP4_TEXT_ERROR_XPATH)).getText();
    }

    public String getTextEmptyCodeError() {
        log.info("Получить текст ошибки при пустом коде с картинки");
        return driver.findElement(By.xpath(PAGE_STEP4_EMPTY_CODE_TEXT_ERROR_XPATH)).getText();
    }

    public String getImageStep4Text() {
        log.info("Получить src изображения' на странице 'Регистрация. Шаг 4 | Выбор имени пользователя'");
        return ((JavascriptExecutor)driver).executeScript("return arguments[0].attributes['src'].value;", driver.findElement(By.xpath(PAGE_STEP4_IMAGE_XPATH))).toString();
    }

    public void inputUsername() {
        log.info("Ввод в поле 'Имя пользователя'");
        driver.enterTextByXpath(PAGE_STEP4_USERNAME_FIELD_XPATH, PropertiesReader.getValidUserName());
    }

    public void inputUsernameIsLessThan6Char() {
        log.info("Ввод в поле 'Имя пользователя' менее 6 символов");
        driver.enterTextByXpath(PAGE_STEP4_USERNAME_FIELD_XPATH, PropertiesReader.getUsernameIsLessThan6());
    }

    public void inputUsernameSpecialChar() {
        log.info("Ввод в поле 'Имя пользователя' спец. символы");
        driver.enterTextByXpath(PAGE_STEP4_USERNAME_FIELD_XPATH, PropertiesReader.getSpecialChar());
    }

    public void inputUsernameCyrillicChar() {
        log.info("Ввод в поле 'Имя пользователя' кириллицу");
        driver.enterTextByXpath(PAGE_STEP4_USERNAME_FIELD_XPATH, PropertiesReader.getCyrillicChar());
    }
}
