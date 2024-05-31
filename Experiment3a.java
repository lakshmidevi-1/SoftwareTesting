package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Scrolling
public class Experiment3a
{
    public static void main(String[] args)
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
        driver.findElement(By.id("nav-search-submit-button")).submit();
        String ProductPageUrl = driver.getCurrentUrl();
        if(ProductPageUrl.contains("mobiles"))
        {
            System.out.println("Product is valid");
        }
        else
        {
            System.out.println("Product Not found");
        }
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Amazon miniTv");
        driver.findElement(By.id("nav-search-submit-button")).submit();
        String PageTitle =driver.getTitle();
        System.out.println(driver.getTitle());
        if(PageTitle.contains("Amazon miniTv"))
        {
            System.out.println("showing products in the categoery");
        }
        else
        {
            System.out.println("no products found");
        }
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000);");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("window.scrollBy(0,-2000);");
    }
}
