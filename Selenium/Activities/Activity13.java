package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println("Page Title is:" + driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
        System.out.println("Number of Rows are:" + rows.size());

        List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
        System.out.println("Number of Columns are:" + columns.size());

        List<WebElement> cellValue1 = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
        for(WebElement thirdRow: cellValue1)
            System.out.println("Cell values in the third row of the table:" + thirdRow.getText());

        List<WebElement> cellValue2 = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));
        for(WebElement secondRow: cellValue2)
            System.out.println("Cell value at the second row second column:" + secondRow.getText());

        driver.quit();
    }
}
