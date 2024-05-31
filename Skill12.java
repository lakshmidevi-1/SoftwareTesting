package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Skill12 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.browserstack.com/users/sign_in");
        driver.findElement(By.id("user_email_login")).sendKeys("2100030748@kluniversity.in");
        driver.findElement(By.id("user_password")).sendKeys("Lakshmi@2003");
        driver.findElement(By.id("user_submit")).submit();
        Thread.sleep(9000);
        driver.get("https://www.browserstack.com/users/sign_out");
        Thread.sleep(7000);
        driver.quit();
    }
}
