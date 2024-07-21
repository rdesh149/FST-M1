package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement textBox = driver.findElement(By.id("input-text"));
        System.out.println("Textbox is enabled or not:" + textBox.isEnabled());

        WebElement enableButton = driver.findElement(By.id("toggleInput"));
        Actions builder = new Actions(driver);
        builder.click(enableButton).pause(1000).build().perform();
        System.out.println("Textbox is enabled or not:" + textBox.isEnabled());

        driver.quit();

    }
}
