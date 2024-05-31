package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DemoCheckBox {
    @Test
    public void test() {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        // driver.get("https://github.com/login");
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        /* Validate isSelected and click
         */

        WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isSelected = checkBoxSelected.isSelected();
        // performing click operation if element is not selected
        if (isSelected == false) {
            checkBoxSelected.click();
        }


        /* Validate isDisplayed and click
         */
        WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isDisplayed = checkBoxDisplayed.isDisplayed();
        // performing click operation if element is displayed
        if (isDisplayed == true) {
            checkBoxDisplayed.click();
        }
        /**
         * Validate isEnabled and click
         */
        WebElement checkBoxEnabled = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isEnabled = checkBoxEnabled.isEnabled();

        // performing click operation if element is enabled
        if (isEnabled == true) {
            checkBoxEnabled.click();
        }
    }
}
