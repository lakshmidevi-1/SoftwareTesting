package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;

public class MultipleDropDown {
    public static void main(String[] args) throws Exception {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(2000);
        //MULTIPLE SELECTION DROP DOWN EXAMPLE
        WebElement ideElement = driver.findElement(By.id("ide"));
        Select ideDropDown = new Select(ideElement);
        List<WebElement> ideDropDownOptions = ideDropDown.getOptions();
        for (WebElement option : ideDropDownOptions) {
            System.out.println(option.getText());
        }
        ideDropDown.selectByIndex(0);
        ideDropDown.selectByValue("ij");
        ideDropDown.selectByVisibleText("NetBeans");
        ideDropDown.deselectByVisibleText("IntelliJ IDEA");
        List<WebElement> selectedOptions = ideDropDown.getAllSelectedOptions();
        for (WebElement selectedOption : selectedOptions) {
            System.out.println("selected visible text---" + selectedOption.getText());
        }
        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screenshots/Multdropdown.png"));
    }

}
