package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    WebDriver driver;
    /*
     *Web Elements
     * */
    By fname = By.id("firstname");
    By lname = By.id("lastname");
    By email = By.id("email_address");
    By pass = By.id("password");
    By rePass = By.id("password-confirmation");
    By btnRegister = By.xpath("//*[@id='form-validate']/div/div[1]/button/span");

    /*
     *Constructor
     * */
    public RegisterPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    /*
     *Methods, functions
     * */

    public void fillOutFormWithFakeData(String sFname, String sLname, String sEmail, String sPass) {
        type(fname, sFname);
        type(lname, sLname);
        type(email, sEmail);
        type(pass, sPass);
        type(rePass, sPass);
    }

    public void submitData() {
        click(btnRegister);
    }
}