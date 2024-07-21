package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/login-form");

        String loginPageTitle = driver.getTitle();
        System.out.println("Login Page Title is:" + " " + loginPageTitle);

        WebElement username = driver.findElement(By.xpath("//input[@id = 'username']"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//input[@id = 'password']"));
        password.sendKeys("password");

        WebElement loginButton = driver.findElement(By.xpath("//button[@onclick = 'signIn()']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement confirmLogin = driver.findElement(By.id("action-confirmation"));
        String message = confirmLogin.getText();
        System.out.println("Login Confirmation Message:" + " " + message);
        Thread.sleep(2000);

        driver.quit();
    }
}
