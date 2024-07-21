package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity16 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Page Title is:" + driver.getTitle());

        WebElement userName = driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
        userName.sendKeys("admin");

        WebElement passWord = driver.findElement(By.xpath("//input[contains  (@class,'-password')]"));
        passWord.sendKeys("password");

        WebElement passwordAgain = driver.findElement(By.xpath("//label[text()='Confirm Password']/following-sibling::input"));
        passwordAgain.sendKeys("password");

        WebElement emailId = driver.findElement(By.xpath("//input[starts-with(@class,'email-')]"));
        emailId.sendKeys("sanchari.gmail.com");

        WebElement signUpButton = driver.findElement(By.xpath("//button[@onclick = 'signUp()']"));
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        signUpButton.click();

        WebElement confirmMessage = driver.findElement(By.id("action-confirmation"));
        System.out.println("Confirmation Message:" + confirmMessage.getText());

        driver.quit();
    }
}