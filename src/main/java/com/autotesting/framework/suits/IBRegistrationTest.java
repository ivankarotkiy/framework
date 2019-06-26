package com.autotesting.framework.suits;

import com.autotesting.framework.screens.IBRegistrationPageScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class IBRegistrationTest {

    private static IBRegistrationPageScreen ibRegistrationPageScreen;

    @BeforeMethod(description = "Переход на главную страницу регистрации")
    public void openPage() {
        ibRegistrationPageScreen = new IBRegistrationPageScreen();
        ibRegistrationPageScreen.openPageScreen();
    }

    @Test(description = "Тестирование кнопки 'РЕГИСТРАЦИЯ' на главной странице")
    public void ButtonRegistrationTest() {
        ibRegistrationPageScreen.clickRegistrationButton();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineText(), "Регистрация. Выбор версии", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование заголовка на странице 'Регистрация. Выбор версии'", priority = 1)
    public void HeaderTest() {
        ibRegistrationPageScreen.clickRegistrationButton();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineText(), "Регистрация. Выбор версии", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование сохранения состояния radio button на странице 'Регистрация. Выбор версии'", priority = 2)
    public void RadioButtonTest() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationRadioButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonBack();
        try {
            Assert.assertTrue(ibRegistrationPageScreen.getRadioButtonState(), "Состояние не сохранено");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'НАЗАД' на странице 'Регистрация. Выбор версии'", priority = 3)
    public void ButtonBackTest() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonBack();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineLoginText(), "Вход по логину и паролю", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'ДАЛЕЕ' на странице 'Регистрация. Выбор версии'", priority = 4)
    public void ButtonNextTest() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineStep1Text(), "Регистрация. Шаг 1 | Договор", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование заголовка на странице 'Регистрация. Шаг 1 | Договор'", priority = 5)
    public void HeaderPageStep1Test() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineStep1Text(), "Регистрация. Шаг 1 | Договор", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'Я НЕ СОГЛАСЕН (-А)' на странице 'Регистрация. Шаг 1 | Договор'", priority = 6)
    public void ButtonBackStep1Test() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonBack();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineText(), "Регистрация. Выбор версии", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'Я СОГЛАСЕН (-А)' на странице 'Регистрация. Шаг 1 | Договор'", priority = 7)
    public void ButtonNextStep1Test() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineStep2Text(), "Регистрация. Шаг 2 | Безопасность", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование заголовка на странице 'Регистрация. Шаг 2 | Безопасность'", priority = 8)
    public void HeaderPageStep2Test() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineStep2Text(), "Регистрация. Шаг 2 | Безопасность", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'ВЕРНУТЬСЯ' на странице 'Регистрация. Шаг 2 | Безопасность'", priority = 9)
    public void ButtonBackStep2Test() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep2ButtonBack();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineStep1Text(), "Регистрация. Шаг 1 | Договор", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'Я ОЗНАКОМИЛСЯ (-ЛАСЬ)' на странице 'Регистрация. Шаг 2 | Безопасность'", priority = 10)
    public void ButtonNextStep2Test() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep2ButtonNext();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineStep3Text(), "Регистрация. Шаг 3", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование заголовка на странице 'Регистрация. Шаг 3'", priority = 11)
    public void HeaderPageStep3Test() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep2ButtonNext();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineStep3Text(), "Регистрация. Шаг 3", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'ВЕРНУТЬСЯ' на странице 'Регистрация. Шаг 3'", priority = 12)
    public void ButtonBackStep3Test() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep2ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep3ButtonBack();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineStep2Text(), "Регистрация. Шаг 2 | Безопасность", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'Я ОЗНАКОМИЛСЯ (-ЛАСЬ)' на странице 'Регистрация. Шаг 3'", priority = 13)
    public void ButtonNextStep3Test() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep2ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep3ButtonNext();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineStep4Text(), "Регистрация. Шаг 4 | Выбор имени пользователя", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование заголовка на странице 'Регистрация. Шаг 4 | Выбор имени пользователя'", priority = 14)
    public void HeaderPageStep4Test() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep2ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep3ButtonNext();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getHeadlineStep4Text(), "Регистрация. Шаг 4 | Выбор имени пользователя", "Заголовки не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование кнопки 'Обновить' на странице 'Регистрация. Шаг 4 | Выбор имени пользователя'", priority = 15)
    public void ButtonUpdateStep4Test() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep2ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep3ButtonNext();
        String str = ibRegistrationPageScreen.getImageStep4Text();
        ibRegistrationPageScreen.clickRegistrationStep4ButtonUpdate();
        try {
            Assert.assertNotEquals(str, ibRegistrationPageScreen.getImageStep4Text(), "Картинка с кодом не изменилась");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование нажатия на кнопку 'ПРОДОЛЖИТЬ' при пустых полях 'Имя пользователя' и 'Код с картинки' на странице 'Регистрация. Шаг 4 | Выбор имени пользователя'", priority = 16)
    public void checkEmptyUserNameAndCodeTest() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep2ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep3ButtonNext();
        ibRegistrationPageScreen.clickRegistrationButtonContinue();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getTextError(), "Введите имя пользователя", "Сообщения не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование нажатия на кнопку 'ПРОДОЛЖИТЬ' пустом поле 'Код с картинки' на странице 'Регистрация. Шаг 4 | Выбор имени пользователя'", priority = 17)
    public void checkEmptyCodeTest() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep2ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep3ButtonNext();
        ibRegistrationPageScreen.inputUsername();
        ibRegistrationPageScreen.clickRegistrationButtonContinue();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getTextEmptyCodeError(), "Пожалуйста, введите цифры с картинки", "Сообщения не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование сообщения при вводе в поле 'Имя пользователя' менее 6 символов на странице 'Регистрация. Шаг 4 | Выбор имени пользователя'", priority = 18)
    public void checkUsernameIsLessThan6CharTest() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep2ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep3ButtonNext();
        ibRegistrationPageScreen.inputUsernameIsLessThan6Char();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getTextError(), "Длина имени пользователя должна составлять от 6 до 20 символов", "Сообщения не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование сообщения при вводе в поле 'Имя пользователя' спец. символов и пустом поле 'Код с картинки' на странице 'Регистрация. Шаг 4 | Выбор имени пользователя'", priority = 19)
    public void checkUsernameSpecialCharAndEmptyCodeTest() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep2ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep3ButtonNext();
        ibRegistrationPageScreen.inputUsernameSpecialChar();
        ibRegistrationPageScreen.clickRegistrationButtonContinue();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getTextError(), "В поле возможен ввод английских букв, цифр, символов \".\" и \"_\"", "Сообщения не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Тестирование сообщения при вводе в поле 'Имя пользователя' кириллицы на странице 'Регистрация. Шаг 4 | Выбор имени пользователя'", priority = 20)
    public void checkUsernameCyrillicCharTest() {
        ibRegistrationPageScreen.clickRegistrationButton();
        ibRegistrationPageScreen.clickRegistrationButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep1ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep2ButtonNext();
        ibRegistrationPageScreen.clickRegistrationStep3ButtonNext();
        ibRegistrationPageScreen.inputUsernameCyrillicChar();
        try {
            Assert.assertEquals(ibRegistrationPageScreen.getTextError(), "Верно заполните поле", "Сообщения не совпадают");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterMethod(description = "Выход из браузера. Закрытие драйвера")
    public void closeBrowser(){
        ibRegistrationPageScreen.mailCloseBrowser();
    }
}