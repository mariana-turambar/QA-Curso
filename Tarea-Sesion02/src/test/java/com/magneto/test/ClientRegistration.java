package com.magneto.test;

import com.magneto.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClientRegistration extends BaseTest {

    @Test
    public void clientRegistration(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/fieldset[1]/div[1]/div/input")).sendKeys("Mariana");
        driver.findElement(By.name("lastname")).sendKeys("Sanchez");
        driver.findElement(By.id("email_address")).sendKeys("marianaprime47@gmail.com");
        driver.findElement(By.name("password")).sendKeys("w8G4v[4*0?Wy");
        driver.findElement(By.name("password_confirmation")).sendKeys("w8G4v[4*0?Wy");
        driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button")).click();
    }
}
