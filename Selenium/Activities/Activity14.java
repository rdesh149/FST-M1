package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity14 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println("Page Title is:" + driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of Rows are:" + rows.size());

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of Columns are:" + columns.size());

        WebElement cellValue1 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Cell value at the second row second column:" + cellValue1.getText());

        WebElement header = driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr[1]/th"));
        header.click();

        WebElement sortedCellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Cell value at the second row second column after Sorting:" + sortedCellValue.getText());

        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
        for(WebElement footerHeaders: footer)
            System.out.println("cell values of the table footer:" + footerHeaders.getText());

        driver.quit();
    }
}
