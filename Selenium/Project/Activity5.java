import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity5 extends BaseClass{
    @Test
    public void navigationColor(){
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
        WebElement pane=driver.findElement(By.xpath("//div[@id='ajaxHeader']/nav[@role='navigation']"));
        wait.until(ExpectedConditions.visibilityOf(pane));
        String color=pane.getCssValue("color");
        System.out.println("Color code of the navigation pane is: "+color);
        String c= Color.fromString(color).asHex();
        System.out.println("Hex format color of the navigation pane: "+c);

    }
}
