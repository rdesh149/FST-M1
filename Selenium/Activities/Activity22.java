package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity22 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://v1.training-support.net/selenium/popups");
        System.out.println("Page Title is:" + driver.getTitle());

        WebElement signUpButton = driver.findElement(By.className("orange"));
        Actions builder = new Actions(driver);
        builder.moveToElement(signUpButton).pause(1000).build().perform();

        String tooltipMessage = signUpButton.getAttribute("data-tooltip");
        System.out.println(tooltipMessage);
        signUpButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("dynamic-attributes-form")));

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("admin");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");

        WebElement loginButton = driver.findElement(By.xpath("//button[@onclick = 'signIn()']"));
        loginButton.click();

        WebElement confirmMessage = driver.findElement(By.id("action-confirmation"));
        wait.until(ExpectedConditions.visibilityOf(confirmMessage));
        System.out.println(confirmMessage.getText());

        driver.quit();
    }
}
