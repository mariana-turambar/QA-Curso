package com.magento.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    /*
     *Web Elements
     * */
    By linkRegister = By.linkText("Create an Account");
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
        this.driver = driver;
    }

    /*
     *Methods, functions
     * */
    public void fillOutForm() {
        driver.findElement(fname).sendKeys("Pedro");
        driver.findElement(lname).sendKeys("Perico");
        driver.findElement(email).sendKeys("predito@gmail.com");
        driver.findElement(pass).sendKeys("P3dro021#");
        driver.findElement(rePass).sendKeys("P3dro021#");
    }

    public void fillOutFormWithFakeData(String sFname, String sLname, String sEmail, String sPass) {
        driver.findElement(fname).sendKeys(sFname);
        driver.findElement(lname).sendKeys(sLname);
        driver.findElement(email).sendKeys(sEmail);
        driver.findElement(pass).sendKeys(sPass);
        driver.findElement(rePass).sendKeys(sPass);
    }

    public void goToRegisterLink(){
        driver.findElement(linkRegister).click();
    }

    public void submitData(){
        driver.findElement(btnRegister).submit();
    }
}