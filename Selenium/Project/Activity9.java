import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Activity9 extends BaseClass {

    @Test
    public void travColumns() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
        driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        for(int i=1;i<=10;i++){
            WebElement name = driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr["+i+"]/td[3]//a"));
            System.out.println("Name: "+name.getAccessibleName());
            WebElement user = driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr["+i+"]/td[8]//a"));
            System.out.println("User: "+user.getAccessibleName());
        }


      //  WebElement info = driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr[1]/td[3]//a"));

    }
}