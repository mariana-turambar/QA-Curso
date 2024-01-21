package com.magento.pages;

import com.magento.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    WebDriver driver;

    /*
     *Web Elements
     * */
    By linkSingIn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");;
    By linkAccount = By.linkText("Create an Account");


    /*
     *Constructor
     * */
    public HomePage(WebDriver driver) {
        super(driver);
        visit(Variables.BASE_URL);
    }


    /*
     *Methods
     * */
    public void goToRegisterLink() {
        click(linkAccount);
    }

    public void goToSignInLink () {
        click(linkSingIn);
    }

    public String verifyTitle () {
        return null;
    }


}