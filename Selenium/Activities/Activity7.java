package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement position1 = driver.findElement(By.id("droppable"));
        WebElement position2 = driver.findElement(By.id("dropzone2"));

        Actions builder = new Actions(driver);
        builder.dragAndDrop(ball,position1).pause(1000).build().perform();

        String text1 = driver.findElement(By.tagName("p")).getText();
        if(text1.equals("Dropped!")){
            System.out.println("Ball is dropped at Dropzone1");
        }

        builder.dragAndDrop(ball,position2).pause(1000).build().perform();

        String text2 = driver.findElement(By.tagName("p")).getText();
        if(text2.equals("Dropped!")){
            System.out.println("Ball is dropped at Dropzone2");
        }

        driver.quit();

    }
}
