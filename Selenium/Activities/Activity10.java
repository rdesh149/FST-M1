package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.name("toggled"));

        if(checkbox.isDisplayed())
            System.out.println("checkbox is present");

        WebElement removeButton = driver.findElement(By.id("toggleCheckbox"));
        Actions builder = new Actions(driver);
        builder.click(removeButton).pause(1000).build().perform();

        if(checkbox.isDisplayed())
            System.out.println("checkbox is still present");
        else
            System.out.println("checkbox is not present anymore");

        driver.quit();
    }
}
