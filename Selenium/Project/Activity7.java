import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.SocketHandler;

public class Activity7 extends BaseClass{

    @Test
    public void additionalInfo() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
        driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebElement iframe=driver.findElement(By.xpath("//iframe[@id='_yuiResizeMonitor']"));
       // driver.switchTo().frame(iframe);
       // String parent=driver.getWindowHandle();
        WebElement info=driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr[1]/td[last()]//span[@class='suitepicon suitepicon-action-info']"));
       wait.until(ExpectedConditions.elementToBeClickable(info));
        info.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.switchTo().activeElement();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='dialog']")));
      WebElement modalContainer=driver.findElement(By.xpath("//div[@role='dialog']"));
       WebElement modalContentBody=modalContainer.findElement(By.xpath("//span[@class='phone']"));
       String phone=modalContentBody.getText();
        System.out.println("Mobile: "+phone);

    }
}
