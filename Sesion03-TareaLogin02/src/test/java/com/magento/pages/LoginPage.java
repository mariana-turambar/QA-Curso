package com.magento.pages;

import com.magento.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    By email = By.xpath("//*[@id=\"email\"]");
    By pass = By.id("pass");
    By linkSignIn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");

    //// click the Sign in button
    By SignInButton = By.id("send2");




    //fills out the login form
    public void fillOutLoginForm () {

        type(email, "predito@gmail.com");
        type(pass, "P3dro021#");
    }

    public void submitLogin (){
        click(SignInButton);
    }


}