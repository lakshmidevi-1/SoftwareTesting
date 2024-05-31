package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class lab16 {
    public static void main(String[] args) throws IOException {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://pastebin.com/login");
//        driver.findElement(By.id("id=\"loginform-username\"")).sendKeys("lakshmidevi");
//        driver.findElement(By.id("loginform-password")).sendKeys("Lakshmi@2003");
//        driver.findElement(By.className("btn -big")).submit();
//        driver.findElement(By.linkText("paste")).click();
//        driver.findElement(By.id("postform-text")).sendKeys("Hello from Webdriver");
//        driver.findElement(By.id("id=\"select2-postform-expiration-container\""));
//        driver.findElement(By.id("btn -big")).submit();
    }
}
