package com.magento.tests;

import com.magento.pages.HomePage;
import com.magento.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void LogInUserAlreadyExists (){
        homePage.goToSignInLink();
        loginPage.fillOutLoginForm();
        loginPage.submitLogin();
    }
}
