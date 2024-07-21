package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {

        /** Steps:
        Get the WebDriver
        Create the driver object
        Open the page
        Print the title of the page
        Perform the actions
        Close the browser
         **/

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");

        String title = driver.getTitle();
        System.out.println("Title of the page:" + " " + title);

//        WebElement thirdElement = driver.findElement(By.xpath("//h3[@id = 'third-header']"));
//        String thirdText = thirdElement.getText();
//        System.out.println("Desired text is:" + " " + thirdText);

        String thirdText = driver.findElement(By.xpath("//h3[@id = 'third-header']")).getText();
        System.out.println("Desired text is:" + " " + thirdText);

        String fifthColor = driver.findElement(By.xpath("//h5[text() = 'Fifth header']")).getCssValue("color");
        System.out.println("Color of the Fifth Heading is:" + " " + fifthColor);

        String violetClass = driver.findElement(By.cssSelector("button.ui.violet.button")).getAttribute("class");
        System.out.println("Classes of the Violet Button are:" + " " + violetClass);

        String text = driver.findElement(By.cssSelector("button.ui.grey.button")).getText();
        System.out.println("Text inside Grey Button is:" + " " + text);

        driver.quit();

    }
}
