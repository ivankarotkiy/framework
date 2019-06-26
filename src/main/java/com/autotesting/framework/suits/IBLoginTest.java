package com.autotesting.framework.suits;

import com.autotesting.framework.screens.IBLoginPageScreen;
import org.testng.Assert;
import org.testng.annotations.*;

public class IBLoginTest {

    private static IBLoginPageScreen ibLoginPageScreen;

    @BeforeMethod(description = "Переход на главную страницу авторизации")
    public void openPage() {
        ibLoginPageScreen = new IBLoginPageScreen();
        ibLoginPageScreen.openPageScreen();
    }

    @Test(description = "Тестирование кнопки 'РЕГИСТРАЦИЯ' на главной странице")
    public void ButtonLoginTest() {
        ibLoginPageScreen.clickLoginButton();
        try {
            Assert.assertEquals(ibLoginPageScreen.getHeadlineText(), "Вход по логину и паролю", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'ЗАБЫЛИ ПАРОЛЬ?' на странице 'Вход по логину и паролю'", priority = 1)
    public void ButtonForgotPasswordTest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.clickForgotPasswordButton();
        try {
            Assert.assertEquals(ibLoginPageScreen.getHeadlinePasswordRecoveryText(), "Восстановление пароля", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'РЕГИСТРАЦИЯ' на странице 'Вход по логину и паролю'", priority = 2)
    public void ButtonRegistrationTest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.clickRegistrationButton();
        try {
            Assert.assertEquals(ibLoginPageScreen.getHeadlineRegistrationText(), "Регистрация. Выбор версии", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'Авторизация через ЭЦП' на странице 'Вход по логину и паролю'", priority = 3)
    public void ButtonRegistrationACPTest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.clickRegistrationACPButton();
        try {
            Assert.assertTrue(ibLoginPageScreen.headlineRegistrationACPTIsVisible(), "Заголовок отсутствует");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'Вход по МСИ' на странице 'Вход по МСИ'", priority = 4)
    public void ButtonLoginMSITest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.clickLoginMSIButton();
        try {
            Assert.assertTrue(ibLoginPageScreen.headlineLoginMSIIsVisible(), "Заголовок отсутствует");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование валидной авторизации", priority = 5)
    public void ValidAuthorizationTest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.inputLogin();
        ibLoginPageScreen.inputPassword();
        ibLoginPageScreen.clickButtonLogin();
        try {
            Assert.assertEquals(ibLoginPageScreen.getUserText(), "smirnov_u100508", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование валидного логина и пустого пароля", priority = 6)
    public void ValidLoginAndEmptyPasswordTest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.inputLogin();
        ibLoginPageScreen.clickButtonLogin();
        try {
            Assert.assertEquals(ibLoginPageScreen.getErrorText(), "Введите пароль", "Текст ошибки не совпадает");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование валидного логина и неправильного пароля", priority = 7)
    public void ValidLoginAndWrongPasswordTest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.inputLogin();
        ibLoginPageScreen.inputWrongPassword();
        ibLoginPageScreen.clickButtonLogin();
        try {
            Assert.assertEquals(ibLoginPageScreen.getErrorText(), "Имя пользователя или пароль введены неверно", "Текст ошибки не совпадает");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование пустого логина и валидного пароля", priority = 8)
    public void EmptyLoginAndValidPasswordTest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.inputPassword();
        ibLoginPageScreen.clickButtonLogin();
        try {
            Assert.assertEquals(ibLoginPageScreen.getErrorText(), "Введите имя пользователя", "Текст ошибки не совпадает");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование пустого логина и валидного пароля", priority = 9)
    public void EmptyLoginAndEmptyPasswordTest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.clickButtonLogin();
        try {
            Assert.assertEquals(ibLoginPageScreen.getErrorText(), "Введите имя пользователя", "Текст ошибки не совпадает");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование пустого логина и неправильного пароля", priority = 10)
    public void EmptyLoginAndWrongPasswordTest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.inputWrongPassword();
        ibLoginPageScreen.clickButtonLogin();
        try {
            Assert.assertEquals(ibLoginPageScreen.getErrorText(), "Введите имя пользователя", "Текст ошибки не совпадает");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование неправильного логина и валидного пароля", priority = 11)
    public void WrongLoginAndValidPasswordTest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.inputWrongLogin();
        ibLoginPageScreen.inputPassword();
        ibLoginPageScreen.clickButtonLogin();
        try {
            Assert.assertEquals(ibLoginPageScreen.getErrorText(), "Имя пользователя введено неверно. Для восстановления данных Вы можете обратиться в Контакт-центр по телефону 146. Стоимость услуги составляет 0.50 бел.руб.", "Текст ошибки не совпадает");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование неправильного логина и пустого пароля", priority = 12)
    public void WrongLoginAndEmptyPasswordTest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.inputWrongLogin();
        ibLoginPageScreen.clickButtonLogin();
        try {
            Assert.assertEquals(ibLoginPageScreen.getErrorText(), "Введите пароль", "Текст ошибки не совпадает");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование неправильного логина и неправильного пароля", priority = 13)
    public void WrongLoginAndWrongPasswordTest() {
        ibLoginPageScreen.clickLoginButton();
        ibLoginPageScreen.inputWrongLogin();
        ibLoginPageScreen.inputWrongPassword();
        ibLoginPageScreen.clickButtonLogin();
        try {
            Assert.assertEquals(ibLoginPageScreen.getErrorText(), "Имя пользователя введено неверно. Для восстановления данных Вы можете обратиться в Контакт-центр по телефону 146. Стоимость услуги составляет 0.50 бел.руб.", "Текст ошибки не совпадает");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование появления кода с картинки при трехкратной попытке ввести невалидные данные", priority = 14)
    public void CodeVisibleTest() {
        ibLoginPageScreen.clickLoginButton();
        for (int i = 0; i < 3; i++) {
            ibLoginPageScreen.inputWrongLogin();
            ibLoginPageScreen.inputWrongPassword();
            ibLoginPageScreen.clickButtonLogin();
        }
        try {
            Assert.assertTrue(ibLoginPageScreen.codeImageIsVisible(), "Картинка с кодом отсутствует");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'Обновить' при трехкратной попытке ввести невалидные данные", priority = 15)
    public void ButtonUpdateTest(){
        ibLoginPageScreen.clickLoginButton();
        for (int i = 0; i < 3; i++) {
            ibLoginPageScreen.inputWrongLogin();
            ibLoginPageScreen.inputWrongPassword();
            ibLoginPageScreen.clickButtonLogin();
        }
        String str = ibLoginPageScreen.getCodeImageText();
        ibLoginPageScreen.clickUpdateButton();
        try {
            Assert.assertNotEquals(str, ibLoginPageScreen.getCodeImageText(), "Картинка с кодом не изменилась");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование текста ошибки при вводе букв в поле для кода", priority = 16)
    public void WrongImageCodeErrorTextTest(){
        ibLoginPageScreen.clickLoginButton();
        for (int i = 0; i < 3; i++) {
            ibLoginPageScreen.inputWrongLogin();
            ibLoginPageScreen.inputWrongPassword();
            ibLoginPageScreen.clickButtonLogin();
        }
        ibLoginPageScreen.inputLetters();
        try {
            Assert.assertEquals(ibLoginPageScreen.getImageCodeErrorText(), "Верно заполните поле", "Текст ошибки не совпадает");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @AfterMethod(description = "Выход из браузера. Закрытие драйвера")
    public void closeBrowser(){
        ibLoginPageScreen.mailCloseBrowser();
    }


}