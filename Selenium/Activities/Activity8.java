package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //Get the URL and print it
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Page Title is:" + " " + driver.getTitle());

        //Dynamic Checkbox
        WebElement button1 = driver.findElement(By.id("toggleCheckbox"));
        button1.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //Checkbox button
        WebElement checkbox = driver.findElement(By.id("dynamicCheckbox"));
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        System.out.println("Is checkbox displayed?" + " " +checkbox.isDisplayed());

        //Remove Checkbox
        button1.click();
        System.out.println("Is checkbox displayed?" + " " +checkbox.isDisplayed());

        //Close the browser
        driver.quit();
    }
}
