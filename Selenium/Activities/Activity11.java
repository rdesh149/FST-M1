package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity11 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.name("toggled"));
        System.out.println("Checkbox is selected: " + checkbox.isSelected());

        Actions builder = new Actions(driver);
        builder.click(checkbox).pause(1000).build().perform();
        System.out.println("Checkbox is selected: " + checkbox.isSelected());

        driver.quit();
    }
}

