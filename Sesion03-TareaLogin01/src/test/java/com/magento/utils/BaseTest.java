package com.magento.utils;
import com.magento.pages.LoginPage;
import com.magento.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    protected RegisterPage registerPage;
    protected LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver(); // instanciando objeto driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(com.magento.utils.Variables.TIME_OUT));
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(1200,740));
        driver.get(com.magento.utils.Variables.BASE_URL);
        //pasando la instancia de driver creada en la linea 19 al POM
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            // driver.quit();
        }
    }
}