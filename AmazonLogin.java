package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Find element by id
public class AmazonLogin
{
    public static void main(String[] args)
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://lms.kluniversity.in/login/index.php");
        driver.findElement(By.id("username")).sendKeys("2100030748");
        driver.findElement(By.id("password")).sendKeys("Lakshmi*7");
        driver.findElement(By.id("loginbtn")).submit();
    }
}
