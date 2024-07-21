package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Page Title is:" + " " + driver.getTitle());

        WebElement element1 = driver.findElement(By.id("D3Cube"));
        String frontText = driver.findElement(By.className("active")).getText();
        System.out.println("Page Title is:" + " " + frontText);
        Actions builder = new Actions(driver);
        builder.click(element1).pause(2000).build().perform();
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println("Page Title is:" + " " + frontText);

        WebElement element2 = driver.findElement(By.id("D3Cube"));
        builder.doubleClick(element2).pause(2000).build().perform();
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println("Page Title is:" + " " + frontText);

        WebElement element3 = driver.findElement(By.id("D3Cube"));
        builder.contextClick(element3).pause(2000).build().perform();
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println("Page Title is:" + " " + frontText);

        driver.quit();

    }
}
