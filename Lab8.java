package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//Page Title ,Page Url
public class Lab8 {
    public static void main(String args[])
    {

        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.amazon.in");
        String PageTitle =driver.getTitle();
        System.out.println("Page Title:"+PageTitle);
        String PageUrl = driver.getCurrentUrl();
        System.out.println(PageUrl);
    }
}
