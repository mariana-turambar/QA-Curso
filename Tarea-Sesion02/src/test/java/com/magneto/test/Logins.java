package com.magneto.test;

import com.magneto.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logins extends BaseTest {

    @Test
    public void Login() {
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
        driver.findElement(By.id("email")).sendKeys("marianaprime47@gmail.com");
        driver.findElement(By.name("login[password]")).sendKeys("w8G4v[4*0?Wy");
        driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button")).click();
        //logout
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
    }
}
