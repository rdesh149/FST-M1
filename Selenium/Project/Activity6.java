import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity6 extends BaseClass{
    @Test
    public void activitiesMenu(){

        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='bigbutton']")).click();

        WebElement menu=driver.findElement(By.xpath("//a[@id='grouptab_3']"));
        wait.until(ExpectedConditions.elementToBeClickable(menu));
        String expected= menu.getText();
        System.out.println("Menu title: "+expected);
        String actual="ACTIVITIES";
        Assert.assertEquals(expected,actual);

    }
}
