package com.magento.tests;
import com.magento.utils.BaseTest;
import com.magento.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void LogInUserAlreadyExists() {

        String expected_message="Change";

        loginPage.clickSignInButton();
        loginPage.costumerLogin();
        loginPage.summitButton();

        ///asertion del correcto login
        WebElement msg = new WebDriverWait(driver, Duration.ofSeconds(Variables.TIME_OUT))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='customer-welcome']")));

        //assertion
        Assert.assertEquals(msg.getText(), expected_message);


    }
}

