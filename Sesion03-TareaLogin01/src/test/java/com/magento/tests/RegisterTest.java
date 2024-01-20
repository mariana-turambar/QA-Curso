package com.magento.tests;
import com.github.javafaker.Faker;
import com.magento.utils.BaseTest;
import com.magento.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Locale;

public class RegisterTest extends BaseTest {

    Faker faker = new Faker(new Locale("en-US"));

    @Test
    public void registerNewAccountWithRequiredInformation() {

        String expected_message = "Account Information";

        String email = faker.internet().emailAddress();
        String password = faker.internet().password(8, 10, true, true, true);
        //go to register page
        registerPage.goToRegisterLink();

        //fills the form with fakedata
        registerPage.fillOutFormWithFakeData(faker.name().firstName(), faker.name().lastName(), email, password);
        //submit information
        registerPage.submitData();


        //espera por un elemento que contenga el xpath y texto "Account Information"
        WebElement msg = new WebDriverWait(driver, Duration.ofSeconds(Variables.TIME_OUT))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[1]/strong")));

        System.out.println("Email is:" + email + " Password is: " + password);
        //assertion
        Assert.assertEquals(msg.getText(), expected_message);


    }
}