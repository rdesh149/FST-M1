package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/ajax");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick = 'loadText()']"));
        button1.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement text1 = driver.findElement(By.tagName("h1"));
        wait.until(ExpectedConditions.visibilityOf(text1));
        System.out.println("Text is:" + " " + text1.getText());

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        WebElement text2 = driver.findElement(By.tagName("h3"));
        System.out.println("Text is:" + " " + text2.getText());

        driver.quit();
    }
}
