package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        //get geckodriver
        WebDriverManager.firefoxdriver().setup();
        //create object for firefox driver
        WebDriver driver = new FirefoxDriver();

        //open the page
        driver.get("https://v1.training-support.net/");

        String pageTitle = driver.getTitle();
        System.out.println("Home Page Title is:" + " " + pageTitle);
        Thread.sleep(2000);

        //find elements and interact
        WebElement element = driver.findElement(By.id("about-link"));
        element.click();
        Thread.sleep(2000);
        
        String newPageTitle = driver.getTitle();
        System.out.println("New Page Title is:" + " " + newPageTitle);

        //close browser
        driver.quit();
    }
}
