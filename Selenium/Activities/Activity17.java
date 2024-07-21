package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity17 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Page Title is:" + driver.getTitle());

        WebElement dropDown = driver.findElement(By.id("single-select"));
        Select list = new Select(dropDown);
        list.selectByVisibleText("Option 2");
        System.out.println("First selected option is:" + list.getFirstSelectedOption().getText());
        list.selectByIndex(3);
        System.out.println("Second selected option is:" + list.getFirstSelectedOption().getText());
        list.selectByValue("4");
        System.out.println("Third selected option is:" + list.getFirstSelectedOption().getText());

        List<WebElement> allOptions = list.getOptions();
        for(WebElement option : allOptions){
            System.out.println("All selected option is:" + option.getText());
        }

        driver.quit();

    }
}
