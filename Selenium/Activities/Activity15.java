package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Page Title is:" + driver.getTitle());

        WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]"));
        userName.sendKeys("admin");

        WebElement passWord = driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]"));
        passWord.sendKeys("password");

        WebElement loginButton = driver.findElement(By.xpath("//button[@onclick = 'signIn()']"));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();

        WebElement confirmMessage = driver.findElement(By.id("action-confirmation"));
        System.out.println("Confirmation Message:" + confirmMessage.getText());

        driver.quit();
    }
}
