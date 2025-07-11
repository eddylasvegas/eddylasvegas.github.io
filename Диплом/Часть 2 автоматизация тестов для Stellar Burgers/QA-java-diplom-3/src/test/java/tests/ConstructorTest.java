package tests;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import utils.BrowserFactory;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.concurrent.TimeUnit;


import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class ConstructorTest {
    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp() {

        driver = BrowserFactory.getDriver(); // Браузер берется из config.properties

        mainPage = new MainPage(driver);
        mainPage.open();
    }

    @Test
    @DisplayName("Переход к разделу Соусы")
    @Description("Тест проверяет успешность перехода к разделу 'Соусы'")
    public void switchToSaucesSectionTest() {
        mainPage.clickSaucesSection();
        assertTrue("Вкладка Соусы не активна", mainPage.isSaucesActive());

    }

    @Test
    @DisplayName("Переход к разделу Начинки")
    @Description("Тест проверяет успешность перехода к разделу 'Начинки'")
    public void switchToFillingsSectionTest() {
        mainPage.clickFillingsSection();
        assertTrue("Вкладка Начинки не активна", mainPage.isFillingsActive());

    }

    @Test
    @DisplayName("Переход к разделу Булки")
    @Description("Тест проверяет успешность перехода к разделу Булки после переключения")
    public void switchToBunsSectionTest() {
        // Проверяем, что булки активны по умолчанию
        assertTrue("Вкладка Булки не активна по умолчанию", mainPage.isBunsActiveByDefault());

        // Переключаемся на начинки
        mainPage.clickFillingsSection();
        assertTrue("Вкладка Начинки не активна", mainPage.isFillingsActive());

        // Возвращаемся к булкам
        mainPage.clickBunsSection();
        assertTrue("Вкладка Булки не активна после переключения", mainPage.isBunsActive());

    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}