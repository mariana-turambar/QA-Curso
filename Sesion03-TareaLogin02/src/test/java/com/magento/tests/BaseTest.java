package com.magento.tests;

import com.magento.pages.HomePage;
import com.magento.pages.LoginPage;
import com.magento.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected RegisterPage registerPage;
    protected LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
         //   driver.quit();
        }
    }
}