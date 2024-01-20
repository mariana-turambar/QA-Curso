package com.magento.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    WebDriver driver;
    //clicks in the sign in text
    By linkSignIn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");

    ///email and password needed for the login
    By email = By.id("email");
    By pass = By.id("pass");

    //// click the Sign in button
    By SignInButton = By.id("send2");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    /// this method clicks the sign in text
    public void clickSignInButton(){
        driver.findElement(linkSignIn).click();
    }

    /// this method fills customer login
    public void costumerLogin() {
        //log in with this user already exist
        driver.findElement(email).sendKeys("predito@gmail.com");
        driver.findElement(pass).sendKeys("P3dro021#");
    }

    public void summitButton(){
        driver.findElement(SignInButton).submit();
    }

}
