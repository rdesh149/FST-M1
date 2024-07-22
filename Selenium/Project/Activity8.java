import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity8 extends BaseClass {
    @Test
    public void travTables() {

        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
        driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement odd1 = driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr[1]/td[3]//a"));
        String oddName1 = odd1.getAccessibleName();
        System.out.println("1st row name: "+oddName1);

        String oddName3=driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr[3]/td[3]//a")).getAccessibleName();
        System.out.println("3rd row name: "+oddName3);
        String oddName5=driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr[5]/td[3]//a")).getAccessibleName();
        System.out.println("5th row name: "+oddName5);
        String oddName7=driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr[7]/td[3]//a")).getAccessibleName();
        System.out.println("7th row name: "+oddName7);
        String oddName9=driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr[9]/td[3]//a")).getAccessibleName();
        System.out.println("9th row name: "+oddName9);
    }
}