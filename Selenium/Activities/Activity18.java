package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity18 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Page Title is:" + driver.getTitle());

        WebElement multiSelect = driver.findElement(By.id("multi-select"));
        Select list = new Select(multiSelect);
        list.selectByVisibleText("Javascript");
        System.out.println("First selected option is:" + list.getFirstSelectedOption().getText());

        for(int i=4;i<=6;i++){
            list.selectByIndex(i);
        }

//        list.selectByIndex(4);
//        System.out.println("Second selected option is:" + list.getFirstSelectedOption().getText());
//        list.selectByIndex(5);
//        System.out.println("Third selected option is:" + list.getFirstSelectedOption().getText());
//        list.selectByIndex(6);

        System.out.println("Fourth selected option is:" + list.getFirstSelectedOption().getText());
        list.selectByValue("node");
        list.deselectByIndex(5);
        List<WebElement> selectedOptions = list.getAllSelectedOptions();
        for(WebElement option : selectedOptions){
            System.out.println("All selected option is:" + option.getText());
        }

        driver.quit();

    }

}
