package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//URL Opening
public class OpenURL
{
    public static void main(String[] args)
    {
        System.out.println("Hola");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://www.gmail.com");
        //driver.quit();
    }
}
